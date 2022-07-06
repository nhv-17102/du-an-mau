/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.KhoaHoc;
import entity.NguoiHoc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author LENOVO
 */
public class KhoaHocDAO extends EduSysDAO<KhoaHoc, Integer> {

    final String INSERT_SQL = "INSERT INTO KhoaHoc(MACD,HocPhi,ThoiLuong,NgayKG,GhiChu "
            + ",MaNV,NgayTao)VALUES(?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "update NguoiHoc set MACD=?,HocPhi=?,ThoiLuong=?,NgayKG=?,GhiChu=?,MaNV=?,NgayTao=? where MaKH=?";
    final String DELETE_SQL = "delete from KhoaHoc where  MaKH=?";
    final String SELECT_ALL_SQL = "SELECT *\n"
            + "  FROM KhoaHoc";
    final String SELECT_BY_ID_SQL = "SELECT *\n"
            + "  FROM KhoaHoc where MaKH=?";

    @Override
    public void insert(KhoaHoc entity) {
        XJdbc.update(INSERT_SQL, entity.getMaCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getNgayKG(), entity.getGhiChu(), entity.getMaNV(), entity.getNgayTao());
    }

    @Override
    public void update(KhoaHoc entity) {
        XJdbc.update(UPDATE_SQL, entity.getMaCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getNgayKG(), entity.getGhiChu(), entity.getMaNV(), entity.getNgayTao(), entity.getMaKH());
    }

    @Override
    public void delete(Integer id) {
        XJdbc.update(DELETE_SQL, id);
    }

    @Override
    public List<KhoaHoc> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public KhoaHoc selectById(Integer id) {
        List<KhoaHoc> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<KhoaHoc> selectBySql(String sql, Object... agrs) {
        List<KhoaHoc> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, agrs);
            while (rs.next()) {
                KhoaHoc entity = new KhoaHoc();
                entity.setMaKH(rs.getInt("MaKH"));
                entity.setMaCD(rs.getString("MACD"));
                entity.setHocPhi(rs.getDouble("HocPhi"));
                entity.setThoiLuong(rs.getInt("ThoiLuong"));
                entity.setNgayKG(rs.getDate("NgayKG"));
                entity.setGhiChu(rs.getString("GhiChu"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setNgayTao(rs.getDate("NgayTao"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;
    }

    public List<KhoaHoc> selectByChuyenDe(String maCD) {
        String sql = "Select *from KhoaHoc where MACD=?";
        return selectBySql(sql, maCD);
    }

    public List<Integer> selectYears() {
        String sql = "select distinct year (NgayKG) from KhoaHoc Order by Year(NgayKG) desc ";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
