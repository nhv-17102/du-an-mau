package UI;

import dao.ChuyenDeDAO;
import dao.KhoaHocDAO;
import entity.ChuyenDe;
import entity.KhoaHoc;
import entity.NhanVien;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.Auth;
import utils.MsgBox;
import utils.XDate;

public class QuanLyKhoaHocJDialog extends javax.swing.JFrame {

    KhoaHocDAO dao = new KhoaHocDAO();
    ChuyenDeDAO cddao = new ChuyenDeDAO();
    int row = -1;
    ArrayList<KhoaHoc> listKH = new ArrayList<>();

    public QuanLyKhoaHocJDialog() {
        initComponents();
        init();
    }

    public QuanLyKhoaHocJDialog(EduSysJDialog aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        panelChuyenDe = new javax.swing.JPanel();
        cboChuyenDe = new javax.swing.JComboBox<>();
        Tabs = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        lblChuyenDe = new javax.swing.JLabel();
        lblChuyenDe_DuocChon = new javax.swing.JLabel();
        lblHocPhi = new javax.swing.JLabel();
        txtHocPhi = new javax.swing.JTextField();
        lblNguoiTao = new javax.swing.JLabel();
        txtNguoiTao = new javax.swing.JTextField();
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
        lblKhaiGiang = new javax.swing.JLabel();
        txtKhaiGiang = new javax.swing.JTextField();
        lblThoiLuong = new javax.swing.JLabel();
        txtThoiLuong = new javax.swing.JTextField();
        lblNgayTao = new javax.swing.JLabel();
        txtNgayTao = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDanhSachKHoc = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EduSys_Quản lý khóa học");

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 0, 0));
        lblTitle.setText("CHUYÊN ĐỀ");

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
                .addComponent(cboChuyenDe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelChuyenDeLayout.setVerticalGroup(
            panelChuyenDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuyenDeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblChuyenDe.setText("Chuyên Đề");

        lblChuyenDe_DuocChon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblChuyenDe_DuocChon.setForeground(new java.awt.Color(255, 0, 0));
        lblChuyenDe_DuocChon.setText("123456789");

        lblHocPhi.setText("Học phí");

        txtHocPhi.setEditable(false);
        txtHocPhi.setBackground(new java.awt.Color(204, 204, 204));

        lblNguoiTao.setText("Người tạo");

        txtNguoiTao.setEditable(false);
        txtNguoiTao.setBackground(new java.awt.Color(204, 204, 204));

        lblGhiChu.setText("Ghi chú");

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane1.setViewportView(txtGhiChu);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");

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

        lblKhaiGiang.setText("Khai giảng");

        lblThoiLuong.setText("Thời lượng (Giờ)");

        txtThoiLuong.setEditable(false);
        txtThoiLuong.setBackground(new java.awt.Color(204, 204, 204));

        lblNgayTao.setText("Ngày tạo");

        txtNgayTao.setEditable(false);
        txtNgayTao.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                        .addComponent(btnDauTien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuayLai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTiepTheo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCuoiCung))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblChuyenDe)
                            .addComponent(lblChuyenDe_DuocChon)
                            .addComponent(lblHocPhi)
                            .addComponent(lblNguoiTao)
                            .addComponent(lblGhiChu)
                            .addComponent(txtHocPhi)
                            .addComponent(txtNguoiTao, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKhaiGiang)
                                    .addComponent(lblThoiLuong)
                                    .addComponent(lblNgayTao))
                                .addGap(192, 192, 192))
                            .addComponent(txtNgayTao)
                            .addComponent(txtThoiLuong)
                            .addComponent(txtKhaiGiang))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChuyenDe)
                    .addComponent(lblKhaiGiang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChuyenDe_DuocChon)
                    .addComponent(txtKhaiGiang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHocPhi)
                    .addComponent(lblThoiLuong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNguoiTao)
                    .addComponent(lblNgayTao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNguoiTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblGhiChu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnMoi)
                    .addComponent(btnDauTien)
                    .addComponent(btnQuayLai)
                    .addComponent(btnTiepTheo)
                    .addComponent(btnCuoiCung))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tabs.addTab("Cập Nhật", jPanel3);

        tblDanhSachKHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ KH", "THỜI LƯỢNG", "HỌC PHÍ", "KHAI GIẢNG", "TẠO BỞI", "NGÀY TẠO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSachKHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDanhSachKHocMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblDanhSachKHoc);
        if (tblDanhSachKHoc.getColumnModel().getColumnCount() > 0) {
            tblDanhSachKHoc.getColumnModel().getColumn(0).setMaxWidth(80);
            tblDanhSachKHoc.getColumnModel().getColumn(2).setMaxWidth(80);
            tblDanhSachKHoc.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addContainerGap())
        );

        Tabs.addTab("Danh Sách", jPanel4);

        jButton1.setText("Xuất");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Tabs)
                    .addComponent(panelChuyenDe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void cboChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChuyenDeActionPerformed
        chonChuyenDe();
    }//GEN-LAST:event_cboChuyenDeActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed

        clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void tblDanhSachKHocMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachKHocMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.row = tblDanhSachKHoc.rowAtPoint(evt.getPoint());
            edit();
        }
    }//GEN-LAST:event_tblDanhSachKHocMousePressed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ghiFile();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyKhoaHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyKhoaHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyKhoaHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyKhoaHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyKhoaHocJDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JButton btnCuoiCung;
    private javax.swing.JButton btnDauTien;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTiepTheo;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboChuyenDe;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblChuyenDe;
    private javax.swing.JLabel lblChuyenDe_DuocChon;
    private javax.swing.JLabel lblGhiChu;
    private javax.swing.JLabel lblHocPhi;
    private javax.swing.JLabel lblKhaiGiang;
    private javax.swing.JLabel lblNgayTao;
    private javax.swing.JLabel lblNguoiTao;
    private javax.swing.JLabel lblThoiLuong;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelChuyenDe;
    private javax.swing.JTable tblDanhSachKHoc;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtHocPhi;
    private javax.swing.JTextField txtKhaiGiang;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtNguoiTao;
    private javax.swing.JTextField txtThoiLuong;
    // End of variables declaration//GEN-END:variables
 void fillComboBoxChuyenDe() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) this.cboChuyenDe.getModel();
        model.removeAllElements();;
        List<ChuyenDe> list = cddao.selectAll();
        for (ChuyenDe cd : list) {
            model.addElement(cd);
        }

    }

    private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) this.tblDanhSachKHoc.getModel();
        model.setRowCount(0);
        try {
            ChuyenDe cd = (ChuyenDe) this.cboChuyenDe.getSelectedItem();
            List<KhoaHoc> list = dao.selectByChuyenDe(cd.getMaCD());
            for (KhoaHoc kh : list) {
                Object row[] = {kh.getMaKH(), kh.getThoiLuong(), kh.getHocPhi(), XDate.toString(kh.getNgayKG()), kh.getMaNV(), XDate.toString(kh.getNgayTao())};
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void chonChuyenDe() {
        ChuyenDe cd = (ChuyenDe) this.cboChuyenDe.getSelectedItem();
        txtThoiLuong.setText(String.valueOf(cd.getThoiLuong()));
        txtHocPhi.setText(String.valueOf(cd.getHocPhi()));
        lblChuyenDe_DuocChon.setText(cd.getTenCD());
        txtGhiChu.setText(cd.getTenCD());
        fillTable();
        row = -1;
        updateStatus();
        Tabs.setSelectedIndex(1);
    }

    private void updateStatus() {
        boolean edit = (row >= 0);
        boolean first = (row == 0);
        boolean last = (row == tblDanhSachKHoc.getRowCount() - 1);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
        btnDauTien.setEnabled(edit && !first);
        btnQuayLai.setEnabled(edit && !first);
        btnTiepTheo.setEnabled(edit && !last);
        btnCuoiCung.setEnabled(edit && !last);

    }

    void setForm(KhoaHoc kh) {
        txtGhiChu.setText(kh.getGhiChu());
        txtHocPhi.setText(kh.getHocPhi() + "");
        txtKhaiGiang.setText(XDate.toString(kh.getNgayKG()));
        txtNgayTao.setText(XDate.toString(kh.getNgayTao()));
        txtNguoiTao.setText(kh.getMaNV());
        txtThoiLuong.setText(kh.getThoiLuong() + "");

    }

    KhoaHoc getForm() {
        KhoaHoc kh = new KhoaHoc();
        ChuyenDe chuyenDe = (ChuyenDe) cboChuyenDe.getSelectedItem();
        kh.setNgayKG(XDate.toDate(txtKhaiGiang.getText()));
        kh.setHocPhi(Double.valueOf(txtHocPhi.getText()));
        kh.setThoiLuong(Integer.valueOf(txtThoiLuong.getText()));
        kh.setMaNV(Auth.user.getMaNV());
        kh.setNgayTao(XDate.now());
        kh.setGhiChu(txtGhiChu.getText());
        kh.setMaCD(chuyenDe.getMaCD());
        return kh;
    }

    void clearForm() {
        KhoaHoc kh = new KhoaHoc();
        setForm(kh);
        txtHocPhi.setText("");
        txtThoiLuong.setText("");
        row = -1;
        updateStatus();
    }

    void edit() {
        int maKH = (int) tblDanhSachKHoc.getValueAt(row, 0);
        KhoaHoc kh = dao.selectById(maKH);
        if (kh != null) {
            setForm(kh);
            Tabs.setSelectedIndex(0);
            updateStatus();
        }

    }

    void insert() {
        try {
            Date ngay = XDate.toDate(txtKhaiGiang.getText(), "dd/MM/yyyy");
        } catch (Exception e) {
            MsgBox.alert(this, "Không đúng định dạng ngày");
            txtKhaiGiang.setBackground(Color.yellow);
            txtKhaiGiang.requestFocus();
            return;
        }
        KhoaHoc kh = getForm();
        try {
            dao.insert(kh);
            fillTable();
            clearForm();
            MsgBox.alert(this, "Thêm mới thành công");
        } catch (Exception e) {
            e.printStackTrace();
            //MsgBox.alert(this, "Thêm thất bại");
        }

    }

    void delete() {
        if (!Auth.isManger()) {
            MsgBox.alert(this, "Bạn không có quyền xoá nhân viên");
        } else {
            int maKH = (int) tblDanhSachKHoc.getValueAt(row, 0);
            if (MsgBox.confirm(this, "Xác nhận xoá ?")) {
                try {
                    dao.delete(maKH);
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
        try {
            Date ngay = XDate.toDate(txtKhaiGiang.getText(), "dd/MM/yyyy");
        } catch (Exception e) {
            MsgBox.alert(this, "Không đúng định dạng ngày");
            txtKhaiGiang.setBackground(Color.yellow);
            txtKhaiGiang.requestFocus();
            return;
        }
        KhoaHoc kh = getForm();
        try {
            dao.update(kh);
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
        if (row < tblDanhSachKHoc.getRowCount() - 1) {
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
        row = tblDanhSachKHoc.getRowCount() - 1;
        edit();
    }

    private void init() {
        setLocationRelativeTo(null);
        this.fillComboBoxChuyenDe();
    }

    void ghiFile() {
        JFileChooser chooser = new JFileChooser();
        int i = chooser.showSaveDialog(chooser);
        if (i == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try {
                FileWriter out = new FileWriter(file + ".xls");
                BufferedWriter bwrite = new BufferedWriter(out);
                DefaultTableModel model = (DefaultTableModel) tblDanhSachKHoc.getModel();
                // ten Cot
                for (int j = 0; j < tblDanhSachKHoc.getColumnCount(); j++) {
                    bwrite.write(model.getColumnName(j) + "\t");
                }
                bwrite.write("\n");
                // Lay du lieu dong
                for (int j = 0; j < tblDanhSachKHoc.getRowCount(); j++) {
                    for (int k = 0; k < tblDanhSachKHoc.getColumnCount(); k++) {
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
