/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.raven.Model2.nguoiDung;
import java.sql.*;
import com.raven.dbConnect.DBConnect;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author LENOVO
 */
public class NguoiDung_Service {

    Connection con = DBConnect.getConnection();

    public List<nguoiDung> getAll_NV() {
        String sql = "select*from NhanVien where trang_thai <> N'Đã xóa'";
        try ( PreparedStatement prs = con.prepareStatement(sql)) {
            ResultSet rs = prs.executeQuery();
            List<nguoiDung> ppp = new ArrayList<>();
            while (rs.next()) {
                nguoiDung kh = new nguoiDung(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13));
                ppp.add(kh);
            }
            return ppp;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(nguoiDung nv) {
        String sql = "insert into NhanVien(username,password,ten_nv,hinh_anh,email,cccd,ngay_dangki,gioi_tinh,sdt,ngay_sinh,vai_tro,trang_thai)Values(?,?,?,?,?,?,?,?,?,?,?,?)";
        try ( PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, nv.getUsername());
            ps.setObject(2, nv.getPassword());
            ps.setObject(3, nv.getTen_nv());
            ps.setObject(4, nv.getHinh_anh());
            ps.setObject(5, nv.getEmail());
            ps.setObject(6, nv.getCccd());
            LocalDateTime currentDateTime = LocalDateTime.now();
            // Định dạng ngày giờ
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            // Chuyển đổi ngày giờ thành chuỗi
            String ngayThem = currentDateTime.format(formatter);
            ps.setObject(7, ngayThem);
            ps.setObject(8, nv.getGioi_tinh());
            ps.setObject(9, nv.getSdt());
            ps.setObject(10, nv.getNgay_sinh());
            ps.setObject(11, nv.getVaiTro());
            ps.setObject(12, nv.getTrang_thai());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(String cccd) {
        int check = 0;
        String sql = "delete from NhanVien where cccd=?";
        try ( PreparedStatement prs = con.prepareStatement(sql)) {
            prs.setObject(1, cccd);
            check = prs.executeUpdate();
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean updateNhanVien(nguoiDung nv) {
        String sql = "UPDATE NhanVien SET username=?,"
                + " password=?, ten_nv=?, hinh_anh=?, email=?,"
                + " gioi_tinh=?, sdt=?, ngay_sinh=?, vai_tro=?, trang_thai=?, cccd=? where id=?";
        try ( PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, nv.getUsername());
            ps.setObject(2, nv.getPassword());
            ps.setObject(3, nv.getTen_nv());
            ps.setObject(4, nv.getHinh_anh());
            ps.setObject(5, nv.getEmail());
            ps.setObject(6, nv.getGioi_tinh());
            ps.setObject(7, nv.getSdt());
            ps.setObject(8, nv.getNgay_sinh());
            ps.setObject(9, nv.getVaiTro());
            ps.setObject(10, nv.getTrang_thai());
            ps.setObject(11, nv.getCccd());
            ps.setObject(12, nv.getId());
            int updatedRows = ps.executeUpdate();
            return updatedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateStatus(String id, String newStatus) {
        int check = 0;
        String sql = "update NhanVien set trang_thai=? where id=?";
        try ( PreparedStatement prs = con.prepareStatement(sql)) {
            prs.setObject(1, newStatus);
            prs.setObject(2, id);
            check = prs.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public List<nguoiDung> searchByKeyword(String keyword) {
        String sql = "SELECT * FROM NhanVien WHERE ten_nv LIKE ? OR cccd LIKE ?";
        List<nguoiDung> resultList = new ArrayList<>();
        try ( PreparedStatement prs = con.prepareStatement(sql)) {
            prs.setString(1, "%" + keyword + "%");
            prs.setString(2, "%" + keyword + "%");
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {
                nguoiDung nd = new nguoiDung(
                        rs.getString("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13));
                resultList.add(nd);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultList;
    }

    public boolean checkDuplicate(String cccd, String sdt, String username) {
        String sql = "SELECT COUNT(*) AS count\n"
                + "FROM NhanVien\n"
                + "WHERE cccd = ? AND sdt = ? AND username = ? AND trang_thai <> N'Đã xóa'\n"
                + "GROUP BY cccd, sdt, username\n"
                + "HAVING COUNT(*) > 1;";
        try ( PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, cccd);
            ps.setObject(2, sdt);
            ps.setObject(3, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int count = rs.getInt("count");
                return count > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
