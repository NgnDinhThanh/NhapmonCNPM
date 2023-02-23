/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.HoatDongController;

import Bean.HoatDongBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import models.MuonTaiSanModel;
import services.MysqlConnection;

/**
 *
 * @author Thanh.ND200592
 */
public class MuonTaiSanController {

    public boolean muonTaiSan(MuonTaiSanModel muon) {
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "INSERT INTO muon_taisan(ID_HoatDong, ID_TaiSan, TenTaiSan, SoLuongMuon) VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, muon.getIdHoatDong());
            preparedStatement.setInt(2, muon.getIdTaiSan());
            preparedStatement.setString(3, muon.getTenTaiSan());
            preparedStatement.setInt(4, muon.getSoLuongMuon());
            preparedStatement.executeUpdate();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return true;
    }

}
