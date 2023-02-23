/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Thanh.ND200592
 */
public class PhongBanModel {
    private int SoPhong;
    private int Tang;
    private String TenPhong;
    private String TrangThai;

    public PhongBanModel() {
    }

    public PhongBanModel(int SoPhong, int Tang, String TenPhong, String TrangThai) {
        this.SoPhong = SoPhong;
        this.Tang = Tang;
        this.TenPhong = TenPhong;
        this.TrangThai = TrangThai;
    }

    public int getSoPhong() {
        return SoPhong;
    }

    public void setSoPhong(int SoPhong) {
        this.SoPhong = SoPhong;
    }

    public int getTang() {
        return Tang;
    }

    public void setTang(int Tang) {
        this.Tang = Tang;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }
    
    
    
}
