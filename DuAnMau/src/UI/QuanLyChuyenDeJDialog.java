package UI;

import dao.ChuyenDeDAO;
import entity.ChuyenDe;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;
import javafx.stage.FileChooser;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.Auth;
import utils.MsgBox;
import utils.XImage;

public class QuanLyChuyenDeJDialog extends javax.swing.JFrame {

    JFileChooser fileChooser = new JFileChooser();
    ChuyenDeDAO dao = new ChuyenDeDAO();
    int row = -1;

    public QuanLyChuyenDeJDialog() {
        initComponents();
        setLocationRelativeTo(null);
        init();
    }

    public QuanLyChuyenDeJDialog(EduSysJDialog aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lblHinhLogo = new javax.swing.JLabel();
        lblMaChuyenDe = new javax.swing.JLabel();
        lblMotaChuyenDe = new javax.swing.JLabel();
        txtMaChuyenDe = new javax.swing.JTextField();
        lblTenChuyenDe = new javax.swing.JLabel();
        txtTenChuyenDe = new javax.swing.JTextField();
        lblThoiLuong = new javax.swing.JLabel();
        txtThoiLuong = new javax.swing.JTextField();
        lblHocPhi = new javax.swing.JLabel();
        txtHocPhi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnDauTien = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();
        btnTiepTheo = new javax.swing.JButton();
        btnCuoiCung = new javax.swing.JButton();
        lblHinhAnh = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDanhSachCD = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EdySys_Quản lý chuyên đề");

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 51, 204));
        lblTitle.setText("QUẢN LÝ CHUYÊN ĐỀ");

        lblHinhLogo.setText("Hình logo");

        lblMaChuyenDe.setText("Mã chuyên đề ");

        lblMotaChuyenDe.setText("Mô tả chuyên đề");

        lblTenChuyenDe.setText("Tên chuyên đề");

        lblThoiLuong.setText("Thời lượng (Giờ)");

        lblHocPhi.setText("Học phí");

        txtMoTa.setColumns(20);
        txtMoTa.setRows(12);
        jScrollPane1.setViewportView(txtMoTa);

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

        lblHinhAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinhAnh.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblHinhAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhAnhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMotaChuyenDe)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMoi)
                        .addGap(18, 18, 18)
                        .addComponent(btnDauTien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuayLai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTiepTheo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCuoiCung))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblHinhLogo)
                                .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblMaChuyenDe)
                                .addComponent(txtMaChuyenDe, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                .addComponent(lblTenChuyenDe)
                                .addComponent(txtTenChuyenDe, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                .addComponent(lblThoiLuong)
                                .addComponent(txtThoiLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                .addComponent(lblHocPhi)
                                .addComponent(txtHocPhi)))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHinhLogo)
                    .addComponent(lblMaChuyenDe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtMaChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTenChuyenDe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblThoiLuong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblHocPhi))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblHinhAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblMotaChuyenDe)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnMoi)
                    .addComponent(btnDauTien)
                    .addComponent(btnQuayLai)
                    .addComponent(btnTiepTheo)
                    .addComponent(btnCuoiCung))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cập Nhật", jPanel2);

        tblDanhSachCD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã CD", "Tên CD", "Học Phí", "Thời lượng", "Hình"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSachCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDanhSachCDMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblDanhSachCD);
        if (tblDanhSachCD.getColumnModel().getColumnCount() > 0) {
            tblDanhSachCD.getColumnModel().getColumn(0).setMaxWidth(80);
            tblDanhSachCD.getColumnModel().getColumn(1).setMaxWidth(300);
            tblDanhSachCD.getColumnModel().getColumn(2).setMaxWidth(80);
            tblDanhSachCD.getColumnModel().getColumn(3).setMaxWidth(80);
            tblDanhSachCD.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Danh Sách", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnCuoiCungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuoiCungActionPerformed
        // TODO add your handling code here:
        last();

    }//GEN-LAST:event_btnCuoiCungActionPerformed

    private void lblHinhAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhAnhMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            chonAnh();
        }
    }//GEN-LAST:event_lblHinhAnhMouseClicked

    private void tblDanhSachCDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachCDMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            row = tblDanhSachCD.rowAtPoint(evt.getPoint());
            edit();
        }
    }//GEN-LAST:event_tblDanhSachCDMousePressed

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
            java.util.logging.Logger.getLogger(QuanLyChuyenDeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyChuyenDeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyChuyenDeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyChuyenDeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyChuyenDeJDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCuoiCung;
    private javax.swing.JButton btnDauTien;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTiepTheo;
    private javax.swing.JButton btnXoa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblHinhAnh;
    private javax.swing.JLabel lblHinhLogo;
    private javax.swing.JLabel lblHocPhi;
    private javax.swing.JLabel lblMaChuyenDe;
    private javax.swing.JLabel lblMotaChuyenDe;
    private javax.swing.JLabel lblTenChuyenDe;
    private javax.swing.JLabel lblThoiLuong;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblDanhSachCD;
    private javax.swing.JTextField txtHocPhi;
    private javax.swing.JTextField txtMaChuyenDe;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtTenChuyenDe;
    private javax.swing.JTextField txtThoiLuong;
    // End of variables declaration//GEN-END:variables
    private void init() {
        //      setIconImage(XImage.getAppIcon());
        fillTable();
    }

    private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblDanhSachCD.getModel();
        model.setRowCount(0);
        try {
            List<ChuyenDe> list = dao.selectAll();
            for (ChuyenDe nv : list) {
                Object row[] = {nv.getMaCD(), nv.getTenCD(), nv.getHocPhi(), nv.getThoiLuong(), nv.getHinh()};
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vẫn dữ liệu");
        }
    }

    void setForm(ChuyenDe model) {
        txtMaChuyenDe.setText(model.getMaCD());
        txtTenChuyenDe.setText(model.getTenCD());
        txtThoiLuong.setText(String.valueOf(model.getThoiLuong()));
        txtHocPhi.setText(String.valueOf(model.getHocPhi()));
        txtMoTa.setText(model.getMoTa());
        if (model.getHinh() != null) {
            lblHinhAnh.setToolTipText(model.getHinh());
            lblHinhAnh.setIcon(XImage.read(model.getHinh()));
        }
    }

    ChuyenDe getForm() {

        ChuyenDe cd = new ChuyenDe();
        cd.setMaCD(txtMaChuyenDe.getText());
        cd.setTenCD(txtTenChuyenDe.getText());
        cd.setThoiLuong(Integer.valueOf(txtThoiLuong.getText()));
        cd.setHocPhi(Double.valueOf(txtHocPhi.getText()));
        cd.setMoTa(txtMoTa.getText());
        cd.setHinh(lblHinhAnh.getToolTipText());
        return cd;
    }

    void clearForm() {
        ChuyenDe cd = new ChuyenDe();
        setForm(cd);
        row = -1;
        updateStatus();
    }

    void chonAnh() {
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            XImage.save(file);
            ImageIcon icon = XImage.read(file.getName());
            lblHinhAnh.setIcon(icon);
            lblHinhAnh.setToolTipText(file.getName());
        }
    }

    void edit() {
        try {
            String maCD = (String) tblDanhSachCD.getValueAt(this.row, 0);
            ChuyenDe cd = dao.selectById(maCD);
            if (cd != null) {
                setForm(cd);
                updateStatus();
                jTabbedPane1.setSelectedIndex(0);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    private void updateStatus() {
        boolean edit = (row >= 0);
        boolean first = (row == 0);
        boolean last = (row == tblDanhSachCD.getRowCount() - 1);
        txtMaChuyenDe.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
        btnDauTien.setEnabled(edit && !first);
        btnQuayLai.setEnabled(edit && !first);
        btnTiepTheo.setEnabled(edit && !last);
        btnCuoiCung.setEnabled(edit && !last);

    }

    void insert() {
        int thoiLuong;
        double hocPhi;
        if (txtMaChuyenDe.getText().length() > 5) {
            MsgBox.alert(this, "Mã chuyên đề không được lớn hơn 5 kí tự");
            txtMaChuyenDe.requestFocus();
            return;
        } else if (txtMaChuyenDe.getText().length() == 0) {
            MsgBox.alert(this, "Mã chuyên đề không được để trống");
            txtMaChuyenDe.requestFocus();
            return;
        } else {
            if (dao.selectById(txtMaChuyenDe.getText()) != null) {
                MsgBox.alert(this, "Đã có mã");
                txtMaChuyenDe.requestFocus();
                return;
            }
        }
        if (txtTenChuyenDe.getText().length() == 0) {
            MsgBox.alert(this, "Không để trống tên chuyên đề");
            txtTenChuyenDe.requestFocus();
            return;
        }
        try {
            thoiLuong = Integer.valueOf(txtThoiLuong.getText());
        } catch (Exception e) {
            MsgBox.alert(this, "Thời lượng phải là số");
            return;
        }
        try {
            hocPhi = Double.valueOf(txtThoiLuong.getText());
        } catch (Exception e) {
            MsgBox.alert(this, "Học phí phải là số");
            return;
        }
        ChuyenDe cd = getForm();
        try {
            dao.insert(cd);
            fillTable();
            clearForm();
            MsgBox.alert(this, "Thêm mới thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void delete() {
        if (!Auth.isManger()) {
            MsgBox.alert(this, "Bạn không có quyền xoá chuyên đề");
        } else {
            String maCD = txtMaChuyenDe.getText();
            if (maCD.equals(Auth.user.getMaNV())) {
            } else if (MsgBox.confirm(this, "Xác nhận xoá ?")) {

                try {
                    dao.delete(maCD);
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
        int thoiLuong;
        double hocPhi;
        if (txtMaChuyenDe.getText().length() > 5) {
            MsgBox.alert(this, "Mã chuyên đề không được lớn hơn 5 kí tự");
            txtMaChuyenDe.requestFocus();
            return;
        } else if (txtTenChuyenDe.getText().length() == 0) {
            MsgBox.alert(this, "Không để trống tên chuyên đề");
            txtTenChuyenDe.requestFocus();
            return;
        }
        try {
            thoiLuong = Integer.valueOf(txtThoiLuong.getText());
        } catch (Exception e) {
            MsgBox.alert(this, "Thời lượng phải là số");
            return;
        }
        try {
            hocPhi = Double.valueOf(txtThoiLuong.getText());
        } catch (Exception e) {
            MsgBox.alert(this, "Học phí phải là số");
            return;
        }
        ChuyenDe cd = getForm();

        try {
            dao.update(cd);
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
        if (row < tblDanhSachCD.getRowCount() - 1) {
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
        row = tblDanhSachCD.getRowCount() - 1;
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
                DefaultTableModel model = (DefaultTableModel) tblDanhSachCD.getModel();
                // ten Cot
                for (int j = 0; j < tblDanhSachCD.getColumnCount(); j++) {
                    bwrite.write(model.getColumnName(j) + "\t");
                }
                bwrite.write("\n");
                // Lay du lieu dong
                for (int j = 0; j < tblDanhSachCD.getRowCount(); j++) {
                    for (int k = 0; k < tblDanhSachCD.getColumnCount(); k++) {
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
