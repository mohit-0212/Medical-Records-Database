import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/*

Akhil Goel
Mohit Agarwal

*/

public class get_com_test {

	JFrame frame;
	private JTable table;
	public ArrayList<String> tid = new ArrayList<>();
	public ArrayList<String> test_name = new ArrayList<>();
	public ArrayList<String> count_tests = new ArrayList<>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					get_com_test window = new get_com_test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	void handle_query() {
	      try (Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	         Statement stmt = conn.createStatement();) {
	         String query = "select t.tid, name, no_of_tests from (select tid, count(tid) as no_of_tests from takes_t group by tid order by no_of_tests desc) as num, tests t where num.tid = t.tid order by no_of_tests desc";
	         ResultSet rset = stmt.executeQuery(query);
	         while(rset.next()) { 
	        	//Integer id = new Integer(rset.getInt("pid"));
	        	tid.add(String.valueOf(rset.getInt("tid")));
	            test_name.add(rset.getString("name"));
	            count_tests.add(String.valueOf(rset.getInt("no_of_tests")));
	        
	            	         }	 
	      } catch(SQLException ex) {
	         ex.printStackTrace();
	      }
	   }
	int present=1;
	/**
	 * Create the application.
	 */
	void disp()
	{
		int i;
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		model.addRow(new Object[]{"TID", "Name", "No. of tests"});
		//System.out.println("Afafd");
		i=0;
		while(i<tid.size() && i<10)
		{
			model.addRow(new Object[] {tid.get(i), test_name.get(i), count_tests.get(i)});
			i++;	
		}
		//for(i=0;i<10;i++)
			//model.addRow(new Object[] {tid.get(i), name.get(i), phone_no.get(i)});
	}
	
	public get_com_test() {
		initialize();
		handle_query();
		disp();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//table = new JTable();
		table = new JTable(new DefaultTableModel(new Object[]{"Column1", "Column2", "Column3"}, 0));
		table.setRowHeight(30);
		JButton next = new JButton("NEXT");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0);
				model.addRow(new Object[]{"TID", "Name", "No. of tests"});
				i=present*10;
				if(i>tid.size())
					return;
				while(i<tid.size() && i<(present+1)*10)
				{
					model.addRow(new Object[] {tid.get(i), test_name.get(i), count_tests.get(i)});
					i++;
				}
				//for(i=present*10;i<(present+1)*10;i++)
					//model.addRow(new Object[] {pid.get(i), name.get(i), complain.get(i), date_admitted.get(i), date_discharged.get(i), birthdate.get(i)});
				if(i<tid.size())
				present++;
			}
		});
		
		JButton back = new JButton("GO BACK");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				queryform q1=new queryform();
				frame.dispose();
				q1.frame.setVisible(true);
			}
			
		});
		
		JLabel lblAllPatientsInformation = new JLabel("QUERY");
		lblAllPatientsInformation.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		
		JButton btnPrev = new JButton("PREV");
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				present--;
				if(present<0)
					present=0;
				int i;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0);
				model.addRow(new Object[]{"TID", "Name", "No. of tests"});
				i=present*10;
				while(i<tid.size() && i<(present+1)*10)
				{
					model.addRow(new Object[] {tid.get(i), test_name.get(i), count_tests.get(i)});
					i++;
				}
				//for(i=present*10;i<(present+1)*10;i++)
					//model.addRow(new Object[] {tid.get(i), name.get(i), phone_no.get(i)});
				
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(88)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 764, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(48, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(back)
					.addPreferredGap(ComponentPlacement.RELATED, 502, Short.MAX_VALUE)
					.addComponent(btnPrev)
					.addGap(18)
					.addComponent(next)
					.addGap(62))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(374, Short.MAX_VALUE)
					.addComponent(lblAllPatientsInformation, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
					.addGap(249))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(69)
					.addComponent(lblAllPatientsInformation)
					.addGap(18)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
					.addGap(45)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(back)
						.addComponent(next)
						.addComponent(btnPrev))
					.addContainerGap(71, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
