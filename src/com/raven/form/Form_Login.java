/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.raven.form;

import com.raven.Model2.DangNhap;
//import com.raven.Model2.myAccount;
import com.raven.Service.AuthService;
import com.raven.Service.dangNhapService;
import com.raven.auth.AuthSession;
import com.raven.main.Main;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Form_Login extends javax.swing.JFrame {
    private final AuthService authService = new AuthService();
    List<DangNhap> list;
    dangNhapService sv = new dangNhapService();
//    List<myAccount> am = new ArrayList<>();

    /**
     * Creates new form Form_Login
     */
    public Form_Login() {
        initComponents();
        setLocationRelativeTo(null);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dangNhapBtn = new javax.swing.JButton();
        showBtn = new javax.swing.JCheckBox();
        passw = new javax.swing.JPasswordField();
        txtTB1 = new javax.swing.JLabel();
        txtTB2 = new javax.swing.JLabel();
        help = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(18, 64, 118));

        jPanel2.setBackground(new java.awt.Color(127, 159, 128));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(249, 232, 151));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đăng nhập");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setForeground(new java.awt.Color(249, 232, 151));
        jLabel2.setText("Username");

        jLabel3.setForeground(new java.awt.Color(249, 232, 151));
        jLabel3.setText("Password");

        dangNhapBtn.setBackground(new java.awt.Color(255, 195, 116));
        dangNhapBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dangNhapBtn.setText("Đăng nhập");
        dangNhapBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dangNhapBtn.setMargin(new java.awt.Insets(3, 14, 3, 14));
        dangNhapBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangNhapBtnActionPerformed(evt);
            }
        });

        showBtn.setForeground(new java.awt.Color(249, 232, 151));
        showBtn.setText("Hiển thị mật khẩu");
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });

        txtTB1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTB1.setForeground(new java.awt.Color(255, 0, 0));

        txtTB2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTB2.setForeground(new java.awt.Color(255, 0, 0));

        help.setForeground(new java.awt.Color(249, 232, 151));
        help.setText("Liên hệ?");
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(dangNhapBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTB2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTB1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(showBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(help))
                            .addComponent(passw))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTB1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTB2))
                .addGap(8, 8, 8)
                .addComponent(passw, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showBtn)
                    .addComponent(help))
                .addGap(20, 20, 20)
                .addComponent(dangNhapBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        // TODO add your handling code here:
        if (showBtn.isSelected()) {
            passw.setEchoChar((char) 0);
        } else {
            passw.setEchoChar('*');
        }
    }//GEN-LAST:event_showBtnActionPerformed

    private void dangNhapBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dangNhapBtnActionPerformed
        // TODO add your handling code here:
        String user = username.getText();
        String pw = String.valueOf(passw.getPassword());
        DangNhap dn = authService.authenticate(user, pw);
        if (dn != null) {
          if (dn.getStatus().equalsIgnoreCase("active")){
              AuthSession.uid = dn.getId();
              AuthSession.name = dn.getTenNV();
              Form_MyAccount form = new Form_MyAccount(null, true);
              form.setTenNV(dn.getTenNV());
              form.setRole(dn.getRole());
              form.setHinhAnh(dn.getHinhAnh());

              txtTB1.setText(null);
              txtTB2.setText(null);
              this.dispose();
              Main m = new Main();
              m.setVisible(true);
              form.setVisible(true);
          }
          else {
              JOptionPane.showMessageDialog(this, "Tài khoản đã bị khóa", "Lỗi", JOptionPane.ERROR_MESSAGE);
          }
        } else {
            JOptionPane.showMessageDialog(this, "Sai tên đăng nhập hoặc mật khẩu", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_dangNhapBtnActionPerformed

//    public List<myAccount> getMyAccounts() {
//        return am;
//    }
    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        // TODO add your handling code here:
        String phoneNumber = "123-456-7890"; // Số điện thoại mẫu
        JOptionPane.showMessageDialog(this, "Quản lí: " + phoneNumber, "Thông tin liên hệ",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_helpMouseClicked

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
            java.util.logging.Logger.getLogger(Form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dangNhapBtn;
    private javax.swing.JLabel help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passw;
    private javax.swing.JCheckBox showBtn;
    private javax.swing.JLabel txtTB1;
    private javax.swing.JLabel txtTB2;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
