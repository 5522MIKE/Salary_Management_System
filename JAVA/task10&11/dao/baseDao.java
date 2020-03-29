package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

/**
 * 
 * @author JYF
 *
 */

public class baseDao {

	private static  Connection con;

	private static  PreparedStatement pstm; // Statement

	//TODO 缺少dbConnector类
	//获取单个对象的属性
	public static Vector select(String sql, List<String> list) throws SQLException {
		Vector<String> vector = new Vector<>();			//作为返回值
		con = new dbConnector().getConnection();		//连接数据库
		pstm = con.prepareStatement(sql);				//获取操作对象
		for(int i=0;i<list.size();i++)					//循环遍历，设置操作参数
		{
			pstm.setString(i+1,list.get(i));
		}	
		ResultSet resultSet =pstm.executeQuery();		//结果集
		ResultSetMetaData rmd = resultSet.getMetaData();//获取结果集原信息对象
		int col = rmd.getColumnCount();					//获取结果集列数
		while(resultSet.next())							//获取对象的所有属性
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

	
	//TODO 缺少dbConnector类
	//多对象查询
	public static Vector<Vector<String>> selectAll(String sql, List<String> list) throws SQLException {
		Vector<Vector<String>> vectors = new Vector<>();
		con = new dbConnector().getConnection();
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
	
	//TODO 缺少dbConnector类
   //插入数据
	public static int insert(String sql, List<String> list) {		
		
		con = new dbConnector().getConnection();
		try {
			pstm = con.prepareStatement(sql);
		} catch (SQLException e) {
			//TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		for(int i =0;i<list.size();i++)
		{
			try {
				pstm.setString(i+1, list.get(i));
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		int insertCount=0;
		try {
			 insertCount = pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}		
		try {
			pstm.close();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return insertCount;
	}
	//TODO 缺少dbConnector类
	//数据库更新
	public static int update(String sql, List<String> list) throws SQLException {
		int updateCount =0;
		con = new dbConnector().getConnection();
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
