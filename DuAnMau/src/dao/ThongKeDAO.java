/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author LENOVO
 */
public class ThongKeDAO {

    private List<Object[]> getListOfArray(String sql, String[] cols, Object... agrs) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, agrs);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    public List<Object[]>getBangDiem(int maKH){
        String sql="{CALL sp_BangDiem(?)}";
        String[]cols={"MaNH","HoTen","Diem"};
        return getListOfArray(sql, cols, maKH);
    }
    public List<Object[]>getLuongNguoiHoc(){
        String sql="{CALL sp_LuongNguoiHoc}";
        String[]cols={"Nam","SoLuong","DauTien","CuoiCung"};
        return getListOfArray(sql, cols);
    }
    public List<Object[]>getDiemChuyenDe(){
        String sql="{CALL sp_DiemChuyenDe}";
        String[]cols={"ChuyenDe","SoHV","ThapNhat","CaoNhat","TrungBinh"};
        return getListOfArray(sql, cols);
    }
    public List<Object[]>getDoanhThu(int nam){
        String sql="{CALL sp_DoanhThu(?)}";
        String[]cols={"ChuyenDe","SoKH","SoHV","DoanhThu","ThapNhat","CaoNhat","TrungBinh"};
        return getListOfArray(sql, cols, nam);
    }
}
