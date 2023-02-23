/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.TaiSanController;

import Bean.TaiSanBean;
import models.TaiSanModel;
import java.sql.*;
import services.MysqlConnection;

/**
 *
 * @author Thanh.ND200592
 */
public class EditTaiSanController {
    public boolean editTaiSan(TaiSanBean taiSanBean) throws SQLException, ClassNotFoundException {
        TaiSanModel taiSan = taiSanBean.getTaiSanModel();
        Connection connection = MysqlConnection.getMysqlConnection();
        String query = "UPDATE tai_san SET TenTaiSan = ?, SoLuong = ?,SoLuongConLai = ? WHERE ID = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                preparedStatement.setInt(4, taiSan.getID());
        preparedStatement.setString(1, taiSan.getTenTaiSan());
        preparedStatement.setInt(2, taiSan.getSoLuong());
        preparedStatement.setInt(3, taiSan.getSoLuongHienCo());
        preparedStatement.executeUpdate();
        connection.close();
        return true;
    }
}
