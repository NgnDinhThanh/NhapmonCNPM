/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;


import javax.swing.JLabel;
import java.sql.*;
import services.MysqlConnection;

/**
 *
 * @author Thanh.ND200592
 */
public class Home2Controller {
    private JLabel tongTaiSanLb;
    private JLabel tongPhongBanLb;
    private JLabel tongHoatDongLb;

    public Home2Controller(JLabel tongTaiSanLb, JLabel tongPhongBan, JLabel hoatDongLb) {
        this.tongTaiSanLb = tongTaiSanLb;
        this.tongPhongBanLb = tongPhongBan;
        this.tongHoatDongLb = hoatDongLb;
    }
    
    public void setData() {
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT COUNT(*) AS tong FROM tai_san";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                this.tongTaiSanLb.setText(String.valueOf(rs.getInt("tong")));
            }
            preparedStatement.close();
            
            query = "SELECT COUNT(*) AS tong FROM phong_ban";
            preparedStatement = connection.prepareStatement(query);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                this.tongPhongBanLb.setText(String.valueOf(rs.getInt("tong")));
            }
            preparedStatement.close();
            
            query = "SELECT COUNT(*) AS tong FROM hoat_dong WHERE DenNgay < NOW()";
            preparedStatement = connection.prepareStatement(query);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                this.tongHoatDongLb.setText(String.valueOf(rs.getInt("tong")));
            }
            preparedStatement.close();
            
            
            
            connection.close();
        } catch (Exception e) {
        }
    }

    public JLabel getTongTaiSanLb() {
        return tongTaiSanLb;
    }

    public void setTongTaiSanLb(JLabel tongTaiSanLb) {
        this.tongTaiSanLb = tongTaiSanLb;
    }

    public JLabel getTongPhongBanLb() {
        return tongPhongBanLb;
    }

    public void setTongPhongBanLb(JLabel tongPhongBanLb) {
        this.tongPhongBanLb = tongPhongBanLb;
    }

    public JLabel getTongHoatDongLb() {
        return tongHoatDongLb;
    }

    public void setTongHoatDongLb(JLabel tongHoatDongLb) {
        this.tongHoatDongLb = tongHoatDongLb;
    }

    
    
    
    
}
