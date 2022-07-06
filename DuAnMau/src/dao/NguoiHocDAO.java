/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.NguoiHoc;
import entity.NhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author LENOVO
 */
public class NguoiHocDAO extends EduSysDAO<NguoiHoc, String> {

    final String INSERT_SQL = "INSERT INTO NguoiHoc (MANH  ,Hoten ,Gioitinh ,Ngaysinh ,Emaiil,DienThoai,Ghichu,MaNV,NgayDK)\n"
            + "VALUES(?,?,?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "update NguoiHoc set Hoten=?,Gioitinh=?,Ngaysinh=?,Emaiil=?,DienThoai=?,Ghichu=?,MaNV=?,NgayDK=? where MANH=?";
    final String DELETE_SQL = "delete from NguoiHoc where  MANH=?";
    final String SELECT_ALL_SQL = "SELECT *\n"
            + "  FROM NguoiHoc";
    final String SELECT_BY_ID_SQL = "SELECT *\n"
            + "  FROM NguoiHoc where MANH=?";

    @Override
    public void insert(NguoiHoc entity) {
        XJdbc.update(INSERT_SQL, entity.getMaNH(), entity.getHoten(), entity.isGioitinh(), entity.getNgaysinh(), entity.getEmaiil(), entity.getDienThoai(), entity.getGhichu(),
                entity.getMaNV(), entity.getNgayDK());
    }

    @Override
    public void update(NguoiHoc entity) {
        XJdbc.update(UPDATE_SQL, entity.getHoten(), entity.isGioitinh(), entity.getNgaysinh(), entity.getEmaiil(), entity.getDienThoai(), entity.getGhichu(), entity.getMaNV(),
                entity.getNgayDK(), entity.getMaNH());
    }

    @Override
    public void delete(String id) {
        XJdbc.update(DELETE_SQL, id);
    }

    @Override
    public List<NguoiHoc> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NguoiHoc selectById(String id) {
        List<NguoiHoc> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NguoiHoc> selectBySql(String sql, Object... agrs) {
        List<NguoiHoc> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, agrs);
            while (rs.next()) {
                NguoiHoc entity = new NguoiHoc();
                entity.setMaNH(rs.getString("MANH"));
                entity.setHoten(rs.getString("Hoten"));
                entity.setGioitinh(rs.getBoolean("Gioitinh"));
                entity.setNgaysinh(rs.getDate("Ngaysinh"));
                entity.setEmaiil(rs.getString("Emaiil"));
                entity.setDienThoai(rs.getString("DienThoai"));
                entity.setGhichu(rs.getString("Ghichu"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setNgayDK(rs.getDate("NgayDK"));
                list.add(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();

        }
        return list;
    }

    public List<NguoiHoc> selectByKeyword(String keyword) {
        String sql = "SELECT*FROM NGUOIHOC where hoten like ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    public List<NguoiHoc> selectNotInCourse(int makh, String keyword) {
        String sql = "select * from NguoiHoc Where HoTen like ? and MaNH not in (select MaNH from HocVien Where MaKH=?)";
        return this.selectBySql(sql, "%" + keyword + "%", makh);
    }
}
