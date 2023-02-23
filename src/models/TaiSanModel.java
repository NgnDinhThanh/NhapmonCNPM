/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Thanh.ND200592
 */
public class TaiSanModel {
    private int ID;
    private String TenTaiSan;
    private int SoLuong;
    private int SoLuongHienCo;

    public TaiSanModel() {
    }

    public TaiSanModel(int ID, String TenTaiSan, int SoLuong, int SoLuongHienCo) {
        this.ID = ID;
        this.TenTaiSan = TenTaiSan;
        this.SoLuong = SoLuong;
        this.SoLuongHienCo = SoLuongHienCo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenTaiSan() {
        return TenTaiSan;
    }

    public void setTenTaiSan(String TenTaiSan) {
        this.TenTaiSan = TenTaiSan;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getSoLuongHienCo() {
        return SoLuongHienCo;
    }

    public void setSoLuongHienCo(int SoLuongHienCo) {
        this.SoLuongHienCo = SoLuongHienCo;
    }
    
    
    
}
