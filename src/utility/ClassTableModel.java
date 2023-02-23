/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import Bean.TaiSanBean;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.HoatDongModel;
import models.PhongBanModel;
import models.TaiSanModel;

/**
 *
 * @author Thanh.ND200592
 */
public class ClassTableModel {
    public DefaultTableModel setTableTaiSan(List<TaiSanModel> listItem, String [] listColumn) {
        final int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return super.isCellEditable(row, column);
            }
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 4 ? Boolean.class : String.class;
            }
        };
        dtm.setColumnIdentifiers(listColumn);
        Object[] obj;
        obj = new Object[columns];
        listItem.forEach((TaiSanModel item) -> {
            obj[0] = item.getID();
            obj[1] = item.getTenTaiSan();
            obj[2] = item.getSoLuong();
            obj[3] = item.getSoLuongHienCo();
            dtm.addRow(obj);
        });
        return dtm;
    }
    
    public DefaultTableModel setTablePhongBan(List<PhongBanModel> listItem, String[] listColumn) {
        final int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return super.isCellEditable(row, column);
            }
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 4 ? Boolean.class : String.class;
            }
        };
        dtm.setColumnIdentifiers(listColumn);
        Object[] obj;
        obj = new Object[columns];
        listItem.forEach((PhongBanModel item) -> {
            obj[0] = item.getSoPhong();
            obj[1] = item.getTang();
            obj[2] = item.getTenPhong();
            obj[3] = item.getTrangThai();
            dtm.addRow(obj);
        });
        return dtm;
    }
    
    public DefaultTableModel setTableHoatDong(List<HoatDongModel> listItem, String[] listColumn) {
        final int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return super.isCellEditable(row, column);
            }
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 5 ? Boolean.class : String.class;
            }
        };
        dtm.setColumnIdentifiers(listColumn);
        Object [] obj;
        obj = new Object[columns];
        listItem.forEach((HoatDongModel item) -> {
            obj[0] = item.getID();
            obj[1] = item.getTenHoatDong();
            obj[2] = item.getTuNgay();
            obj[3] = item.getDenNgay();
            obj[4] = item.getTrangThai();
            dtm.addRow(obj);
        });
        return dtm;
    }
    
}
