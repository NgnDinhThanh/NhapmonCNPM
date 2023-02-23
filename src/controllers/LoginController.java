
package controllers;

import models.UserModel;
import java.sql.*;
import services.MysqlConnection;

/**
 *
 * @author Thanh.ND200592
 */
public class LoginController {
    public static UserModel currentUser = new UserModel();
    
    public boolean  login (String userName, String passwod) throws SQLException, ClassNotFoundException {
        Connection connection = MysqlConnection.getMysqlConnection();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM users WHERE userName = '"+ userName +"'");
        if (rs == null) {
            return false;
        }
        while (rs.next()) {
            if (rs.getString("passwd") == null ? passwod == null : rs.getString("passwd").equals(passwod)) {
                LoginController.currentUser.setID(rs.getInt("ID"));
                LoginController.currentUser.setUseName(rs.getString("userName"));
                return true;
            }
        }
        connection.close();
        return false;
    }
}
