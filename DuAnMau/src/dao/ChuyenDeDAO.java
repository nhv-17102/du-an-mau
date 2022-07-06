/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.ChuyenDe;
import entity.KhoaHoc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author LENOVO
 */
public class ChuyenDeDAO extends EduSysDAO<ChuyenDe, String> {

    final String INSERT_SQL = "insert into ChuyenDe(MACD,TenCD,HocPhi,ThoiLuong,Hinh,MoTa) values (?,?,?,?,?,?)";
    final String UPDATE_SQL = "update ChuyenDe set TenCD=?,HocPhi=?,ThoiLuong=?,Hinh=?,MoTa=? where MACD=?";
    final String DELETE_SQL = "delete from ChuyenDe where  MACD=?";
    final String SELECT_ALL_SQL = "select *from ChuyenDe";
    final String SELECT_BY_ID_SQL = "select *from ChuyenDe where MACD=?";

    @Override
    public void insert(ChuyenDe entity) {
        XJdbc.update(INSERT_SQL, entity.getMaCD(), entity.getTenCD(), entity.getHocPhi(), entity.getThoiLuong(),entity.getHinh(),entity.getMoTa());
    }

    @Override
    public void update(ChuyenDe entity) {
        XJdbc.update(UPDATE_SQL,entity.getTenCD(),entity.getHocPhi(),entity.getThoiLuong(),entity.getHinh(),entity.getMoTa(),entity.getMaCD());
    }

    @Override
    public void delete(String id) {
        XJdbc.update(DELETE_SQL, id);
    }

    @Override
    public List<ChuyenDe> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ChuyenDe selectById(String id) {
        List<ChuyenDe> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<ChuyenDe> selectBySql(String sql, Object... agrs) {
        List<ChuyenDe> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, agrs);
            while (rs.next()) {
                ChuyenDe entity = new ChuyenDe();
                entity.setMaCD(rs.getString("MACD"));
                entity.setTenCD(rs.getString("TenCD"));
                entity.setHocPhi(rs.getDouble("HocPhi"));
                entity.setThoiLuong(rs.getInt("ThoiLuong"));
                entity.setHinh(rs.getString("Hinh"));
                entity.setMoTa(rs.getString("MoTa"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;
    }
    

}
