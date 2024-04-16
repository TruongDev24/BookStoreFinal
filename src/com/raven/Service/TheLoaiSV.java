/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.Service;

import com.raven.Model2.TheLoai;
import com.raven.dbConnect.DBConnect;
import java.sql.*;

/**
 *
 * @author LENOVO
 */
public class TheLoaiSV {

    private Connection conn = DBConnect.getConnection();

    public boolean add(TheLoai tg) {
        String sql = "insert into TheLoai(ten_theloai, mo_ta, trang_thai) values (?,?,?)";
        try ( PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, tg.getTen());
            ps.setObject(2, tg.getMoTa());
            ps.setObject(3, tg.getTrangThai());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(TheLoai tg) {
        String sql = "update TheLoai set ten_theloai = ?, mo_ta = ?, trang_thai = ? where id = ?";
        try ( PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, tg.getTen());
            ps.setObject(2, tg.getMoTa());
            ps.setObject(3, tg.getTrangThai());
            ps.setObject(4, tg.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(TheLoai tg) {
        String sql = "update TheLoai set trang_thai = ? where id = ?";
        try ( PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, "Đã xóa");
            ps.setObject(2, tg.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean checkDuplicate(String tenTheLoai) {
        String sql = "SELECT COUNT(*) AS count FROM TheLoai WHERE ten_theloai = ? AND trang_thai != 'Đã xóa'";
        try ( PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, tenTheLoai);
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
