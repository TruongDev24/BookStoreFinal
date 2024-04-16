/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.Service;

import com.raven.Model2.TacGia;
import com.raven.dbConnect.DBConnect;
import java.sql.*;

/**
 *
 * @author LENOVO
 */
public class TacGiaSV {
    private Connection conn = DBConnect.getConnection();

    public boolean add(TacGia tg) {
        String sql = "insert into TacGia(ten_tacgia, mo_ta, trang_thai) values (?,?,?)";
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

    public boolean update(TacGia tg) {
        String sql = "update TacGia set ten_tacgia = ?, mo_ta = ?, trang_thai = ? where id = ?";
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

    public boolean delete(TacGia tg) {
        String sql = "update TacGia set trang_thai = ? where id = ?";
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
    
    public boolean checkDuplicate(String tenTG) {
        String sql = "SELECT COUNT(*) AS count FROM TacGia WHERE ten_tacgia = ? AND trang_thai != 'Đã xóa'";
        try ( PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, tenTG);
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
