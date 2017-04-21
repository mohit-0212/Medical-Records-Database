import java.sql.*;
import java.io.*;
import java.util.*;


public class med_common_disease {
	public ArrayList<String> mid = new ArrayList<>();
	public ArrayList<String> med_name = new ArrayList<>();
	public ArrayList<String> diid = new ArrayList<>();
	
	public void handle_query() {
	      try (Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhil");
	         Statement stmt = conn.createStatement();) {
	         String query = "select mid, m.name, dis.diid from (select d.diid, max(no_of_patients) from (select diid, count(pid) as no_of_patients  from has group by diid order by no_of_patients desc) as num, disease d where num.diid=d.diid) as dis, cures c, medicine m where dis.diid = c.diid and c.mid = m.mid";
	         ResultSet rset = stmt.executeQuery(query);
	         while(rset.next()) {	        	
	        	mid.add(String.valueOf(rset.getInt("mid")));
	            med_name.add(rset.getString("name"));
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
