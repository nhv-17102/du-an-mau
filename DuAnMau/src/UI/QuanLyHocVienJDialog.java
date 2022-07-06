package UI;

import dao.ChuyenDeDAO;
import dao.HocVienDAO;
import dao.KhoaHocDAO;
import dao.NguoiHocDAO;
import entity.ChuyenDe;
import entity.HocVien;
import entity.KhoaHoc;
import entity.NguoiHoc;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import utils.Auth;
import utils.MsgBox;
import utils.XDate;

public class QuanLyHocVienJDialog extends javax.swing.JFrame {

    ChuyenDeDAO cddao = new ChuyenDeDAO();
    HocVienDAO hvdao = new HocVienDAO();
    NguoiHocDAO nhdao = new NguoiHocDAO();
    KhoaHocDAO khdao = new KhoaHocDAO();

    public QuanLyHocVienJDialog() {
        initComponents();
        setLocationRelativeTo(null);
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelChuyenDe = new javax.swing.JPanel();
        cboChuyenDe = new javax.swing.JComboBox<>();
        panelKhoaHoc = new javax.swing.JPanel();
        cboKhoaHoc = new javax.swing.JComboBox<>();
        Tabs = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSachHV = new javax.swing.JTable();
        btnCapNhatDiem = new javax.swing.JButton();
        btnXoaKhoiKH = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        panelTimKiem = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDanhSachNH = new javax.swing.JTable();
        btnThemVaoKH = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EduSys_Quản lý học viên");

        panelChuyenDe.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CHUYÊN ĐỀ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        cboChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChuyenDeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelChuyenDeLayout = new javax.swing.GroupLayout(panelChuyenDe);
        panelChuyenDe.setLayout(panelChuyenDeLayout);
        panelChuyenDeLayout.setHorizontalGroup(
            panelChuyenDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuyenDeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboChuyenDe, 0, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelChuyenDeLayout.setVerticalGroup(
            panelChuyenDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelChuyenDeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelKhoaHoc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "KHÓA HỌC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        cboKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKhoaHocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelKhoaHocLayout = new javax.swing.GroupLayout(panelKhoaHoc);
        panelKhoaHoc.setLayout(panelKhoaHocLayout);
        panelKhoaHocLayout.setHorizontalGroup(
            panelKhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKhoaHocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboKhoaHoc, 0, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelKhoaHocLayout.setVerticalGroup(
            panelKhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKhoaHocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblDanhSachHV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TT", "Mã HV", "Mã NH", "HỌ VÀ TÊN", "ĐIỂM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSachHV.setFocusCycleRoot(true);
        tblDanhSachHV.setRowHeight(22);
        jScrollPane1.setViewportView(tblDanhSachHV);
        if (tblDanhSachHV.getColumnModel().getColumnCount() > 0) {
            tblDanhSachHV.getColumnModel().getColumn(0).setMaxWidth(60);
            tblDanhSachHV.getColumnModel().getColumn(1).setMaxWidth(80);
            tblDanhSachHV.getColumnModel().getColumn(2).setMaxWidth(80);
            tblDanhSachHV.getColumnModel().getColumn(3).setMaxWidth(300);
            tblDanhSachHV.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        btnCapNhatDiem.setText("Cập nhật điểm");
        btnCapNhatDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatDiemActionPerformed(evt);
            }
        });

        btnXoaKhoiKH.setText("Xóa khỏi khóa học");
        btnXoaKhoiKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaKhoiKHActionPerformed(evt);
            }
        });

        jButton1.setText("Xuất");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoaKhoiKH)
                .addGap(4, 4, 4)
                .addComponent(btnCapNhatDiem)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaKhoiKH)
                    .addComponent(btnCapNhatDiem)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        Tabs.addTab("Học viên", jPanel3);

        panelTimKiem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TÌM KIẾM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTimKiemLayout = new javax.swing.GroupLayout(panelTimKiem);
        panelTimKiem.setLayout(panelTimKiemLayout);
        panelTimKiemLayout.setHorizontalGroup(
            panelTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTimKiemLayout.setVerticalGroup(
            panelTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblDanhSachNH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ NH", "HỌ VÀ TÊN", "GIỚI TÍNH", "NGÀY SINH", "ĐIỆN THOẠI", "EMAIL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSachNH.setRowHeight(22);
        jScrollPane2.setViewportView(tblDanhSachNH);

        btnThemVaoKH.setText("Thêm vào khóa học");
        btnThemVaoKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemVaoKHActionPerformed(evt);
            }
        });

        jButton2.setText("Xuất");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(panelTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThemVaoKH)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemVaoKH)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        Tabs.addTab("Người học", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Tabs)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tabs)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChuyenDeActionPerformed
        // TODO add your handling code here:
        fillComboBoxKhoaHoc();
    }//GEN-LAST:event_cboChuyenDeActionPerformed

    private void cboKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKhoaHocActionPerformed
        // TODO add your handling code here:
        fillTableHocVien();
    }//GEN-LAST:event_cboKhoaHocActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        fillTableNguoiHoc();
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnCapNhatDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatDiemActionPerformed
        // TODO add your handling code here:
        updateDiem();

    }//GEN-LAST:event_btnCapNhatDiemActionPerformed

    private void btnXoaKhoiKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaKhoiKHActionPerformed
        // TODO add your handling code here:
        removeHocVien();
    }//GEN-LAST:event_btnXoaKhoiKHActionPerformed

    private void btnThemVaoKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemVaoKHActionPerformed
        // TODO add your handling code here:
        addHocVien();
    }//GEN-LAST:event_btnThemVaoKHActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyHocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyHocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyHocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyHocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyHocVienJDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JButton btnCapNhatDiem;
    private javax.swing.JButton btnThemVaoKH;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoaKhoiKH;
    private javax.swing.JComboBox<String> cboChuyenDe;
    private javax.swing.JComboBox<String> cboKhoaHoc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelChuyenDe;
    private javax.swing.JPanel panelKhoaHoc;
    private javax.swing.JPanel panelTimKiem;
    private javax.swing.JTable tblDanhSachHV;
    private javax.swing.JTable tblDanhSachNH;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
    void init() {
        this.setLocationRelativeTo(null);
        this.fillComboBoxChuyenDe();
    }

    private void fillComboBoxChuyenDe() {
        DefaultComboBoxModel mol = (DefaultComboBoxModel) cboChuyenDe.getModel();
        mol.removeAllElements();
        try {
            List<ChuyenDe> list = cddao.selectAll();
            for (ChuyenDe cd : list) {
                mol.addElement(cd);
            }
            this.fillComboBoxKhoaHoc();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void fillComboBoxKhoaHoc() {
        DefaultComboBoxModel mol = (DefaultComboBoxModel) cboKhoaHoc.getModel();
        mol.removeAllElements();
        try {
            ChuyenDe chuyenDe = (ChuyenDe) cboChuyenDe.getSelectedItem();
            if (chuyenDe != null) {
                List<KhoaHoc> list = khdao.selectByChuyenDe(chuyenDe.getMaCD());
                for (KhoaHoc kh : list) {
                    mol.addElement(kh);
                }
                this.fillTableHocVien();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void fillTableHocVien() {
        DefaultTableModel mol = (DefaultTableModel) tblDanhSachHV.getModel();
        mol.setRowCount(0);
        try {
            KhoaHoc kHoc = (KhoaHoc) this.cboKhoaHoc.getSelectedItem();
            if (kHoc != null) {
                List<HocVien> list = hvdao.selectByKhoaHoc(kHoc.getMaKH());
                for (int i = 0; i < list.size(); i++) {
                    HocVien hv = list.get(i);
                    String hoTen = nhdao.selectById(hv.getMaNH()).getHoten();
                    mol.addRow(new Object[]{i + 1, hv.getMaHV(), hv.getMaNH(), hoTen, hv.getDiem()});
                }
                this.fillTableNguoiHoc();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void fillTableNguoiHoc() {
        DefaultTableModel mol = (DefaultTableModel) tblDanhSachNH.getModel();
        mol.setRowCount(0);
        try {
            KhoaHoc kHoc = (KhoaHoc) this.cboKhoaHoc.getSelectedItem();
            String keyword = txtTimKiem.getText();
            List<NguoiHoc> list = nhdao.selectNotInCourse(kHoc.getMaKH(), keyword);
            for (NguoiHoc nh : list) {
                mol.addRow(new Object[]{
                    nh.getMaNH(), nh.getHoten(), nh.isGioitinh() ? "Nam" : "Nữ",
                    XDate.toString(nh.getNgaysinh()), nh.getDienThoai(), nh.getEmaiil()
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void addHocVien() {
        KhoaHoc kHoc = (KhoaHoc) cboKhoaHoc.getSelectedItem();
        for (int row : tblDanhSachNH.getSelectedRows()) {
            HocVien hv = new HocVien();
            hv.setMaKH(kHoc.getMaKH());
            hv.setDiem(-99);
            hv.setMaNH((String) tblDanhSachNH.getValueAt(row, 0));
            hvdao.insert(hv);
        }
        this.fillTableHocVien();
        this.Tabs.setSelectedIndex(0);
    }

    void removeHocVien() {
        if (!Auth.isManger()) {
            MsgBox.alert(this, "Bạn không có quyền xoá học viên");
        } else {
            if (MsgBox.confirm(this, "Bạn muốn xoá các học viên được chọn?")) {
                for (int row : tblDanhSachHV.getSelectedRows()) {
                    int mahv = (Integer) tblDanhSachHV.getValueAt(row, 0);
                    hvdao.delete(mahv);
                }
                this.fillTableHocVien();
            }
        }

    }

    void updateDiem() {
        for (int i = 0; i < tblDanhSachHV.getRowCount(); i++) {
            int mahv = (Integer) tblDanhSachHV.getValueAt(i, 1);
            HocVien hv = hvdao.selectById(mahv);
            hv.setDiem((Double) tblDanhSachHV.getValueAt(i, 4));
            hvdao.update(hv);
        }
        MsgBox.alert(this, "Cập nhật điểm thành công");
    }
    void ghiFile() {
        JFileChooser chooser = new JFileChooser();
        int i = chooser.showSaveDialog(chooser);
        if (i == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try {
                FileWriter out = new FileWriter(file + ".xls");
                BufferedWriter bwrite = new BufferedWriter(out);
                DefaultTableModel model = (DefaultTableModel) tblDanhSachHV.getModel();
                // ten Cot
                for (int j = 0; j < tblDanhSachHV.getColumnCount(); j++) {
                    bwrite.write(model.getColumnName(j) + "\t");
                }
                bwrite.write("\n");
                // Lay du lieu dong
                for (int j = 0; j < tblDanhSachHV.getRowCount(); j++) {
                    for (int k = 0; k < tblDanhSachHV.getColumnCount(); k++) {
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
