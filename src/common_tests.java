import java.sql.*;
import java.io.*;
import java.util.*;

public class common_tests {
	public ArrayList<String> tid = new ArrayList<>();
	public ArrayList<String> test_name = new ArrayList<>();
	public ArrayList<String> count_tests = new ArrayList<>();
	
	public void handle_query() {
	      try (Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhil");
	         Statement stmt = conn.createStatement();) {
	         String query = "select t.tid, name, no_of_tests from (select tid, count(tid) as no_of_tests from takes_t group by tid order by no_of_tests desc) as num, tests t where num.tid = t.tid";
	         ResultSet rset = stmt.executeQuery(query);
	         while(rset.next()) {	        	
	        	tid.add(String.valueOf(rset.getInt("tid")));
	            test_name.add(rset.getString("name"));
	            count_tests.add(String.valueOf(rset.getInt("no_of_tests")));
	         }	 
	      } catch(SQLException ex) {
	         ex.printStackTrace();
	      }
	   }
	
	public void run_query(){
		handle_query();
	}


}
