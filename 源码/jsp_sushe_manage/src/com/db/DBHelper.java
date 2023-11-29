package com.db;

import java.sql.*;

public class DBHelper {	
	private String dbUrl="jdbc:mysql://www.icodedock.com:3306/sushe_manage";
	private String dbUser="sushe_manage";
	private String dbPassword="sushe_manage";
	private String jdbcName="com.mysql.jdbc.Driver";
	
	//�������ݿ�
	public Connection getConn(){
		Connection conn = null;
		try{
			Class.forName(jdbcName);
		}
		catch(Exception e){}
		try{
			conn=DriverManager.getConnection(dbUrl,dbUser,dbPassword);
		}
		catch(SQLException ex){}
		return conn;		
	}
	
//    ����
	public static void main(String[] args)
	{
		System.out.println(new DBHelper().getConn());
		
	}
	
}
