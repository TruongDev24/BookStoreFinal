/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.Service;
import com.raven.Model2.NXB;
import com.raven.Model2.TacGia;
import com.raven.Model2.TheLoai;
import com.raven.dbConnect.DBConnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LENOVO
 */
public class NXBService {
    private Connection conn = DBConnect.getConnection();

    public List<TacGia> getAllTG() {
        String sql = "select * from TacGia";
        try ( PreparedStatement ps = conn.prepareStatement(sql)) {
            List<TacGia> vm = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TacGia vcm = new TacGia(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
                vm.add(vcm);
            }
            return vm;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<TheLoai> getAllTL() {
        String sql = "select * from TheLoai";
        try ( PreparedStatement ps = conn.prepareStatement(sql)) {
            List<TheLoai> vm = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TheLoai vcm = new TheLoai(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
                vm.add(vcm);
            }
            return vm;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<NXB> getAllNXB() {
        String sql = "select * from NhaXuatBan";
        try ( PreparedStatement ps = conn.prepareStatement(sql)) {
            List<NXB> vm = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NXB vcm = new NXB(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
                vm.add(vcm);
            }
            return vm;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
