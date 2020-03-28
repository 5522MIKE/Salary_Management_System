package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 数据库连接类
 * @author MikyMing
 * @data 2020/3/26 - 19:45
 */
public class DbConnector {
    private Connection con;
    private String dbDriver="com.mysql.jdbc.Driver";
    private String dbUser ="root";
    private String dbPsw ="123456";
    private String dbUrl ="jdbc:mysql://localhost:3306/xcglxt";

    public Connection getConnection()
    {
        try {
            Class.forName(dbDriver);
            System.out.println("数据库驱动加载成功！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            con = DriverManager.getConnection(dbUrl, dbUser, dbPsw);
            System.out.println("数据库连接成功！");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }

}