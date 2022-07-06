/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.NhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author LENOVO
 */
public class NhanVienDAO extends EduSysDAO<NhanVien, String> {

    final String INSERT_SQL = "INSERT INTO NhanVien(MaNV,MatKhau,HoTen,VaiTro) VALUES(?,?,?,?)";
    final String UPDATE_SQL = "update NhanVien set MatKhau=?,HoTen=?,VaiTro=? where MaNV=?";
    final String DELETE_SQL = "delete from NhanVien where  MaNV=?";
    final String SELECT_ALL_SQL = "select *from NhanVien";
    final String SELECT_BY_ID_SQL = "select *from NhanVien where MaNV=?";

    @Override
    public void insert(NhanVien entity) {
        XJdbc.update(INSERT_SQL, entity.getMaNV(), entity.getMatKhau(), entity.getHoTen(), entity.isVaiTro());
    }

    @Override
    public void update(NhanVien entity) {
        XJdbc.update(UPDATE_SQL, entity.getMatKhau(), entity.getHoTen(), entity.isVaiTro(), entity.getMaNV());
    }

    @Override
    public void delete(String id) {
        XJdbc.update(DELETE_SQL, id);
    }

    @Override
    public List<NhanVien> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien selectById(String id) {
        List<NhanVien> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setVaiTro(rs.getBoolean("VaiTro"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;
    }

}
