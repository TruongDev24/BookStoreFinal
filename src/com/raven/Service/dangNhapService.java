/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.Service;

import com.raven.Model2.DangNhap;
import com.raven.dbConnect.DBConnect;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class dangNhapService {
    
    private Connection conn = DBConnect.getConnection();
    
    public List<DangNhap> getAll() {
        String sql = "select ten_nv, username, password, vai_tro, hinh_anh from NhanVien";
        try ( PreparedStatement ps = conn.prepareStatement(sql)) {
            List<DangNhap> vm = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               DangNhap dangNhap =new DangNhap();
            }
            return vm;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
