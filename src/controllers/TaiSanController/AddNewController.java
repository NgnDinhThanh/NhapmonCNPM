
package controllers.TaiSanController;

import Bean.TaiSanBean;
import models.TaiSanModel;
import java.sql.*;
import services.MysqlConnection;

/**
 *
 * @author Thanh.ND200592
 */
public class AddNewController {
    public boolean addNewTaiSan(TaiSanBean taiSanBean) throws SQLException, ClassNotFoundException {
        TaiSanModel taiSan = taiSanBean.getTaiSanModel();
        Connection connection = MysqlConnection.getMysqlConnection();
        String query = "INSERT INTO tai_san(TenTaiSan, SoLuong, SoLuongConLai) VALUES (?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, taiSan.getTenTaiSan());
        preparedStatement.setInt(2, taiSan.getSoLuong());
        preparedStatement.setInt(3, taiSan.getSoLuongHienCo());
        preparedStatement.executeUpdate();
        connection.close();
        return true;
    }
}
