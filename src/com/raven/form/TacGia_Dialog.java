/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.raven.form;

import com.raven.Model2.TacGia;
import com.raven.Service.TacGiaSV;
import com.raven.Service.NXB_TGgetAll;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class TacGia_Dialog extends javax.swing.JDialog {
    
    public enum ActionType1 {
        ADD, EDIT
    }
    private ActionType1 actionType;
    private NXB_TGgetAll sv = new NXB_TGgetAll();
    private List<TacGia> list = sv.getAllTG();
    private TacGiaSV nxbsv = new TacGiaSV();

    /**
     * Creates new form NXB_Dialog
     */
    public TacGia_Dialog(java.awt.Frame parent, boolean modal, ActionType1 actionType) {
        super(parent, modal);
        initComponents();
        this.actionType = actionType;
        this.setLocationRelativeTo(null);
        if (actionType == ActionType1.EDIT) {
            lblname.setText("Sửa tác giả");
        }
    }

    private boolean checkNull(){
        return !txtTen.getText().trim().isEmpty();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtID = new javax.swing.JTextField();
        lblname = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        Rdo1 = new javax.swing.JRadioButton();
        Rdo2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        luuBtn = new javax.swing.JButton();

        txtID.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblname.setText("Thêm mới tác giả");

        jLabel2.setText("Tên tác giả");

        jLabel3.setText("Mô tả");

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane1.setViewportView(txtMoTa);

        buttonGroup1.add(Rdo1);
        Rdo1.setSelected(true);
        Rdo1.setText("Hoạt động");

        buttonGroup1.add(Rdo2);
        Rdo2.setText("Ngừng hoạt động");

        jLabel4.setText("Trạng thái");

        luuBtn.setText("Lưu");
        luuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luuBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Rdo1)
                        .addGap(18, 18, 18)
                        .addComponent(Rdo2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTen)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(luuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rdo1)
                    .addComponent(Rdo2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(luuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void luuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luuBtnActionPerformed
        // TODO add your handling code here:
        if (actionType == ActionType1.ADD) {
            if(!checkNull()){
                return;
            }
            Integer ma = 0;
            String ten = txtTen.getText();
            String moTa = txtMoTa.getText();
            String status = new String();
            if (Rdo1.isSelected()) {
                status = "Hoạt động";
            } else if (Rdo2.isSelected()) {
                status = "Ngừng hoạt động";
            }

            if(nxbsv.checkDuplicate(ten)){
                JOptionPane.showMessageDialog(this, "Đã có tác giả này");
            }
            
            TacGia nxb = new TacGia(ma, ten, moTa, status);
            boolean addNXB = nxbsv.add(nxb);
            if (addNXB) {
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại");
            }
        } else if (actionType == ActionType1.EDIT) {
            if(!checkNull()){
                return;
            }
            Integer ma=Integer.parseInt(txtID.getText());
            String ten = txtTen.getText();
            String moTa = txtMoTa.getText();
            String status = "";
            if (Rdo1.isSelected()) {
                status = "Hoạt động";
            } else if (Rdo2.isSelected()) {
                status = "Ngừng hoạt động";
            }

            if(nxbsv.checkDuplicate(ten)){
                JOptionPane.showMessageDialog(this, "Đã có tác giả này");
            }
            
            TacGia nxb = new TacGia(ma, ten, moTa, status);
            boolean addNXB = nxbsv.update(nxb);
            if (addNXB) {
                JOptionPane.showMessageDialog(this, "Sửa thành công");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Sửa thất bại");
            }
        }
    }//GEN-LAST:event_luuBtnActionPerformed
    public void delete() {
        Integer ma=Integer.parseInt(txtID.getText());
        String ten = txtTen.getText();
        String moTa = txtMoTa.getText();
        String status = new String();
        if (Rdo1.isSelected()) {
            status = "Hoạt động";
        } else if (Rdo2.isSelected()) {
            status = "Ngừng hoạt động";
        }

        TacGia nxb = new TacGia(ma, ten, moTa, status);
        boolean addNXB = nxbsv.delete(nxb);
        if (addNXB) {
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        }
    }

    public void detail(int index) {
        TacGia n = list.get(index);
        txtID.setText(String.valueOf(n.getId()));
        txtTen.setText(n.getTen());
        txtMoTa.setText(n.getMoTa());
        if (n.getTrangThai().equals("Hoạt động")) {
            Rdo1.setSelected(true);
        } else if (n.getTrangThai().equals("Ngừng hoạt động")) {
            Rdo2.setSelected(true);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TacGia_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TacGia_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TacGia_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TacGia_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TacGia_Dialog dialog = new TacGia_Dialog(new javax.swing.JFrame(), true, ActionType1.ADD);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Rdo1;
    private javax.swing.JRadioButton Rdo2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblname;
    private javax.swing.JButton luuBtn;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
