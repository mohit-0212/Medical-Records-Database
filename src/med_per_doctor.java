import java.sql.*;
import java.io.*;
import java.util.*;

public class med_per_doctor {
	public ArrayList<String> mid = new ArrayList<>();
	public ArrayList<String> med_name = new ArrayList<>();
	public ArrayList<String> count_med = new ArrayList<>();
	
	public void handle_query(String n, String did) {
	      try (Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhil");
	         Statement stmt = conn.createStatement();) {
	         String query = "select med.mid, name, mid_count from (select mid, mid_count from (select mid, count(mid) as mid_count from prescribe_m where did = "+ did + " group by mid) as m where mid_count > "+ n + " ) as num, medicine med where num.mid = med.mid";
	         ResultSet rset = stmt.executeQuery(query);
	         while(rset.next()) {	        	
	        	mid.add(String.valueOf(rset.getInt("mid")));
	            med_name.add(rset.getString("name"));
	            count_med.add(String.valueOf(rset.getInt("mid_count")));
	         }	 
	      } catch(SQLException ex) {
	         ex.printStackTrace();
	      }
	   }
	
	public void run_query(String n, String did){
		handle_query(n, did);
	}

}
