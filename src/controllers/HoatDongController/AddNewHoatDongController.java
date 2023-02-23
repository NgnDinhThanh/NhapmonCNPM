/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.HoatDongController;

import Bean.HoatDongBean;
import java.sql.*;
import models.HoatDongModel;
import services.MysqlConnection;

/**
 *
 * @author Thanh.ND200592
 */
public class AddNewHoatDongController {
    public boolean addNewHoatDong(HoatDongBean hoatDongBean) throws SQLException, ClassNotFoundException {
        HoatDongModel hoatDong = hoatDongBean.getHoatDongModel();
        Connection connection = MysqlConnection.getMysqlConnection();
        String query = "INSERT INTO hoat_dong (TenHoatDong, TuNgay, DenNgay, ID_nguoiTao) VALUES (?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, hoatDong.getTenHoatDong());
        Date ngaybatdau = new Date(hoatDong.getTuNgay().getTime());
        preparedStatement.setDate(2, ngaybatdau);
        Date ngayketthuc = new Date(hoatDong.getDenNgay().getTime());
        preparedStatement.setDate(3, ngayketthuc);
        preparedStatement.setInt(4, hoatDong.getIdNguoiTao());
        preparedStatement.executeUpdate();
        connection.close();
        return true;
    }
    
}
