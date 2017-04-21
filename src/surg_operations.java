import java.sql.*;
import java.io.*;
import java.util.*;

public class surg_operations {
	public ArrayList<String> sid = new ArrayList<>();
	public ArrayList<String> surg_name = new ArrayList<>();
	public ArrayList<String> count_ops = new ArrayList<>();
	
	public void handle_query() {
	      try (Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhil");
	         Statement stmt = conn.createStatement();) {
	         String query = "select num.sid, d.name, no_of_ops from (select sid, count(opid) as no_of_ops from performs_o group by sid order by no_of_ops desc) as num, is_a i, doctor d where num.sid=i.sid and i.did=d.did";
	         ResultSet rset = stmt.executeQuery(query);
	         while(rset.next()) {	        	
	        	sid.add(String.valueOf(rset.getInt("sid")));
	            surg_name.add(rset.getString("name"));
	            count_ops.add(String.valueOf(rset.getInt("no_of_ops")));
	         }	 
	      } catch(SQLException ex) {
	         ex.printStackTrace();
	      }
	   }
	
	public void run_query(){
		handle_query();
	}

}
