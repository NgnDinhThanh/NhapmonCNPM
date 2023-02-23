/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import models.PhongBanModel;

/**
 *
 * @author Thanh.ND200592
 */
public class PhongBanBean {
    private PhongBanModel phongBanModel;

    public PhongBanBean(PhongBanModel phongBanModel) {
        this.phongBanModel = phongBanModel;
    }

    public PhongBanBean() {
        this.phongBanModel = new PhongBanModel();
    }

    public PhongBanModel getPhongBanModel() {
        return phongBanModel;
    }

    public void setPhongBanModel(PhongBanModel phongBanModel) {
        this.phongBanModel = phongBanModel;
    }
    
    
    
    
    
}
