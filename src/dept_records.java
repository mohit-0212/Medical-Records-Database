import java.sql.*;
import java.io.*;
import java.util.*;

public class dept_records {
	public ArrayList<String> dept_id = new ArrayList<>();
	public ArrayList<String> dept_name = new ArrayList<>();
	public ArrayList<String> count_patients = new ArrayList<>();
	
	public void handle_query() {
	      try (Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhil");
	         Statement stmt = conn.createStatement();) {
	         String query = "select d.dept_id, name, no_of_patients from (select dept_id, count(distinct pid) as no_of_patients  from belongs_to b, consults c  where b.did=c.did group by b.dept_id  order by no_of_patients desc) as num , department d where num.dept_id = d.dept_id";
	         ResultSet rset = stmt.executeQuery(query);
	         while(rset.next()) {	        	
	        	dept_id.add(String.valueOf(rset.getInt("dept_id")));
	            dept_name.add(rset.getString("name"));
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


