import java.sql.*;
import java.io.*;
import java.util.*;

public class common_prescription {
	public ArrayList<String> mid = new ArrayList<>();
	public ArrayList<String> medicine_name = new ArrayList<>();
	public ArrayList<String> count_prescriptions = new ArrayList<>();
	
	public void handle_query() {
	      try (Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhil");
	         Statement stmt = conn.createStatement();) {
	         String query = "select m.mid, name, no_of_prescriptions from (select mid, count(mid) as no_of_prescriptions from prescribes_m group by mid order by no_of_prescriptions desc) as num, medicine m where num.mid = m.mid";
	         ResultSet rset = stmt.executeQuery(query);
	         while(rset.next()) {	        	
	        	mid.add(String.valueOf(rset.getInt("mid")));
	            medicine_name.add(rset.getString("name"));
	            count_prescriptions.add(String.valueOf(rset.getInt("no_of_prescriptions")));
	         }	 
	      } catch(SQLException ex) {
	         ex.printStackTrace();
	      }
	   }
	
	public void run_query(){
		handle_query();
	}

}
