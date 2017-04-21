import java.sql.*;
import java.io.*;
import java.util.*;

public class tests_common_disease {
	
	public ArrayList<String> tid = new ArrayList<>();
	public ArrayList<String> test_name = new ArrayList<>();
	public ArrayList<String> diid = new ArrayList<>();
	
	public void handle_query() {
	      try (Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhil");
	         Statement stmt = conn.createStatement();) {
	         String query = "select te.tid, te.name, di.diid from (select t.tid, dis.diid from (select d.diid, max(no_of_patients) from (select diid, count(pid) as no_of_patients  from has group by diid order by no_of_patients desc) as num, disease d where num.diid=d.diid) as dis, has h, takes_t t where dis.diid = h.diid and h.pid = t.pid) as di, tests te where di.tid = te.tid";
	         ResultSet rset = stmt.executeQuery(query);
	         while(rset.next()) {	        	
	        	tid.add(String.valueOf(rset.getInt("tid")));
	            test_name.add(rset.getString("name"));
	            diid.add(String.valueOf(rset.getInt("diid")));
	         }	 
	      } catch(SQLException ex) {
	         ex.printStackTrace();
	      }
	   }
	
	public void run_query(){
		handle_query();
	}


}
