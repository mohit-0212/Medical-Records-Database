import java.sql.*;
import java.io.*;
import java.util.*;

public class cash_bills {
	public ArrayList<String> bno = new ArrayList<>();
	public ArrayList<String> bill_name = new ArrayList<>();
	public ArrayList<String> bill_date = new ArrayList<>();
	
	public void handle_query() {
	      try (Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhil");
	         Statement stmt = conn.createStatement();) {
	         String query = "select bno,name,bdate from bill where payment_mode = \"cash\"";
	         ResultSet rset = stmt.executeQuery(query);
	         while(rset.next()) {	        	
	        	bno.add(String.valueOf(rset.getInt("bno")));
	            bill_name.add(rset.getString("name"));
	            bill_date.add((rset.getDate("bdate")).toString());
	         }	 
	      } catch(SQLException ex) {
	         ex.printStackTrace();
	      }
	   }
	
	public void run_query(){
		handle_query();
	}


}
