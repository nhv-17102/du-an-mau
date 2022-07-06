/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.HocVien;
import entity.KhoaHoc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author LENOVO
 */
public class HocVienDAO extends EduSysDAO<HocVien, Integer> {
    
    final String INSERT_SQL = "INSERT INTO HocVien(MaKH ,MANH,Diem)VALUES(?,?,?)";
    final String UPDATE_SQL = "update HocVien set Diem=? where MaHV=?";
    final String DELETE_SQL = "delete from HocVien where  MaHV=?";
    final String SELECT_ALL_SQL = "select *from HocVien";
    final String SELECT_BY_ID_SQL = "select *from HocVien where MaHV=?";
    
    @Override
    public void insert(HocVien entity) {
        XJdbc.update(INSERT_SQL, entity.getMaKH(), entity.getMaNH(), entity.getDiem());
    }
    
    @Override
    public void update(HocVien entity) {
        XJdbc.update(UPDATE_SQL,entity.getDiem(), entity.getMaHV());
    }
    
    @Override
    public void delete(Integer id) {
        XJdbc.update(DELETE_SQL, id);
    }
    
    @Override
    public List<HocVien> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }
    
    @Override
    public HocVien selectById(Integer id) {
        List<HocVien> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    @Override
    public List<HocVien> selectBySql(String sql, Object... agrs) {
        List<HocVien> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, agrs);
            while (rs.next()) {
                HocVien entity = new HocVien();
                entity.setMaHV(rs.getInt("MaHV"));
                entity.setMaKH(rs.getInt("MaKH"));
                entity.setMaNH(rs.getString("MaNH"));
                entity.setDiem(rs.getDouble("Diem"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;
    }
    public List<HocVien>selectByKhoaHoc(int maKH){
        String sql="select *from HocVien where MaKH=?";
        return this.selectBySql(sql, maKH);
    }
}
