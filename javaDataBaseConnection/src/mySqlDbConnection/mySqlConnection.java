package mySqlDbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * external mysql-connector-java-5.1.40-bin.jar is need to be added. 
 * */
class mysqlConnecion{
	Connection con;
	ResultSet rs;
	
	public void connectionInitialize() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ForHack","root","root");  
			//here ForHack is database name, root is username and password  
		 
	}
	public void query(String str) throws SQLException{
		Statement stmt=con.createStatement();  
		rs =stmt.executeQuery(str);  
	}
	public void displayQueryResult() throws SQLException{
		
		System.out.println(rs.getFetchDirection());
		System.out.println(rs.getFetchSize());
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); 				
		}
	}
	public void connectionClose() throws SQLException{
		con.close();
	}
	
}


public class mySqlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mysqlConnecion con1 = new mysqlConnecion();
		try {
			con1.connectionInitialize();
			con1.query("select * from users");
			con1.displayQueryResult();
			con1.connectionClose();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
