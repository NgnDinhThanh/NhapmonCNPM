/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.TaiSanController;

import java.sql.*;
import services.MysqlConnection;

/**
 *
 * @author Thanh.ND200592
 */
public class DeleteTaiSanController {

    public boolean deleteTaisan(int id) throws SQLException, ClassNotFoundException {
        Connection connection = MysqlConnection.getMysqlConnection();
        String query = "DELETE FROM tai_san WHERE ID = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
        connection.close();
        return true;

    }
}
