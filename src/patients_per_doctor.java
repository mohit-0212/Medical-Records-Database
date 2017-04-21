import java.sql.*;
import java.io.*;
import java.util.*;

public class patients_per_doctor {
	public ArrayList<String> doctor_name = new ArrayList<>();
	public ArrayList<String> patients_count = new ArrayList<>();
	
	public void handle_query(String input) {
	      try (Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhil");
	         Statement stmt = conn.createStatement();) {
	         String query = "select name, no_of_patients from (select did, count(pid) as no_of_patients  from consults where did = " + input + " group by did) as num, doctor d where num.did = d.did";
	         ResultSet rset = stmt.executeQuery(query);
	         while(rset.next()) {	        	
	            doctor_name.add(rset.getString("name"));
	            patients_count.add(String.valueOf(rset.getDouble("no_of_patients")));
	         }	 
	      } catch(SQLException ex) {
	         ex.printStackTrace();
	      }
	   }
	
	public void run_query(String input){
		handle_query(input);
	}


}
