/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.Service;

import com.raven.Model2.HoaDonCTModel;
import com.raven.dbConnect.DBConnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class CTHoaDonSV {

    private Connection conn = DBConnect.getConnection();

    public List<HoaDonCTModel> getAll() {
        String sql = "SELECT \n"
                + "    HD.id AS 'Mã hóa đơn',\n"
                + "    CTH.id_sachct AS 'Mã sách',\n"
                + "    S.ten_sach AS 'Tên sách',\n"
                + "    CS.gia_ban AS 'Giá sách',\n"
                + "    CTH.so_luong AS 'Số lượng'\n"
                + "FROM \n"
                + "    dbo.HoaDon HD\n"
                + "INNER JOIN \n"
                + "    dbo.ChiTietHoaDon CTH ON HD.id = CTH.id_hoadon\n"
                + "INNER JOIN \n"
                + "    dbo.ChiTietSach CS ON CTH.id_sachct = CS.id\n"
                + "INNER JOIN \n"
                + "    dbo.Sach S ON CS.id_sach = S.id;";
        try ( PreparedStatement ps = conn.prepareStatement(sql)) {
            List<HoaDonCTModel> kh = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonCTModel KH = new HoaDonCTModel(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
                kh.add(KH);
            }
            return kh;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
