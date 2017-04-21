import java.sql.*;
import java.io.*;
import java.util.*;

public class patient_frequency {
	public ArrayList<String> pid = new ArrayList<>();
	public ArrayList<String> patient_name = new ArrayList<>();
	public ArrayList<String> frequency = new ArrayList<>();
	
	public void handle_query() {
	      try (Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhil");
	         Statement stmt = conn.createStatement();) {
	         String query = "select p.pid, name, freq from (select pid, datediff(max(date), min(date))/count(date) as freq from consults group by pid) as num, patient p where num.pid = p.pid";
	         ResultSet rset = stmt.executeQuery(query);
	         while(rset.next()) {	        	
	        	pid.add(String.valueOf(rset.getInt("pid")));
	            patient_name.add(rset.getString("name"));
	            frequency.add(String.valueOf(rset.getDouble("freq")));
	         }	 
	      } catch(SQLException ex) {
	         ex.printStackTrace();
	      }
	   }
	
	public void run_query(){
		handle_query();
	}


}


