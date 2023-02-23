/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import models.TaiSanModel;

/**
 *
 * @author Thanh.ND200592
 */
public class TaiSanBean {
    private TaiSanModel taiSanModel;

    public TaiSanBean(TaiSanModel taiSanModel) {
        this.taiSanModel = taiSanModel;
    }

    public TaiSanBean() {
        this.taiSanModel = new TaiSanModel();
    }

    public TaiSanModel getTaiSanModel() {
        return taiSanModel;
    }

    public void setTaiSanModel(TaiSanModel taiSanModel) {
        this.taiSanModel = taiSanModel;
    }
    
    
    
    
    
}
