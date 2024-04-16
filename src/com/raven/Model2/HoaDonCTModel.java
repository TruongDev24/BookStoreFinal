/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.Model2;

/**
 *
 * @author LENOVO
 */
public class HoaDonCTModel {
    private String mahd;
    private String maSach;
    private String tenSach;
    private String gia;
    private String soLuong;

    public HoaDonCTModel() {
    }

    public HoaDonCTModel(String mahd, String maSach, String tenSach, String gia, String soLuong) {
        this.mahd = mahd;
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }
    
    
}
