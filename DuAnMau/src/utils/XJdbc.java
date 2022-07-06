/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.rmi.ConnectIOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class XJdbc {

    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String dburl = "jdbc:sqlserver://localhost;database=Laptrinhcity";
    private static String user = "sa";
    private static String pass = "viet170102";

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static PreparedStatement getStmt(String sql,Object...args)throws SQLException{
        Connection conn=DriverManager.getConnection(dburl,user,pass);
        PreparedStatement stmt;
        if(sql.trim().startsWith("{")){
            stmt=conn.prepareCall(sql);
        }else{
            stmt=conn.prepareStatement(sql);
        }for(int i=0;i<args.length;i++){
            stmt.setObject(i+1, args[i]);
        }
        return stmt;
    }

    public static int update(String sql, Object... agrs) {
        try {
            PreparedStatement stmt = XJdbc.getStmt(sql, agrs);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static ResultSet query(String sql, Object... agrs) throws SQLException {
        PreparedStatement stmt = XJdbc.getStmt(sql, agrs);
        return stmt.executeQuery();
    }

    public static Object values(String sql, Object... agrs) {
        try {
            ResultSet rs = query(sql, agrs);
            if (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
