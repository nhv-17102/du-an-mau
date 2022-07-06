package UI;

import dao.NhanVienDAO;
import entity.NhanVien;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.Auth;
import utils.MsgBox;

public class QuanLyNhanVienJDialog extends javax.swing.JFrame {

    NhanVienDAO dao = new NhanVienDAO();
    int row = -1;
    int i = 1;
    DefaultTableModel mol;
    ArrayList<NhanVien> listNV = new ArrayList<>();

    public QuanLyNhanVienJDialog() {
        initComponents();
        setLocationRelativeTo(null);
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupVaiTro = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        PanelCapNhat = new javax.swing.JPanel();
        lblMaNV = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        lblMatKhau = new javax.swing.JLabel();
        lblXacNhan = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        lblVaiTro = new javax.swing.JLabel();
        rdoTruongPhong = new javax.swing.JRadioButton();
        rdoNhanVien = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnDauTien = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();
        btnTiepTheo = new javax.swing.JButton();
        btnCuoi = new javax.swing.JButton();
        txtMatKhau = new javax.swing.JPasswordField();
        txtMatKhau2 = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        panelDanhSach = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSachNV = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EduSys_Quản lý nhân viên");

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 51, 204));
        lblTitle.setText("QUẢN LÝ NHÂN VIÊN QUẢN TRỊ");

        lblMaNV.setText("Mã nhân viên");

        lblMatKhau.setText("Mật khẩu");

        lblXacNhan.setText("Xác nhận mật khẩu");

        lblHoTen.setText("Họ và tên");

        lblVaiTro.setText("Vai trò");

        btnGroupVaiTro.add(rdoTruongPhong);
        rdoTruongPhong.setText("Trưởng phòng ");

        btnGroupVaiTro.add(rdoNhanVien);
        rdoNhanVien.setSelected(true);
        rdoNhanVien.setText("Nhân viên");

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

        btnCuoi.setText(">|");
        btnCuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCapNhatLayout = new javax.swing.GroupLayout(PanelCapNhat);
        PanelCapNhat.setLayout(PanelCapNhatLayout);
        PanelCapNhatLayout.setHorizontalGroup(
            PanelCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCapNhatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaNV)
                    .addComponent(txtHoTen)
                    .addGroup(PanelCapNhatLayout.createSequentialGroup()
                        .addGroup(PanelCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCapNhatLayout.createSequentialGroup()
                                .addComponent(rdoTruongPhong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoNhanVien))
                            .addComponent(lblMaNV)
                            .addComponent(lblMatKhau)
                            .addComponent(lblXacNhan)
                            .addComponent(lblHoTen)
                            .addComponent(lblVaiTro)
                            .addGroup(PanelCapNhatLayout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnXoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMoi)
                                .addGap(66, 66, 66)
                                .addComponent(btnDauTien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnQuayLai)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTiepTheo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCuoi))
                            .addGroup(PanelCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtMatKhau2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMatKhau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelCapNhatLayout.setVerticalGroup(
            PanelCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCapNhatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMaNV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMatKhau)
                .addGap(13, 13, 13)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblXacNhan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMatKhau2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHoTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVaiTro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoTruongPhong)
                    .addComponent(rdoNhanVien))
                .addGap(18, 18, 18)
                .addGroup(PanelCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnMoi)
                    .addComponent(btnDauTien)
                    .addComponent(btnQuayLai)
                    .addComponent(btnTiepTheo)
                    .addComponent(btnCuoi))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(PanelCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(PanelCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cập nhật", jPanel2);

        tblDanhSachNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nhân Viên", "Họ tên", "Chức vụ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSachNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachNVMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDanhSachNVMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhSachNV);

        javax.swing.GroupLayout panelDanhSachLayout = new javax.swing.GroupLayout(panelDanhSach);
        panelDanhSach.setLayout(panelDanhSachLayout);
        panelDanhSachLayout.setHorizontalGroup(
            panelDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDanhSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelDanhSachLayout.setVerticalGroup(
            panelDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDanhSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
        );

        jButton2.setText("Xuất");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(panelDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(49, 49, 49))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(panelDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Danh Sách", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
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

    private void btnCuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuoiActionPerformed
        // TODO add your handling code here:
        last();
    }//GEN-LAST:event_btnCuoiActionPerformed

    private void tblDanhSachNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachNVMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDanhSachNVMouseClicked

    private void tblDanhSachNVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachNVMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.row = tblDanhSachNV.rowAtPoint(evt.getPoint());
            edit();
        }
    }//GEN-LAST:event_tblDanhSachNVMousePressed

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
            java.util.logging.Logger.getLogger(QuanLyNhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyNhanVienJDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCapNhat;
    private javax.swing.JButton btnCuoi;
    private javax.swing.JButton btnDauTien;
    private javax.swing.ButtonGroup btnGroupVaiTro;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTiepTheo;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVaiTro;
    private javax.swing.JLabel lblXacNhan;
    private javax.swing.JPanel panelDanhSach;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoTruongPhong;
    private javax.swing.JTable tblDanhSachNV;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtMatKhau2;
    // End of variables declaration//GEN-END:variables

    private void init() {
        fillTable();
        this.row = -1;
        updateStatus();
    }

    private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblDanhSachNV.getModel();
        model.setRowCount(0);
        try {
            List<NhanVien> list = dao.selectAll();
            for (NhanVien nv : list) {
                Object row[] = {nv.getMaNV(), nv.getHoTen(), nv.isVaiTro() ? "Trưởng phòng" : "Nhân viên"};
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vẫn dữ liệu");
        }
    }

    private void updateStatus() {
        boolean edit = (row >= 0);
        boolean first = (row == 0);
        boolean last = (row == tblDanhSachNV.getRowCount() - 1);
        txtMaNV.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
        btnDauTien.setEnabled(edit && !first);
        btnQuayLai.setEnabled(edit && !first);
        btnTiepTheo.setEnabled(edit && !last);
        btnCuoi.setEnabled(edit && !last);

    }

    void setForm(NhanVien nv) {
        txtMaNV.setText(nv.getMaNV());
        txtHoTen.setText(nv.getHoTen());
        txtMatKhau.setText(nv.getMatKhau());
        txtMatKhau2.setText(nv.getMatKhau());
        if (nv.isVaiTro() == true) {
            rdoTruongPhong.setSelected(true);
        } else {
            rdoNhanVien.setSelected(true);
        }

    }

    NhanVien getForm() {
        NhanVien nv = new NhanVien();
        nv.setMaNV(txtMaNV.getText());
        nv.setHoTen(txtHoTen.getText());
        nv.setMatKhau(new String(txtMatKhau.getPassword()));
        nv.setVaiTro(rdoTruongPhong.isSelected());
        return nv;
    }

    void clearForm() {
        NhanVien nv = new NhanVien();
        setForm(nv);
        row = -1;
        updateStatus();
    }

    void edit() {
        String maNV = (String) tblDanhSachNV.getValueAt(row, 0);
        NhanVien nv = dao.selectById(maNV);
        if (nv != null) {
            setForm(nv);
            jTabbedPane1.setSelectedIndex(0);
            updateStatus();
        }

    }

    void insert() {
        NhanVien nv = getForm();
        if (txtMaNV.getText().length() == 0) {
            MsgBox.alert(this, "Không để trống MÃ NHÂN VIÊN");
            txtMaNV.requestFocus();
            txtMaNV.setBackground(Color.GREEN);
            return;
        }
        if (dao.selectById(txtMaNV.getText()) != null) {
            MsgBox.alert(this, "Đã có mã");
            txtMaNV.requestFocus();
            txtMaNV.setBackground(Color.GREEN);
            return;
        }
        if (txtMatKhau.getText().length() == 0) {
            MsgBox.alert(this, "Không để trống MẬT KHẨU");
            txtMatKhau.requestFocus();
            txtMatKhau.setBackground(Color.GREEN);
            return;
        } else if (txtMatKhau.getText().length() <= 3) {
            MsgBox.alert(this, "MẬT KHẨU quá ngắn");
            txtMatKhau.requestFocus();
            txtMatKhau.setBackground(Color.GREEN);
            return;
        } else if (txtMatKhau2.getText().length() == 0) {
            MsgBox.alert(this, "Không để trống XÁC NHẬN MẬT KHẨU");
            txtMatKhau2.requestFocus();
            txtMatKhau2.setBackground(Color.GREEN);
            return;
        } else if (txtHoTen.getText().length() == 0) {
            MsgBox.alert(this, "Không để trống HỌ TÊN");
            txtHoTen.requestFocus();
            txtHoTen.setBackground(Color.GREEN);
            return;
        }
        String mk2 = new String(txtMatKhau2.getPassword());
        if (!mk2.equals(nv.getMatKhau())) {
            MsgBox.alert(this, "Xác nhận mật khẩu không đúng");
            txtMatKhau2.setBackground(Color.GREEN);
        } else {
            try {
                dao.insert(nv);
                fillTable();
                clearForm();
                MsgBox.alert(this, "Thêm mới thành công")   ;
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm thất bại");
            }

        }

    }

    void delete() {
        if (!Auth.isManger()) {
            MsgBox.alert(this, "Bạn không có quyền xoá nhân viên");
        } else {
            String maNV = txtMaNV.getText();
            if (maNV.equals(Auth.user.getMaNV())) {
                MsgBox.alert(this, "Bạn không có quyền xoá chính bạn");
            } else if (MsgBox.confirm(this, "Xác nhận xoá ?")) {

                try {
                    dao.delete(maNV);
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
        String p_ten = "[a-zA-Z ]+";
        if (!Auth.isManger()) {
            MsgBox.alert(this, "Bạn không có quyền sửa thông tin ");
        } else {
            NhanVien nv = getForm();
            if (txtMatKhau.getText().length() == 0) {
                MsgBox.alert(this, "Không để trống MẬT KHẨU");
                txtMatKhau.requestFocus();
                return;
            } else if (txtMatKhau.getText().length() <= 3) {
                MsgBox.alert(this, "MẬT KHẨU quá ngắn");
                txtMatKhau.requestFocus();
                return;
            } else if (txtMatKhau2.getText().length() == 0) {
                MsgBox.alert(this, "Không để trống XÁC NHẬN MẬT KHẨU");
                txtMatKhau2.requestFocus();
                return;
            } else if (txtHoTen.getText().length() == 0) {
                MsgBox.alert(this, "Không để trống HỌ TÊN");
                txtHoTen.requestFocus();
                return;
            } else if (!txtHoTen.getText().matches(p_ten)) {
                MsgBox.alert(this, "Họ tên không đúng ");
                txtHoTen.requestFocus();
                return;
            }
            String mk2 = new String(txtMatKhau2.getPassword());
            if (!mk2.equals(nv.getMatKhau())) {
                MsgBox.alert(this, "Xác nhận mật khẩu không đúng");
            } else {
                try {
                    dao.update(nv);
                    fillTable();
                    MsgBox.alert(this, "Cập nhật thành công");
                } catch (Exception e) {
                    MsgBox.alert(this, "Cập nhật thất bại");
                }
            }
        }

    }

    void first() {
        row = 0;
        edit();
    }

    void next() {
        if (row < tblDanhSachNV.getRowCount() - 1) {
            row++;
            edit();
        }
    }

    void prev() {
        if (row > 0) {
            row--;
            edit();
        }
    }

    void last() {
        row = tblDanhSachNV.getRowCount() - 1;
        edit();
    }

    void ghiFile() {
        JFileChooser chooser = new JFileChooser();
        int i = chooser.showSaveDialog(chooser);
        if (i == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try {
                FileWriter out = new FileWriter(file + ".xls");
                BufferedWriter bwrite = new BufferedWriter(out);
                DefaultTableModel model = (DefaultTableModel) tblDanhSachNV.getModel();
                // ten Cot
                for (int j = 0; j < tblDanhSachNV.getColumnCount(); j++) {
                    bwrite.write(model.getColumnName(j) + "\t");
                }
                bwrite.write("\n");
                // Lay du lieu dong
                for (int j = 0; j < tblDanhSachNV.getRowCount(); j++) {
                    for (int k = 0; k < tblDanhSachNV.getColumnCount(); k++) {
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
