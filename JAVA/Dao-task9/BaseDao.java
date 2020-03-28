package com.Dao;

import java.sql.*;
import java.util.List;
import java.util.Vector;

/**
 * 数据库操作类
 * @author MikyMing
 * @data 2020/3/26 - 19:45
 */

public class BaseDao {

    private static Connection con;

    private static PreparedStatement pstm; // Statement

    public static Vector select(String sql, List<String> list) throws SQLException {
        Vector<String> vector = new Vector<>();
        con = new DbConnector().getConnection();
        pstm = con.prepareStatement(sql);
        for(int i=0;i<list.size();i++)
        {
            pstm.setString(i+1,list.get(i));
        }
        ResultSet resultSet =pstm.executeQuery();
        ResultSetMetaData rmd = resultSet.getMetaData();
        int col = rmd.getColumnCount();
        while(resultSet.next())
        {
            for(int i=1;i<=col;i++)
            {
                vector.add(resultSet.getString(i));
            }
        }
        resultSet.close();
        pstm.close();
        con.close();
        return vector;
    }

    public static Vector<Vector<String>> selectAll(String sql, List<String> list) throws SQLException {
        Vector<Vector<String>> vectors = new Vector<>();
        con = new DbConnector().getConnection();
        pstm = con.prepareStatement(sql);
        for(int i=0;i<list.size();i++)
        {
            pstm.setString(i+1, list.get(i));

        }
        ResultSet resultSet = pstm.executeQuery();
        ResultSetMetaData rmd = resultSet.getMetaData();
        int col = rmd.getColumnCount();
        while(resultSet.next())
        {
            Vector<String> vector = new Vector<>();
            for(int i=1;i<=col;i++)
            {
                vector.add(resultSet.getString(i));
            }
            vectors.add(vector);
        }
        resultSet.close();
        pstm.close();
        con.close();
        return vectors;
    }


    //插入数据
    public static int insert(String sql, List<String> list) {

        con = new DbConnector().getConnection();
        try {
            pstm = con.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for(int i =0;i<list.size();i++)
        {
            try {
                pstm.setString(i+1, list.get(i));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        int insertCount=0;
        try {
            insertCount = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return insertCount;
    }

    public static int update(String sql, List<String> list) throws SQLException {
        int updateCount =0;
        con = new DbConnector().getConnection();
        pstm = con.prepareStatement(sql);
        for(int i=0;i<list.size();i++)
        {
            pstm.setString(i+1, list.get(i));
        }
        updateCount = pstm.executeUpdate();
        pstm.close();
        con.close();
        return updateCount;
    }

}
