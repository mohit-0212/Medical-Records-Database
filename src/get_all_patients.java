import java.sql.*;
import java.io.*;
import java.util.*;

public class get_all_patients {
	//public get_all_patients(){
		public ArrayList<String> pid = new ArrayList<>();
		public ArrayList<String> name = new ArrayList<>();
		public ArrayList<String> birthdate = new ArrayList<>();
		public ArrayList<String> complain= new ArrayList<>();
		public ArrayList<String> date_admitted = new ArrayList<>();
		public ArrayList<String> date_discharged = new ArrayList<>();
	//}
	
	public void handle_query() {
	      try (Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhil");
	         Statement stmt = conn.createStatement();) {
	         String query = "select * from patient";
	         ResultSet rset = stmt.executeQuery(query);
	         while(rset.next()) { 
	        	//Integer id = new Integer(rset.getInt("pid"));
	        	pid.add(String.valueOf(rset.getInt("pid")));
	            name.add(rset.getString("name"));
	            complain.add(rset.getString("complain"));
	            birthdate.add((rset.getDate("birthdate")).toString());
	            date_admitted.add((rset.getDate("date_admitted")).toString());
	            date_discharged.add((rset.getDate("date_discharged")).toString());
	         }	 
	      } catch(SQLException ex) {
	         ex.printStackTrace();
	      }
	   }
	public void run_query(){
		handle_query();
	}

}
