/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.HoatDongController;

import java.sql.*;
import models.MuonPhongBan;
import services.MysqlConnection;

/**
 *
 * @author Thanh.ND200592
 */
public class MuonPhongBanController {

    public boolean muonPhongBan(MuonPhongBan phongban) {
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "INSERT INTO muon_phongban(ID_HoatDong, SoPhong, Tang, TenPhong) VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, phongban.getIdHoatDong());
            preparedStatement.setInt(2, phongban.getSoPhong());
            preparedStatement.setInt(3, phongban.getTang());
            preparedStatement.setString(4, phongban.getTenPhong());
            preparedStatement.executeUpdate();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;

    }

}
