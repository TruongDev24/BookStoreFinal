/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.Model2;

/**
 *
 * @author LENOVO
 */
public class HoaDonModel {
    private String id;
    private String nhanVien;
    private String khach;
    private String ngayTao;
    private String ghiChu;
    private String tongTien;
    private String khuyenMai;
    private String voucher;
    private String phuongThuc;
    private String trangThai;

    public HoaDonModel() {
    }

    public HoaDonModel(String id, String nhanVien, String khach, String ngayTao, String ghiChu, String tongTien, String khuyenMai, String voucher, String phuongThuc, String trangThai) {
        this.id = id;
        this.nhanVien = nhanVien;
        this.khach = khach;
        this.ngayTao = ngayTao;
        this.ghiChu = ghiChu;
        this.tongTien = tongTien;
        this.khuyenMai = khuyenMai;
        this.voucher = voucher;
        this.phuongThuc = phuongThuc;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(String nhanVien) {
        this.nhanVien = nhanVien;
    }

    public String getKhach() {
        return khach;
    }

    public void setKhach(String khach) {
        this.khach = khach;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }

    public String getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(String khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    public String getPhuongThuc() {
        return phuongThuc;
    }

    public void setPhuongThuc(String phuongThuc) {
        this.phuongThuc = phuongThuc;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
