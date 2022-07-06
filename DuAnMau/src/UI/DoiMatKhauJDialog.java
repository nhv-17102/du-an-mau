/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import dao.NhanVienDAO;
import utils.Auth;
import utils.MsgBox;

/**
 *
 * @author ASUS
 */
public class DoiMatKhauJDialog extends javax.swing.JFrame {

    NhanVienDAO dao = new NhanVienDAO();

    /**
     * Creates new form DoimatkhauJframe
     */
    public DoiMatKhauJDialog() {
        initComponents();
        init();

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
        btndoi = new javax.swing.JButton();
        btnhuy = new javax.swing.JButton();
        txtten = new javax.swing.JTextField();
        lblten = new javax.swing.JLabel();
        lblmatkhauhientai = new javax.swing.JLabel();
        lblxacNhan = new javax.swing.JLabel();
        lblmatkhaumoi = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMKHienTai = new javax.swing.JPasswordField();
        txtMatKhauMoi = new javax.swing.JPasswordField();
        txtMKXacNhan = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đổi Mật Khẩu");

        btndoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/arrows-circle.png"))); // NOI18N
        btndoi.setText("Đổi mật khẩu");
        btndoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoiActionPerformed(evt);
            }
        });

        btnhuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/stop.png"))); // NOI18N
        btnhuy.setText("Hủy Bỏ");
        btnhuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhuyActionPerformed(evt);
            }
        });

        lblten.setText("Tên đăng nhập");

        lblmatkhauhientai.setText("Mật khẩu hiện tại");

        lblxacNhan.setText("Xác Nhận Mật khẩu mới");

        lblmatkhaumoi.setText("Mật Khẩu mới");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("      Đổi Mật Khẩu");

        txtMKHienTai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMKHienTaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblten)
                                    .addComponent(lblmatkhauhientai))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(txtMKHienTai))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblmatkhaumoi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblxacNhan)
                                .addGap(18, 18, 18)
                                .addComponent(txtMKXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btndoi, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnhuy, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblten)
                    .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmatkhauhientai)
                    .addComponent(txtMKHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmatkhaumoi)
                    .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblxacNhan)
                    .addComponent(txtMKXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnhuy)
                    .addComponent(btndoi))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhuyActionPerformed
        // TODO add your handling code here:
        thoat();
    }//GEN-LAST:event_btnhuyActionPerformed

    private void btndoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndoiActionPerformed
        // TODO add your handling code here:
        doiMatKhau();
    }//GEN-LAST:event_btndoiActionPerformed

    private void txtMKHienTaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMKHienTaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMKHienTaiActionPerformed

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
            java.util.logging.Logger.getLogger(DoiMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoiMatKhauJDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndoi;
    private javax.swing.JButton btnhuy;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblmatkhauhientai;
    private javax.swing.JLabel lblmatkhaumoi;
    private javax.swing.JLabel lblten;
    private javax.swing.JLabel lblxacNhan;
    private javax.swing.JPasswordField txtMKHienTai;
    private javax.swing.JPasswordField txtMKXacNhan;
    private javax.swing.JPasswordField txtMatKhauMoi;
    private javax.swing.JTextField txtten;
    // End of variables declaration//GEN-END:variables

    void doiMatKhau() {
        try {
            String maNV = txtten.getText();
            String matKhau = new String(txtMKHienTai.getPassword());
            String matKhauMoi = new String(txtMatKhauMoi.getPassword());
            String matKhauMoi2 = new String(txtMKXacNhan.getPassword());
            if (maNV.length() == 0) {
                MsgBox.alert(this, "Tên đang nhập đang trống");
                txtten.requestFocus();
                return;
            }
            if (matKhau.length() == 0) {
                MsgBox.alert(this, "Mật khẩu đang trống");
                txtMKHienTai.requestFocus();
                return;
            }
            if (matKhauMoi.length() == 0) {
                MsgBox.alert(this, "Mật khẩu mới đang trống");
                txtMatKhauMoi.requestFocus();
                return;
            }
            if (matKhauMoi2.length() == 0) {
                MsgBox.alert(this, "Mật khẩu xác nhận đang trống");
                txtMKXacNhan.requestFocus();
                return;
            }
            if (!maNV.equalsIgnoreCase(Auth.user.getMaNV())) {
                MsgBox.alert(this, "Sai tên đăng nhập!");
            } else if (!matKhau.equals(Auth.user.getMatKhau())) {
                MsgBox.alert(this, "Sai mật khẩu!");
            } else if (!matKhauMoi.equals(matKhauMoi2)) {
                MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
            } else {
                Auth.user.setMatKhau((matKhauMoi));
                dao.update(Auth.user);
                MsgBox.alert(this, "Đổi mật khẩu thành công!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void init() {
        setLocationRelativeTo(null);
        NhanVienDAO dao = new NhanVienDAO();
    }

    void thoat() {
        if (MsgBox.confirm(this, "Bạn có muốn thoát?")) {
            this.dispose();
        }
    }
}