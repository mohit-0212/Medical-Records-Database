import java.sql.*;
import java.io.*;
import java.util.*;

public class common_disease {
	public ArrayList<String> diid = new ArrayList<>();
	public ArrayList<String> disease_name = new ArrayList<>();
	public ArrayList<String> count_patients = new ArrayList<>();
	
	public void handle_query() {
	      try (Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhil");
	         Statement stmt = conn.createStatement();) {
	         String query = "select d.diid, name, no_of_patients from (select diid, count(pid) as no_of_patients  from has group by diid order by no_of_patients desc) as num, disease d where num.diid=d.diid";
	         ResultSet rset = stmt.executeQuery(query);
	         while(rset.next()) {	        	
	        	diid.add(String.valueOf(rset.getInt("diid")));
	            disease_name.add(rset.getString("name"));
	            count_patients.add(String.valueOf(rset.getInt("no_of_patients")));
	         }	 
	      } catch(SQLException ex) {
	         ex.printStackTrace();
	      }
	   }
	
	public void run_query(){
		handle_query();
	}

}
