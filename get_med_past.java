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
import javax.swing.JTextField;

/*

Akhil Goel
Mohit Agarwal

*/

public class get_med_past {

	JFrame frame;
	String abc;
	private JTable table;
	public ArrayList<String> mid = new ArrayList<>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					get_med_past window = new get_med_past();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	void handle_query(String input) {
	      try (Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/newdbms?useSSL=false", "root", "akhilgoel999");
	         Statement stmt = conn.createStatement();) {
	         String query = "select mid from takes_m where pid = "+ input;
	         ResultSet rset = stmt.executeQuery(query);
	         while(rset.next()) { 
	        	//Integer id = new Integer(rset.getInt("mid"));
	        	   mid.add(rset.getString("mid"));
	         
	            	         }	 
	      } catch(SQLException ex) {
	         ex.printStackTrace();
	      }
	   }
	int present=1;
	private JTextField pidenter;
	/**
	 * Create the application.
	 */
	void disp()
	{
		int i;
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		model.addRow(new Object[]{"PID", "MID"});
		//System.out.println("Afafd");
		i=0;
		while(i<mid.size() && i<10)
		{
			model.addRow(new Object[] {abc, mid.get(i)});
			i++;	
		}
		//for(i=0;i<10;i++)
			//model.addRow(new Object[] {mid.get(i), name.get(i), phone_no.get(i)});
	}
	
	public get_med_past() {
		pidenter = new JTextField();
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//table = new JTable();
		table = new JTable(new DefaultTableModel(new Object[]{"Column1", "Column2"}, 0));
		table.setRowHeight(30);
		JButton next = new JButton("NEXT");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0);
				model.addRow(new Object[]{"PID", "MID"});
				i=present*10;
				if(i>mid.size())
					return;
				while(i<mid.size() && i<(present+1)*10)
				{
					model.addRow(new Object[] {abc, mid.get(i)});
					i++;
				}
				//for(i=present*10;i<(present+1)*10;i++)
					//model.addRow(new Object[] {mid.get(i), name.get(i), complain.get(i), date_admitted.get(i), date_discharged.get(i), birthdate.get(i)});
				if(i<mid.size())
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
				model.addRow(new Object[]{"PID", "MID"});
				i=present*10;
				while(i<mid.size() && i<(present+1)*10)
				{
					model.addRow(new Object[] {abc, mid.get(i)});
					i++;
				}
				//for(i=present*10;i<(present+1)*10;i++)
					//model.addRow(new Object[] {mid.get(i), name.get(i), phone_no.get(i)});
				
			}
		});
		
		JLabel lblEnterPid = new JLabel("Enter PID");
		
		
		pidenter.setColumns(10);
		
		JButton submit = new JButton("SUBMIT");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abc=pidenter.getText();
				handle_query(abc);
				disp();
				
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(88)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 764, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(48, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(back)
					.addGap(148)
					.addComponent(lblEnterPid)
					.addGap(18)
					.addComponent(pidenter, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(submit)
					.addPreferredGap(ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
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
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(45)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(back)
								.addComponent(next)
								.addComponent(btnPrev))
							.addContainerGap(71, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEnterPid)
								.addComponent(pidenter, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(submit))
							.addGap(62))))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
