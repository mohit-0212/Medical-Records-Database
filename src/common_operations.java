import java.sql.*;
import java.io.*;
import java.util.*;

public class common_operations {
	public ArrayList<String> opid = new ArrayList<>();
	public ArrayList<String> operation_name = new ArrayList<>();
	public ArrayList<String> count_ops = new ArrayList<>();
	
	public void handle_query() {
	      try (Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhil");
	         Statement stmt = conn.createStatement();) {
	         String query = "select o.opid, opname, no_of_ops from (select opid, count(opid) as no_of_ops from performs_o group by opid order by no_of_ops desc) as num, operation o where num.opid = o.opid";
	         ResultSet rset = stmt.executeQuery(query);
	         while(rset.next()) {	        	
	        	opid.add(String.valueOf(rset.getInt("opid")));
	            operation_name.add(rset.getString("opname"));
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
