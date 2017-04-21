import java.sql.*;
import java.io.*;
import java.util.*;

public class patient_history {
	public ArrayList<String> name = new ArrayList<>();
	public ArrayList<String> birthdate = new ArrayList<>();
	public ArrayList<String> complain= new ArrayList<>();
	public ArrayList<String> date_admitted = new ArrayList<>();
	public ArrayList<String> date_discharged = new ArrayList<>();
	
	public void patient(String input) {
	      try (Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhil");
	         Statement stmt = conn.createStatement();) {
	         String query = "select name, complain, birthdate, date_admitted, date_discharged from patient where pid = "+ input;
	         ResultSet rset = stmt.executeQuery(query);
	         while(rset.next()) {
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
	
	public ArrayList<String> diid = new ArrayList<>();
	public void disease(String input) {
	      try (Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhil");
	         Statement stmt = conn.createStatement();) {
	         String query = "select diid from has where pid = "+ input;
	         ResultSet rset = stmt.executeQuery(query);
	         while(rset.next()) {
	            diid.add(rset.getString("diid"));
	         }	 
	      } catch(SQLException ex) {
	         ex.printStackTrace();
	      }
	}

	public ArrayList<String> tid = new ArrayList<>();
	public void tests(String input) {
	      try (Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhil");
	         Statement stmt = conn.createStatement();) {
	         String query = "select tid from takes_t where pid = "+ input;
	         ResultSet rset = stmt.executeQuery(query);
	         while(rset.next()) {
	            tid.add(rset.getString("tid"));
	         }	 
	      } catch(SQLException ex) {
	         ex.printStackTrace();
	      }
	}
	
	public ArrayList<String> mid = new ArrayList<>();
	public void medicine(String input) {
	      try (Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhil");
	         Statement stmt = conn.createStatement();) {
	         String query = "select mid from takes_m where pid = "+ input;
	         ResultSet rset = stmt.executeQuery(query);
	         while(rset.next()) {
	            mid.add(rset.getString("mid"));
	         }	 
	      } catch(SQLException ex) {
	         ex.printStackTrace();
	      }
	}
	
	public ArrayList<String> did = new ArrayList<>();
	public ArrayList<String> consult_date = new ArrayList<>();
	public void doctor(String input) {
	      try (Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhil");
	         Statement stmt = conn.createStatement();) {
	         String query = "select did, date from consults where pid = "+ input;
	         ResultSet rset = stmt.executeQuery(query);
	         while(rset.next()) {
	            did.add(rset.getString("did"));
	            consult_date.add((rset.getDate("date")).toString());
	         }	 
	      } catch(SQLException ex) {
	         ex.printStackTrace();
	      }
	}
	
	public ArrayList<String> bno = new ArrayList<>();
	public void bill(String input) {
	      try (Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhil");
	         Statement stmt = conn.createStatement();) {
	         String query = "select bno from pays where pid = "+ input;
	         ResultSet rset = stmt.executeQuery(query);
	         while(rset.next()) {
	            bno.add(rset.getString("bno"));
	         }	 
	      } catch(SQLException ex) {
	         ex.printStackTrace();
	      }
	}
	
	
	public void run_query(String input){
		patient(input);
		disease(input);
		tests(input);
		medicine(input);
		doctor(input);
		bill(input);
		
	}

}
