/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import Bean.HoatDongBean;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.HoatDongModel;
import models.MuonPhongBan;
import models.MuonTaiSanModel;

/**
 *
 * @author Thanh.ND200592
 */
public class HoatDongService {

    

    public List<HoatDongBean> getListHoatDong() {
        List<HoatDongBean> list = new ArrayList<>();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT * FROM hoat_dong ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                HoatDongBean hoatDongBean = new HoatDongBean();
                HoatDongModel hoatDong = hoatDongBean.getHoatDongModel();
                hoatDong.setID(rs.getInt("ID"));
                hoatDong.setTenHoatDong(rs.getString("TenHoatDong"));
                hoatDong.setTuNgay(rs.getDate("TuNgay"));
                hoatDong.setDenNgay(rs.getDate("DenNgay"));
                hoatDong.setTrangThai(rs.getString("TrangThai"));
                list.add(hoatDongBean);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public List<HoatDongBean> search(String keyword) {
        List<HoatDongBean> list = new ArrayList<>();
        String query = null;
        if (keyword.trim().isEmpty()) {
            return this.getListHoatDong();
        }
        try {
            query = "SELECT * FROM hoat_dong WHERE TenHoatDong LIKE'" + keyword + "'";

        } catch (Exception e) {
        }
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                HoatDongBean temp = new HoatDongBean();
                HoatDongModel hoatDong = temp.getHoatDongModel();
                hoatDong.setID(rs.getInt("ID"));
                hoatDong.setTenHoatDong(rs.getString("TenHoatDong"));
                hoatDong.setTuNgay(rs.getDate("TuNgay"));
                hoatDong.setDenNgay(rs.getDate("DenNgay"));
                hoatDong.setTrangThai(rs.getString("TrangThai"));
                list.add(temp);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception mysqlException) {
            this.exceptionHandle(mysqlException.getMessage());
        }
        return list;
    }

    private void exceptionHandle(String message) {
        JOptionPane.showMessageDialog(null, message, "Warning", JOptionPane.ERROR_MESSAGE);
    }
}
