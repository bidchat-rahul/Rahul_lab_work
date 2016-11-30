package oracleDbConnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.*;
class oracleConnecction{
	public Connection start() {
	try {
		
	Properties property = new Properties();
	property.load(new FileInputStream("."+File.separator+"src"+File.separator+"oracleDbConnection"+File.separator+"config"));
	
	String usrName = property.getProperty("userName");
	String passwd = property.getProperty("passwd");
	String url = property.getProperty("dbURL");
	
	Connection con = DriverManager.getConnection(url,usrName,passwd);
	
	return con;
	
	} catch (Exception e) {
		System.out.println("error in connectivityOracle"+e);
		}
	return null;
}
	
	
	
	public ResultSet exicutionSelect(Connection con, String Query) throws SQLException {
	
		// step3 create the statement object
	Statement stmt = con.createStatement();
	
	// step4 execute query
		ResultSet rs = stmt.executeQuery(Query);
		return rs;
	
	}
	public boolean exicutionInsert(Connection con, String Query) throws SQLException {
	
		// step3 create the statement object
		Statement stmt = con.createStatement();
	
		stmt.executeQuery(Query);
		
		return true;
	
	}
	public void displayQueryResult(ResultSet rs) throws SQLException{
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)); 				
		}
	}
	
	public void close(Connection con) throws SQLException {
		con.close();
	}
}
public class dbConnection {

	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		oracleConnecction oc = new oracleConnecction();
		Connection con ;
		ResultSet rs;
		System.out.println("."+File.separator+"src"+File.separator+"oracleDbConnection"+File.separator+"config");
		String query = "Select * from test1";
		con = oc.start();
		rs = oc.exicutionSelect(con, query);
		oc.displayQueryResult(rs);
		oc.close(con);

	}

}
