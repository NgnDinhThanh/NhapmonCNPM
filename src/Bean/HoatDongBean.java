/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import java.util.ArrayList;
import java.util.List;
import models.HoatDongModel;
import models.MuonPhongBan;
import models.MuonTaiSanModel;
import models.TaiSanModel;

/**
 *
 * @author Thanh.ND200592
 */
public class HoatDongBean {

    private HoatDongModel hoatDongModel;
    private MuonTaiSanModel muonTaiSanModel;
    private List<MuonTaiSanModel> listMuonTaiSanModels;
    private List<MuonPhongBan> listMuonPhongBans;

    public HoatDongBean(HoatDongModel hoatDongModel, MuonTaiSanModel muonTaiSanModel, List<MuonTaiSanModel> listMuonTaiSanModels, List<MuonPhongBan> listMuonPhongBans) {
        this.hoatDongModel = hoatDongModel;
        this.muonTaiSanModel = muonTaiSanModel;
        this.listMuonTaiSanModels = listMuonTaiSanModels;
        this.listMuonPhongBans = listMuonPhongBans;
    }

    public HoatDongBean() {
        this.hoatDongModel = new HoatDongModel();
        this.muonTaiSanModel = new MuonTaiSanModel();
        this.listMuonTaiSanModels = new ArrayList<>();
        this.listMuonPhongBans = new ArrayList<>();
    }

    public HoatDongModel getHoatDongModel() {
        return hoatDongModel;
    }

    public void setHoatDongModel(HoatDongModel hoatDongModel) {
        this.hoatDongModel = hoatDongModel;
    }

    public MuonTaiSanModel getMuonTaiSanModel() {
        return muonTaiSanModel;
    }

    public void setMuonTaiSanModel(MuonTaiSanModel muonTaiSanModel) {
        this.muonTaiSanModel = muonTaiSanModel;
    }

    public List<MuonTaiSanModel> getListMuonTaiSanModels() {
        return listMuonTaiSanModels;
    }

    public void setListMuonTaiSanModels(List<MuonTaiSanModel> listMuonTaiSanModels) {
        this.listMuonTaiSanModels = listMuonTaiSanModels;
    }

    public List<MuonPhongBan> getListMuonPhongBans() {
        return listMuonPhongBans;
    }

    public void setListMuonPhongBans(List<MuonPhongBan> listMuonPhongBans) {
        this.listMuonPhongBans = listMuonPhongBans;
    }

}
