package Dao;

import java.sql.Connection;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbConnector dbc=new DbConnector();
		Connection con=dbc.getConnection();

	}

}
