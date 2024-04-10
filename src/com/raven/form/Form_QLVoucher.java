/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;

import com.raven.Service.Service_Voucher;
import com.raven.Model2.VCmodel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RAVEN
 */
public final class Form_QLVoucher extends javax.swing.JPanel {

    private DefaultTableModel dtm;
    private List<VCmodel> list = new ArrayList<>();
    private Service_Voucher sv = new Service_Voucher();

    /**
     * Creates new form Form_1
     */
    public Form_QLVoucher() {
        initComponents();
        dtm = (DefaultTableModel) tbVC.getModel();
        list = sv.getAll();
        showData(list);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        xoaBtn = new javax.swing.JButton();
        suaBtn = new javax.swing.JButton();
        ThemBtn = new javax.swing.JButton();
        cbxSort = new javax.swing.JComboBox<>();
        searchBar = new javax.swing.JTextField();
        panelBorder1 = new com.raven.swing.PanelBorder();
        jLabel2 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        tbVC = new com.raven.swing.Table();
        jLabel1 = new javax.swing.JLabel();
        load = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        xoaBtn.setBackground(new java.awt.Color(18, 64, 118));
        xoaBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        xoaBtn.setForeground(new java.awt.Color(249, 232, 151));
        xoaBtn.setText("Xóa");
        xoaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaBtnActionPerformed(evt);
            }
        });

        suaBtn.setBackground(new java.awt.Color(18, 64, 118));
        suaBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        suaBtn.setForeground(new java.awt.Color(249, 232, 151));
        suaBtn.setText("Sửa");
        suaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaBtnActionPerformed(evt);
            }
        });

        ThemBtn.setBackground(new java.awt.Color(18, 64, 118));
        ThemBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ThemBtn.setForeground(new java.awt.Color(249, 232, 151));
        ThemBtn.setText("Thêm mới");
        ThemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemBtnActionPerformed(evt);
            }
        });

        cbxSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mặc định", "Ngày tiếp theo", "Tên voucher A-Z", "Tên voucher Z-A", "Số tiền giảm dần", "Số tiền tăng dần", "Chưa bắt đầu", "Đang diễn ra", "Đã kết thúc" }));
        cbxSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSortActionPerformed(evt);
            }
        });

        searchBar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBarKeyReleased(evt);
            }
        });

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Quản lí mã giảm giá");

        spTable.setBorder(null);

        tbVC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên voucher", "Ngày bắt đầu", "Ngày kết thúc", "Số tiền giảm", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbVC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVCMouseClicked(evt);
            }
        });
        spTable.setViewportView(tbVC);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 1039, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/search.png"))); // NOI18N

        load.setBackground(new java.awt.Color(18, 64, 118));
        load.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        load.setForeground(new java.awt.Color(249, 232, 151));
        load.setText("Load");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(cbxSort, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(load)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ThemBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suaBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xoaBtn)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xoaBtn)
                            .addComponent(suaBtn)
                            .addComponent(ThemBtn)
                            .addComponent(load)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(652, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(66, Short.MAX_VALUE)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void showData(List<VCmodel> listVC) {
        dtm.setRowCount(0);
        listVC.forEach(c -> dtm.addRow(new Object[]{
            c.getMa(), c.getTen(), c.getNgay_bd(), c.getNgay_kt(), c.getTien_giam(), c.getStatus()
        }));
    }
    private void ThemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemBtnActionPerformed
        // TODO add your handling code here:
        ChiTietVoucher ct = new ChiTietVoucher(null, true, ChiTietVoucher.ActionType.ADD);
        ct.setVisible(true);
        list = sv.getAll();
        showData(list);
    }//GEN-LAST:event_ThemBtnActionPerformed

    private void tbVCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVCMouseClicked

    }//GEN-LAST:event_tbVCMouseClicked

    private void suaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaBtnActionPerformed
        // TODO add your handling code here:
        int row = tbVC.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một hàng để sửa", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ChiTietVoucher ct = new ChiTietVoucher(null, true, ChiTietVoucher.ActionType.EDIT);
        ct.detail(row);
        ct.setVisible(true);
        list = sv.getAll();
        showData(list);
    }//GEN-LAST:event_suaBtnActionPerformed

    private void xoaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaBtnActionPerformed
        // TODO add your handling code here:
        int row = tbVC.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một hàng để xóa", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int choice = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
        if (choice != JOptionPane.YES_OPTION) {
            return; // Nếu người dùng không đồng ý xóa, thoát khỏi phương thức
        }
        ChiTietVoucher ct = new ChiTietVoucher(null, true, ChiTietVoucher.ActionType.EDIT);
        ct.detail(row);
        ct.delete();
        list = sv.getAll();
        showData(list);
    }//GEN-LAST:event_xoaBtnActionPerformed

    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased
        // TODO add your handling code here:
        String searchText = searchBar.getText().trim().toLowerCase(); // Lấy văn bản từ ô tìm kiếm và chuẩn hóa nó

        DefaultTableModel model = (DefaultTableModel) tbVC.getModel(); // Lấy mô hình bảng hiện tại

        // Xóa tất cả các hàng khỏi bảng
        model.setRowCount(0);

        // Lặp qua tất cả các hàng trong dữ liệu ban đầu và thêm các hàng phù hợp vào bảng mới
        for (VCmodel vc : list) {
            if (vc.getTen().toLowerCase().contains(searchText) || vc.getTien_giam().toLowerCase().contains(searchText)
                    || vc.getNgay_kt().toLowerCase().contains(searchText) || vc.getNgay_bd().toLowerCase().contains(searchText)
                    || vc.getStatus().toLowerCase().contains(searchText)) {
                model.addRow(new Object[]{
                    vc.getMa(), vc.getTen(), vc.getNgay_bd(), vc.getNgay_kt(), vc.getTien_giam(), vc.getStatus()
                });
            }
        }
    }//GEN-LAST:event_searchBarKeyReleased

    private void cbxSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSortActionPerformed
        // TODO add your handling code here:
        if (cbxSort.getSelectedItem().equals("Số tiền tăng dần")) {
            sortDataByPriceAscending();
        } else if (cbxSort.getSelectedItem().equals("Số tiền giảm dần")) {
            sortDataByPriceDescending();
        } else if (cbxSort.getSelectedItem().equals("Ngày tiếp theo")) {
            sortDataByStartDateAscending();
        } else if (cbxSort.getSelectedItem().equals("Tên voucher A-Z")) {
            sortDataByNameAscending();
        } else if (cbxSort.getSelectedItem().equals("Tên voucher Z-A")) {
            sortDataByNameDescending();
        } else if (cbxSort.getSelectedItem().equals("Chưa bắt đầu")) {
            showDataWithStatusNotStarted();
        } else if (cbxSort.getSelectedItem().equals("Đang diễn ra")) {
            showOngoingVouchers();
        } else if (cbxSort.getSelectedItem().equals("Đã kết thúc")) {
            showExpiredVouchers();
        } else if (cbxSort.getSelectedItem().equals("Mặc định")) {
            list = sv.getAll();
            showData(list);
        }
    }//GEN-LAST:event_cbxSortActionPerformed

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        // TODO add your handling code here:
        list = sv.getAll();
        showData(list);
    }//GEN-LAST:event_loadActionPerformed

    private void showExpiredVouchers() {
        DefaultTableModel model = (DefaultTableModel) tbVC.getModel(); // Lấy mô hình bảng hiện tại
        model.setRowCount(0); // Xóa tất cả các hàng khỏi bảng để chuẩn bị hiển thị dữ liệu mới

        for (VCmodel vc : list) {
            // Kiểm tra nếu voucher có trạng thái "Đã kết thúc"
            if (vc.getStatus().equals("Đã kết thúc")) {
                // Thêm thông tin của voucher này vào bảng
                model.addRow(new Object[]{
                    vc.getMa(), vc.getTen(), vc.getNgay_bd(), vc.getNgay_kt(), vc.getTien_giam(), vc.getStatus()
                });
            }
        }
    }

    private void showOngoingVouchers() {
        DefaultTableModel model = (DefaultTableModel) tbVC.getModel(); // Lấy mô hình bảng hiện tại

        // Xóa tất cả các hàng khỏi bảng
        model.setRowCount(0);

        // Lặp qua tất cả các voucher và thêm vào bảng nếu trạng thái là "Đang diễn ra"
        for (VCmodel vc : list) {
            if (vc.getStatus().equals("Đang diễn ra")) {
                model.addRow(new Object[]{
                    vc.getMa(), vc.getTen(), vc.getNgay_bd(), vc.getNgay_kt(), vc.getTien_giam(), vc.getStatus()
                });
            }
        }
    }

    private void showDataWithStatusNotStarted() {
        DefaultTableModel model = (DefaultTableModel) tbVC.getModel(); // Lấy mô hình bảng hiện tại
        model.setRowCount(0); // Xóa tất cả các hàng trong bảng trước khi thêm dữ liệu mới

        for (VCmodel vc : list) {
            // Nếu trạng thái của voucher là "Chưa diễn ra"
            if (vc.getStatus().equals("Chưa bắt đầu")) {
                // Thêm voucher vào bảng
                model.addRow(new Object[]{
                    vc.getMa(), vc.getTen(), vc.getNgay_bd(), vc.getNgay_kt(), vc.getTien_giam(), vc.getStatus()
                });
            }
        }
    }

    private void sortDataByNameDescending() {
        DefaultTableModel model = (DefaultTableModel) tbVC.getModel(); // Lấy mô hình bảng hiện tại
        List<VCmodel> sortedList = new ArrayList<>(list); // Sao chép danh sách hiện tại để tránh thay đổi danh sách gốc

        // Sắp xếp danh sách theo tên từ Z đến A
        Collections.sort(sortedList, new Comparator<VCmodel>() {
            @Override
            public int compare(VCmodel vc1, VCmodel vc2) {
                // So sánh tên của hai voucher, chưa quan tâm đến việc viết hoa/thường
                String name1 = vc1.getTen().toLowerCase();
                String name2 = vc2.getTen().toLowerCase();
                return name2.compareTo(name1); // So sánh theo chiều giảm dần
            }
        });

        // Xóa tất cả các hàng khỏi bảng
        model.setRowCount(0);

        // Thêm lại dữ liệu đã sắp xếp vào bảng
        for (VCmodel vc : sortedList) {
            model.addRow(new Object[]{
                vc.getMa(), vc.getTen(), vc.getNgay_bd(), vc.getNgay_kt(), vc.getTien_giam(), vc.getStatus()
            });
        }
    }

    private void sortDataByNameAscending() {
        DefaultTableModel model = (DefaultTableModel) tbVC.getModel(); // Lấy mô hình bảng hiện tại
        List<VCmodel> sortedList = new ArrayList<>(list); // Sao chép danh sách hiện tại để tránh thay đổi danh sách gốc

        // Sắp xếp danh sách theo tên từ A đến Z
        Collections.sort(sortedList, new Comparator<VCmodel>() {
            @Override
            public int compare(VCmodel vc1, VCmodel vc2) {
                // So sánh tên của hai voucher, chưa quan tâm đến việc viết hoa/thường
                String name1 = vc1.getTen().toLowerCase();
                String name2 = vc2.getTen().toLowerCase();
                return name1.compareTo(name2); // So sánh theo chiều tăng dần
            }
        });

        // Xóa tất cả các hàng khỏi bảng
        model.setRowCount(0);

        // Thêm lại dữ liệu đã sắp xếp vào bảng
        for (VCmodel vc : sortedList) {
            model.addRow(new Object[]{
                vc.getMa(), vc.getTen(), vc.getNgay_bd(), vc.getNgay_kt(), vc.getTien_giam(), vc.getStatus()
            });
        }
    }

    private void sortDataByStartDateAscending() {
        DefaultTableModel model = (DefaultTableModel) tbVC.getModel(); // Lấy mô hình bảng hiện tại
        List<VCmodel> sortedList = new ArrayList<>(list); // Sao chép danh sách hiện tại để tránh thay đổi danh sách gốc

        // Sắp xếp danh sách theo ngày bắt đầu sắp tới
        Collections.sort(sortedList, new Comparator<VCmodel>() {
            @Override
            public int compare(VCmodel vc1, VCmodel vc2) {
                // Đảm bảo rằng cả hai ngày bắt đầu là đối tượng Date và so sánh chúng
                String startDate1 = vc1.getNgay_bd();
                String startDate2 = vc2.getNgay_bd();
                return startDate1.compareTo(startDate2); // So sánh theo chiều tăng dần
            }
        });

        // Xóa tất cả các hàng khỏi bảng
        model.setRowCount(0);

        // Thêm lại dữ liệu đã sắp xếp vào bảng
        for (VCmodel vc : sortedList) {
            model.addRow(new Object[]{
                vc.getMa(), vc.getTen(), vc.getNgay_bd(), vc.getNgay_kt(), vc.getTien_giam(), vc.getStatus()
            });
        }
    }

    private void sortDataByPriceDescending() {
        DefaultTableModel model = (DefaultTableModel) tbVC.getModel(); // Lấy mô hình bảng hiện tại
        List<VCmodel> sortedList = new ArrayList<>(list); // Sao chép danh sách hiện tại để tránh thay đổi danh sách gốc

        // Sắp xếp danh sách theo giá tiền giảm dần
        Collections.sort(sortedList, new Comparator<VCmodel>() {
            @Override
            public int compare(VCmodel vc1, VCmodel vc2) {
                // Đảm bảo rằng cả hai giá tiền là số và so sánh chúng theo chiều giảm dần
                double price1 = Double.parseDouble(vc1.getTien_giam());
                double price2 = Double.parseDouble(vc2.getTien_giam());
                return Double.compare(price2, price1); // So sánh ngược chiều (giảm dần)
            }
        });

        // Xóa tất cả các hàng khỏi bảng
        model.setRowCount(0);

        // Thêm lại dữ liệu đã sắp xếp vào bảng
        for (VCmodel vc : sortedList) {
            model.addRow(new Object[]{
                vc.getMa(), vc.getTen(), vc.getNgay_bd(), vc.getNgay_kt(), vc.getTien_giam(), vc.getStatus()
            });
        }
    }

    private void sortDataByPriceAscending() {
        DefaultTableModel model = (DefaultTableModel) tbVC.getModel(); // Lấy mô hình bảng hiện tại
        List<VCmodel> sortedList = new ArrayList<>(list); // Sao chép danh sách hiện tại để tránh thay đổi danh sách gốc

        // Sắp xếp danh sách theo giá tiền tăng dần
        Collections.sort(sortedList, new Comparator<VCmodel>() {
            @Override
            public int compare(VCmodel vc1, VCmodel vc2) {
                // Đảm bảo rằng cả hai giá tiền là số và so sánh chúng
                double price1 = Double.parseDouble(vc1.getTien_giam());
                double price2 = Double.parseDouble(vc2.getTien_giam());
                return Double.compare(price1, price2);
            }
        });

        // Xóa tất cả các hàng khỏi bảng
        model.setRowCount(0);

        // Thêm lại dữ liệu đã sắp xếp vào bảng
        for (VCmodel vc : sortedList) {
            model.addRow(new Object[]{
                vc.getMa(), vc.getTen(), vc.getNgay_bd(), vc.getNgay_kt(), vc.getTien_giam(), vc.getStatus()
            });
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ThemBtn;
    private javax.swing.JComboBox<String> cbxSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton load;
    private com.raven.swing.PanelBorder panelBorder1;
    private javax.swing.JTextField searchBar;
    private javax.swing.JScrollPane spTable;
    private javax.swing.JButton suaBtn;
    private com.raven.swing.Table tbVC;
    private javax.swing.JButton xoaBtn;
    // End of variables declaration//GEN-END:variables
}
