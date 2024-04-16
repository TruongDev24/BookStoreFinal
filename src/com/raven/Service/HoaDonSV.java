/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.Service;

import com.raven.Model2.HoaDonCTModel;
import com.raven.Model2.HoaDonModel;
import com.raven.dbConnect.DBConnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class HoaDonSV {

    private Connection conn = DBConnect.getConnection();

    public List<HoaDonModel> getAll() {
        String sql = "SELECT \n"
                + "    hd.id AS [ID Hóa Đơn],\n"
                + "    nv.ten_nv AS [Tên Nhân Viên],\n"
                + "    kh.ten_khach AS [Tên Khách Hàng],\n"
                + "    hd.ngay_tao AS [Ngày Tạo],\n"
                + "    hd.ghi_chu AS [Ghi Chú],\n"
                + "    hd.tong_tien AS [Tổng Tiền],\n"
                + "    hd.id_khuyenmai,\n"
                + "    CASE \n"
                + "        WHEN hd.id_voucher IS NULL THEN N'Không có'\n"
                + "        ELSE vc.ten_vc\n"
                + "    END AS [Tên Voucher],\n"
                + "    CASE \n"
                + "        WHEN hd.thanh_toan = 0 THEN N'Tiền mặt'\n"
                + "        WHEN hd.thanh_toan = 1 THEN N'Chuyển khoản'\n"
                + "        ELSE 'Unknown'\n"
                + "    END AS [Phương Thức Thanh Toán],\n"
                + "    hd.trang_thai AS [Trạng Thái]\n"
                + "FROM \n"
                + "    HoaDon hd\n"
                + "JOIN \n"
                + "    NhanVien nv ON hd.id_tk = nv.id\n"
                + "JOIN \n"
                + "    KhachHang kh ON hd.id_khach = kh.id\n"
                + "LEFT JOIN\n"
                + "    Voucher vc ON hd.id_voucher = vc.id\n"
                + "WHERE \n"
                + "    hd.thanh_toan IN (0, 1);";
        try ( PreparedStatement ps = conn.prepareStatement(sql)) {
            List<HoaDonModel> kh = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonModel KH = new HoaDonModel(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10));
                kh.add(KH);
            }
            return kh;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<HoaDonCTModel> getChiTietTT(Object Id) {
        String sql = "DECLARE @MaHoaDon INT = ?;\n"
                + "\n"
                + "SELECT \n"
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
                + "    dbo.Sach S ON CS.id_sach = S.id\n"
                + "WHERE \n"
                + "    HD.id = @MaHoaDon;";
        try ( PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, Id);
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
