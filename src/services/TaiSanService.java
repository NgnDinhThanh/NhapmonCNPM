/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import Bean.TaiSanBean;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import javax.swing.JOptionPane;
import models.TaiSanModel;

/**
 *
 * @author Thanh.ND200592
 */
public class TaiSanService {
    public List<TaiSanBean> getListTaiSan() {
        List<TaiSanBean> list = new ArrayList<>();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT * FROM tai_san ORDER BY ID DESC LIMIT 0, 10";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                TaiSanBean taiSanBean = new TaiSanBean();
                TaiSanModel taiSan = taiSanBean.getTaiSanModel();
                taiSan.setID(rs.getInt("ID"));
                taiSan.setTenTaiSan(rs.getString("TenTaiSan"));
                taiSan.setSoLuong(rs.getInt("SoLuong"));
                taiSan.setSoLuongHienCo(rs.getInt("SoLuongConLai"));
                list.add(taiSanBean);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public  List<TaiSanBean> search(String keyword) {
        List<TaiSanBean> list = new ArrayList<>();
        String query = null;
        if (keyword.trim().isEmpty()) {
            return this.getListTaiSan();
        }
        
        try {
            query = "SELECT * FROM tai_san WHERE TenTaiSan LIKE '"+keyword+"'";
        } catch (Exception e) {
        }
        
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                TaiSanBean temp = new TaiSanBean();
                TaiSanModel taiSan = temp.getTaiSanModel();
                taiSan.setID(rs.getInt("ID"));
                taiSan.setTenTaiSan(rs.getString("TenTaiSan"));
                taiSan.setSoLuong(rs.getInt("SoLuong"));
                taiSan.setSoLuongHienCo(rs.getInt("SoLuongConLai"));
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
