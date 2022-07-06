package UI;

import dao.NguoiHocDAO;
import dao.NhanVienDAO;
import entity.NguoiHoc;
import entity.NhanVien;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.Auth;
import utils.MsgBox;
import utils.XDate;

public class QuanLyNguoiHocJDialog extends javax.swing.JFrame {

    NguoiHocDAO dao = new NguoiHocDAO();
    int row = -1;
    DefaultTableModel mol;

    public QuanLyNguoiHocJDialog() {
        initComponents();
        setLocationRelativeTo(null);
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        btnGroupGT = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Tabs = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblMaNguoiHoc = new javax.swing.JLabel();
        txtMaNguoiHoc = new javax.swing.JTextField();
        lblHoVaTen = new javax.swing.JLabel();
        txtHoVaTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        lblNgaysinh = new javax.swing.JLabel();
        txtNgaysinh = new javax.swing.JTextField();
        lblDianThoai = new javax.swing.JLabel();
        txtDienThoai = new javax.swing.JTextField();
        lblDiaChiEmail = new javax.swing.JLabel();
        txtDiaChiEmail = new javax.swing.JTextField();
        lblGhiChu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnDauTien = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();
        btnTiepTheo = new javax.swing.JButton();
        btnCuoiCung = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDanhSachNH = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EduSys_Quản lý người học");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("QUẢN LÝ NGƯỜI HỌC");

        lblMaNguoiHoc.setText("Mã người học");

        lblHoVaTen.setText("Họ và tên");

        jLabel4.setText("Giới tính");

        btnGroupGT.add(rdoNam);
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        btnGroupGT.add(rdoNu);
        rdoNu.setText("Nữ");

        lblNgaysinh.setText("Ngày sinh");

        lblDianThoai.setText("Điện thoại");

        lblDiaChiEmail.setText("Địa chỉ email");

        lblGhiChu.setText("Ghi chú");

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(10);
        jScrollPane1.setViewportView(txtGhiChu);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnDauTien.setText("|<");
        btnDauTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDauTienActionPerformed(evt);
            }
        });

        btnQuayLai.setText("<<");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        btnTiepTheo.setText(">>");
        btnTiepTheo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiepTheoActionPerformed(evt);
            }
        });

        btnCuoiCung.setText(">|");
        btnCuoiCung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuoiCungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(txtMaNguoiHoc)
                            .addComponent(txtHoVaTen)
                            .addComponent(lblMaNguoiHoc)
                            .addComponent(lblHoVaTen)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(rdoNam)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdoNu))
                                    .addComponent(lblDianThoai)
                                    .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDiaChiEmail)
                                    .addComponent(txtDiaChiEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNgaysinh))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblGhiChu))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDauTien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuayLai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTiepTheo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCuoiCung)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMaNguoiHoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaNguoiHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHoVaTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblNgaysinh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu)
                    .addComponent(txtNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDianThoai)
                    .addComponent(lblDiaChiEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChiEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblGhiChu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDauTien)
                        .addComponent(btnQuayLai)
                        .addComponent(btnTiepTheo)
                        .addComponent(btnCuoiCung))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem)
                        .addComponent(btnSua)
                        .addComponent(btnXoa)
                        .addComponent(btnMoi)))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Tabs.addTab("Cập nhật", jPanel3);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTimKiem)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        tblDanhSachNH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NH", "Họ và tên", "Giới tính", "Ngày Sinh", "Điện thoại ", "Email", "Mã NV", "Ngày đăng ký"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSachNH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachNHMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDanhSachNHMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblDanhSachNH);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Tabs.addTab("Danh Sách", jPanel5);

        jButton2.setText("Xuất");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDanhSachNHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachNHMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.row = tblDanhSachNH.rowAtPoint(evt.getPoint());
            edit();
        }

    }//GEN-LAST:event_tblDanhSachNHMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnDauTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDauTienActionPerformed
        // TODO add your handling code here:
        first();
    }//GEN-LAST:event_btnDauTienActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        // TODO add your handling code here:
        prev();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnTiepTheoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiepTheoActionPerformed
        // TODO add your handling code here:
        next();
    }//GEN-LAST:event_btnTiepTheoActionPerformed

    private void btnCuoiCungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuoiCungActionPerformed
        // TODO add your handling code here:
        last();
    }//GEN-LAST:event_btnCuoiCungActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        fillTable();
        clearForm();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void tblDanhSachNHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachNHMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.row = tblDanhSachNH.rowAtPoint(evt.getPoint());
            edit();
        }
    }//GEN-LAST:event_tblDanhSachNHMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ghiFile();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyNguoiHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyNguoiHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyNguoiHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyNguoiHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyNguoiHocJDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JButton btnCuoiCung;
    private javax.swing.JButton btnDauTien;
    private javax.swing.ButtonGroup btnGroupGT;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTiepTheo;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDiaChiEmail;
    private javax.swing.JLabel lblDianThoai;
    private javax.swing.JLabel lblGhiChu;
    private javax.swing.JLabel lblHoVaTen;
    private javax.swing.JLabel lblMaNguoiHoc;
    private javax.swing.JLabel lblNgaysinh;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblDanhSachNH;
    private javax.swing.JTextField txtDiaChiEmail;
    private javax.swing.JTextField txtDienThoai;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtHoVaTen;
    private javax.swing.JTextField txtMaNguoiHoc;
    private javax.swing.JTextField txtNgaysinh;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
 private void init() {
        fillTable();
        updateStatus();
    }

    private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblDanhSachNH.getModel();
        model.setRowCount(0);
        try {
            String keyWord = txtTimKiem.getText();
            List<NguoiHoc> list = dao.selectByKeyword(keyWord);
            for (NguoiHoc nh : list) {
                Object row[] = {nh.getMaNH(), nh.getHoten(), nh.isGioitinh() ? "Nam" : "Nữ", XDate.toString(nh.getNgaysinh()), nh.getDienThoai(), nh.getEmaiil(),
                    nh.getMaNV(), XDate.toString(nh.getNgayDK())
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateStatus() {
        boolean edit = (row >= 0);
        boolean first = (row == 0);
        boolean last = (row == tblDanhSachNH.getRowCount() - 1);
        txtMaNguoiHoc.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
        btnDauTien.setEnabled(edit && !first);
        btnQuayLai.setEnabled(edit && !first);
        btnTiepTheo.setEnabled(edit && !last);
        btnCuoiCung.setEnabled(edit && !last);

    }

    void setForm(NguoiHoc nh) {
        txtMaNguoiHoc.setText(nh.getMaNH());
        txtHoVaTen.setText(nh.getHoten());
        if (nh.isGioitinh() == true) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        txtNgaysinh.setText(XDate.toString(nh.getNgaysinh()));
        txtDienThoai.setText(nh.getDienThoai());
        txtDiaChiEmail.setText(nh.getEmaiil());
        txtGhiChu.setText(nh.getGhichu());
    }

    NguoiHoc getForm() {
        NguoiHoc nh = new NguoiHoc();
        nh.setMaNH(txtMaNguoiHoc.getText());
        nh.setHoten(txtHoVaTen.getText());
        boolean gioiTinh;
        if (rdoNam.isSelected()) {
            gioiTinh = true;
        } else {
            gioiTinh = false;
        }
        nh.setGioitinh(gioiTinh);
        nh.setNgaysinh(XDate.toDate(txtNgaysinh.getText()));
        nh.setDienThoai(txtDienThoai.getText());
        nh.setEmaiil(txtDiaChiEmail.getText());
        nh.setGhichu(txtGhiChu.getText());
        nh.setMaNV(Auth.user.getMaNV());
        nh.setNgayDK(XDate.now());
        return nh;
    }

    void clearForm() {

        NguoiHoc nh = new NguoiHoc();
        setForm(nh);
        txtNgaysinh.setText("");
        row = -1;
        updateStatus();
    }

    void edit() {
        try {
            String manh = (String) tblDanhSachNH.getValueAt(this.row, 0);
            NguoiHoc nh = dao.selectById(manh);
            if (nh != null) {
                this.setForm(nh);
                this.updateStatus();
                Tabs.setSelectedIndex(0);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void insert() {
        String p_hoten = "[a-zA-Z ]+";
        String email = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        String p_sdt = "0[0-9]{9}";
        if (txtMaNguoiHoc.getText().length() == 0) {
            MsgBox.alert(this, "Không để trống MÃ NGƯỜI HỌC");
            txtMaNguoiHoc.requestFocus();
            return;
        } else {
            if (dao.selectById(txtMaNguoiHoc.getText()) != null) {
                MsgBox.alert(this, "Đã có mã");
                txtMaNguoiHoc.requestFocus();
                return;
            }
        }
        if (txtHoVaTen.getText().length() == 0) {
            MsgBox.alert(this, "Không để trống HỌ TÊN");
            txtHoVaTen.requestFocus();
            return;
        } else if (txtHoVaTen.getText().matches(p_hoten) == false) {
            MsgBox.alert(this, "HỌ TÊN không đúng");
            txtHoVaTen.requestFocus();
            return;
        } else if (txtNgaysinh.getText().length() == 0) {
            MsgBox.alert(this, "Không để trống NGÀY SINH");
            txtNgaysinh.requestFocus();
            return;
        } else {
            try {
                Date ngay = XDate.toDate(txtNgaysinh.getText(), "dd/MM/yyyy");
            } catch (Exception e) {
                MsgBox.alert(this, "Không đúng định dạng ngày");
                txtNgaysinh.requestFocus();
                return;
            }
        }
        if (txtDienThoai.getText().length() == 0) {
            MsgBox.alert(this, "Không để trống SDT");
            txtDienThoai.requestFocus();
            return;
        } else if (txtDienThoai.getText().matches(p_sdt) == false) {
            MsgBox.alert(this, "SDT không đúng");
            txtDienThoai.requestFocus();
            return;
        } else if (txtDiaChiEmail.getText().length() == 0) {
            MsgBox.alert(this, "Không để trống ĐỊA CHỈ EMAIL");
            txtDiaChiEmail.requestFocus();
            return;
        } else if (txtDiaChiEmail.getText().matches(email) == false) {
            MsgBox.alert(this, "EMAIL không đúng");
            txtDiaChiEmail.requestFocus();
            return;
        }
        NguoiHoc nh = getForm();
        try {
            dao.insert(nh);
            fillTable();
            clearForm();
            MsgBox.alert(this, "Thêm mới thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void delete() {
        if (!Auth.isManger()) {
            MsgBox.alert(this, "Bạn không có quyền xoá NGƯỜI HỌC");
        } else {
            String maNH = txtMaNguoiHoc.getText();
            if (MsgBox.confirm(this, "Xác nhận xoá ?")) {
                try {
                    dao.delete(maNH);                    
                    fillTable();
                    clearForm();
                    MsgBox.alert(this, "Xoá thành công!");
                } catch (Exception e) {
                    MsgBox.alert(this, "Xoá thất bại");
                }
            }
        }
    }

    void update() {
        NguoiHoc nh = getForm();
        String email = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        String p_hoten = "[a-zA-Z ]+";
        String p_sdt = "0[0-9]{9}";
        if (txtMaNguoiHoc.getText().length() == 0) {
            MsgBox.alert(this, "Không để trống MÃ NGƯỜI HỌC");
            txtMaNguoiHoc.requestFocus();
            return;
        }
        if (txtHoVaTen.getText().length() == 0) {
            MsgBox.alert(this, "Không để trống HỌ TÊN");
            txtHoVaTen.requestFocus();
            return;
        } else if (txtHoVaTen.getText().matches(p_hoten) == false) {
            MsgBox.alert(this, "HỌ TÊN không đúng");
            txtHoVaTen.requestFocus();
            return;
        } else if (txtNgaysinh.getText().length() == 0) {
            MsgBox.alert(this, "Không để trống NGÀY SINH");
            txtNgaysinh.requestFocus();
            return;
        } else {
            try {
                Date ngay = XDate.toDate(txtNgaysinh.getText(), "dd/MM/yyyy");
            } catch (Exception e) {
                MsgBox.alert(this, "Không đúng định dạng ngày");
                txtNgaysinh.requestFocus();
                return;
            }
        }
        if (txtDienThoai.getText().length() == 0) {
            MsgBox.alert(this, "Không để trống SDT");
            txtDienThoai.requestFocus();
            return;
        } else if (txtDienThoai.getText().matches(p_sdt) == false) {
            MsgBox.alert(this, "SDT không đúng");
            txtDienThoai.requestFocus();
            return;
        } else if (txtDiaChiEmail.getText().length() == 0) {
            MsgBox.alert(this, "Không để trống ĐỊA CHỈ EMAIL");
            txtDiaChiEmail.requestFocus();
            return;
        } else if (txtDiaChiEmail.getText().matches(email) == false) {
            MsgBox.alert(this, "EMAIL không đúng định dạng");
            txtDiaChiEmail.requestFocus();
            return;
        }
        try {
            dao.update(nh);
            fillTable();
            MsgBox.alert(this, "Cập nhật thành công");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại");
        }

    }

    void first() {
        row = 0;
        edit();
    }

    void next() {
        if (row < tblDanhSachNH.getRowCount() - 1) {
            row++;
            edit();
        }
    }

    void prev() {
        row--;
        edit();

    }

    void last() {
        row = tblDanhSachNH.getRowCount() - 1;
        edit();
    }

    void timKiem() {
        fillTable();
        clearForm();
        row = -1;
        updateStatus();
    }
    void ghiFile() {
        JFileChooser chooser = new JFileChooser();
        int i = chooser.showSaveDialog(chooser);
        if (i == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try {
                FileWriter out = new FileWriter(file + ".xls");
                BufferedWriter bwrite = new BufferedWriter(out);
                DefaultTableModel model = (DefaultTableModel) tblDanhSachNH.getModel();
                // ten Cot
                for (int j = 0; j < tblDanhSachNH.getColumnCount(); j++) {
                    bwrite.write(model.getColumnName(j) + "\t");
                }
                bwrite.write("\n");
                // Lay du lieu dong
                for (int j = 0; j < tblDanhSachNH.getRowCount(); j++) {
                    for (int k = 0; k < tblDanhSachNH.getColumnCount(); k++) {
                        bwrite.write(model.getValueAt(j, k) + "\t");
                    }
                    bwrite.write("\n");
                }
                bwrite.close();
                JOptionPane.showMessageDialog(null, "Lưu file thành công!");
            } catch (Exception e2) {
                JOptionPane.showMessageDialog(null, "Lỗi khi lưu file!");
            }
        }
    }
}
