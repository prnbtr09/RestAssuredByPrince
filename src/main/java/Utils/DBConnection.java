package Utils;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DBConnection {
//	private static Connection DBConnection=null;
//	
//	public static Connection connectDataBase()
//	{
//	String dbURL = Propertiesmethods.getPropertyValue("dbUrl");
//	String dbuUserName = Propertiesmethods.getPropertyValue("dbUsername");
//	String dbPassword = Propertiesmethods.getPropertyValue("dbPassword");
//	String dbDriver = Propertiesmethods.getPropertyValue("dbDriver");
//	
//	//establishingDB Connection
//	DBConnection = establishDataBaseConnection(dbDriver, dbURL, dbuUserName, dbPassword);
//	}
//		
//	public static Connection establishDataBaseConnection(String dbDriver,String dbURL, String dbuUserName,String dbPassword )
//	{
//		Connection conn=null;
//		Class.forName(dbDriver).newInstance();
//		conn = DriverManager.getConnection(dbURL, dbuUserName, dbPassword);
//		conn.setAutoCommit(false);
//		
//		return Connection;
//	}
//	
//	
//
//	// get result from database
//	public static ResultSet getResultSet(Connection Conn, String strQuery) {
//		Statement stmt = null;
//		ResultSet rs = null;
//		try {
//			stmt = Conn.createStatement();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//		try {
//			rs = stmt.executeQuery(strQuery);
//
//		} catch (SQLException e) {
//			System.err.println(e.getClass().getName() + ": " + e.getMessage());
//			System.exit(0);
//		}
//
//		return rs;
//
//	}
//
//	/**
//	 * Function will return the field value from the database.
//	 * 
//	 * @param sqlQuery
//	 *            the sql query
//	 * @param column
//	 *            the column for which value has to get
//	 * @param conn
//	 *            the conn
//	 * @return the field value
//	 * @throws SQLException
//	 *             the SQL exception
//	 */
//	public  String getColumnValue(String sqlQuery, String column, Connection conn) throws SQLException {
//		String temp = null;
//		Statement sta = conn.createStatement();
//		ResultSet rs = sta.executeQuery(sqlQuery);
//		if (rs.next()) {
//			temp = rs.getString(column);
//		}
//
//		return temp;
//	}
//
//	public ResultSet getResults(String sqlQuery, Connection conn) throws SQLException {
//		String temp = null;
//		Statement sta = conn.createStatement();
//		ResultSet rs = sta.executeQuery(sqlQuery);
//		return rs;
//	}
//
//	// update/delete in database
//	public void setData(Connection Conn, String strQuery) {
//		Statement stmt = null;
//
//		try {
//			stmt = Conn.createStatement();
//			stmt.executeUpdate(strQuery);
//			Conn.commit();
//
//		} catch (SQLException e) {
//			System.err.println(e.getClass().getName() + ": " + e.getMessage());
//			System.exit(0);
//		}
//
//	}
//	
//	public boolean updateData(String sqlQuery,  Connection conn) {
//		boolean flag=false;
//		
//		try {
//			Statement sta = conn.createStatement();
//			sta.executeUpdate(sqlQuery);
//			conn.commit();
//			flag=true;
//		}catch(Exception ex) {
//			
//		}
//		return flag;		
//	
//	}
//	
//
//	public static HashMap<String, Object> getDataFromQuery(Connection con, String query) throws SQLException {
//		ResultSet res = DatabaseConnection.getResultSet(con, query);
//		ResultSetMetaData rsmd = res.getMetaData();
//
//		HashMap<String, Object> map = new HashMap<String, Object>();
//		res.next();
//		int numColumns = rsmd.getColumnCount();
//		String column_name = "";
//		for (int i = 1; i <= numColumns; i++) {
//			column_name = rsmd.getColumnName(i);
//			map.put(column_name, res.getObject(column_name));
//		}
//		return map;
//	}
//
//	/*
//	 *  Method to map multiple set of data fetched from database
//	 */
//	public static List<HashMap<String, Object>> getDataListFromQuery(Connection con, String query) throws SQLException {
//		List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
//		ResultSet res = DatabaseConnection.getResultSet(con, query);
//		ResultSetMetaData rsmd = res.getMetaData();
//		int numColumns = 0;
//		String column_name = "";
//		numColumns = rsmd.getColumnCount();
//		HashMap<String, Object> map;
//		while (res.next()) {
//			map = new HashMap<String, Object>();
//			for (int i = 1; i <= numColumns; i++) {
//				column_name = rsmd.getColumnName(i);
//				map.put(column_name, res.getObject(column_name));
//			}
//			list.add(map);
//		}
//		return list;
//
//	}
}
