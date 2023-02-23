/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import Bean.PhongBanBean;
import Bean.TaiSanBean;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.PhongBanModel;
import models.TaiSanModel;

/**
 *
 * @author Thanh.ND200592
 */
public class PhongBanService {
    public List<PhongBanBean> getListPhongBan() {
        List<PhongBanBean> list = new ArrayList<>();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT * FROM phong_ban ORDER BY SoPhong DESC";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                PhongBanBean phongBanBean = new PhongBanBean();
                PhongBanModel phongBan = phongBanBean.getPhongBanModel();
                phongBan.setSoPhong(rs.getInt("SoPhong"));
                phongBan.setTang(rs.getInt("Tang"));
                phongBan.setTenPhong(rs.getString("TenPhong"));
                phongBan.setTrangThai(rs.getString("TrangThai"));
                list.add(phongBanBean);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
        public  List<PhongBanBean> search(String keyword) {
        List<PhongBanBean> list = new ArrayList<>();
        String query = null;
        if (keyword.trim().isEmpty()) {
            return this.getListPhongBan();
        }
        
        try {
            query = "SELECT * FROM phong_ban WHERE TenPhong LIKE '"+keyword+"'";
        } catch (Exception e) {
        }
        
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                PhongBanBean temp = new PhongBanBean();
                PhongBanModel phongBan = temp.getPhongBanModel();
                phongBan.setSoPhong(rs.getInt("SoPhong"));
                phongBan.setTang(rs.getInt("Tang"));
                phongBan.setTenPhong(rs.getString("TenPhong"));
                phongBan.setTrangThai(rs.getString("TrangThai"));
                list.add(temp);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception mysqlException) {
            this.exceptionHandle(mysqlException.getMessage());
        }
        return list;
    }
    
    private void exceptionHandle(String massage) {
        JOptionPane.showMessageDialog(null, massage, "Warning", JOptionPane.ERROR_MESSAGE);
    }
    
}
