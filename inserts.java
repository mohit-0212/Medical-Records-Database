import java.sql.*;
import java.io.*;
import java.util.*;


/*

Akhil Goel
Mohit Agarwal

*/

public class inserts {
	public static void medicine(String name, String mid,  String price, String stock) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into medicine(mid, name, price,stock) values  (" + mid + ", \'" + name + "\'," + price + ", "+stock+")";  
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}
	
	public static void disease(String name, String category,  String diid) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into disease(name, category, diid) values  (\'" + name + "\',\'" + category + "\'," + diid + ")";  
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}
	
	public static void doctor(String did, String name,  String phone_no) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into doctor(did, name, phone_no) values  (" + did + ",\'" + name + "\'," + phone_no + ")";
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}
	
	public static void patient(String pid, String name,  String complain, String date_admitted, String date_discharged, String birthdate) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into patient(pid, name, complain, date_admitted, date_discharged, birthdate) values  (" + pid + ",\'" + name + "\', \'" + complain + "\',\'" + date_admitted + "\',\'" + date_discharged + "\',\'" + birthdate + "\')";
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}
	
	public static void operation(String opid, String opname,  String description) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into operation(opid, opname, description) values  (" + opid + ",\'" + opname + "\', \'" + description + "\')";
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}
	
	public static void bill(String bno, String bname,  String bdate, String payment_mode) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into bill(bno, bname, bdate, payment_mode) values  (" + bno + ",\'" + bname + "\', \'" + bdate + "\',\'" + payment_mode  + "\')";
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}
	
	public static void tests(String tid, String name) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into tests(tid, name) values  (" + tid + ",\'" + name + "\')";
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}
	
	public static void surgeon(String did, String sid, String specialization) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into surgeon(did, sid, specialization) values  (" + did + ", " + sid + ", \'" + specialization + "\')";  
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}

	public static void department(String dept_id, String name) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into department(dept_id, name) values  (" + dept_id + ",\'" + name + "\')";
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}	
	
	public static void cures(String mid, String diid) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into cures(mid, diid) values  (" + mid + ", " + diid + ")";  
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}
	
	public static void prescribes_m(String did, String mid) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into prescribes_m(did, mid) values  (" + did + ", " + mid + ")";  
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}

	public static void consults(String did, String pid, String date) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into consults(did, pid, date) values  (" + did + ", " + pid + ", \'" + date + "\')";  
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}
	
	public static void takes_m(String mid, String pid) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into takes_m(mid, pid) values  (" + mid + ", " + pid + ")";  
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}
	
	public static void takes_t(String pid, String tid) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into takes_t(pid, tid) values  (" + pid + ", " + tid + ")";  
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}
	
	public static void conduct(String opid, String tid) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into conduct(opid, tid) values  (" + opid + ", " + tid + ")";  
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}

	public static void performs_t(String sid, String tid) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into performs_t(sid, tid) values  (" + sid + ", " + tid + ")";  
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}
	
	public static void performs_o(String sid, String opid) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into performs_o(sid, opid) values  (" + sid + ", " + opid + ")";  
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}

	public static void pays(String pid, String bno) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into pays(pid, bno) values  (" + pid + ", " + bno + ")";  
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}
	
	public static void belongs_to(String did, String dept_id) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into belongs_to(did, dept_id) values  (" + did + ", " + dept_id + ")";  
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}
	
	public static void presides(String did, String dept_id, String date) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into presides(did, dept_id, date) values  (" + did + ", " + dept_id + ", \'" + date + "\')";  
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}

	public static void offers(String dept_id, String opid) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into offers(dept_id, opid) values  (" + dept_id + ", " + opid + ")";  
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}

	public static void is_a(String did, String sid) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into is_a(did, sid) values  (" + did + ", " + sid + ")";  
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}

	public static void prescribes_o(String did, String tid) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into prescribes_o(did, tid) values  (" + did + ", " + tid + ")";  
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}
	
	public static void has(String pid, String diid) {
		try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	      Statement stmt = conn.createStatement();) {
	      String query = "insert into has(pid, diid) values  (" + pid + ", " + diid + ")";  
	      stmt.executeUpdate(query);
	      
	   } catch(SQLException ex) {
	      ex.printStackTrace();
	   }
	}


}
		

