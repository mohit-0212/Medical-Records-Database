import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class myGUI {

	JFrame frame;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myGUI window = new myGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public myGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblWelcomeTo = new JLabel("Medical Records System ");
		lblWelcomeTo.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		
		JLabel lblAkhilGoel = new JLabel("Akhil Goel 2015126");
		lblAkhilGoel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		JLabel lblMohitAgarwal = new JLabel("Mohit Agarwal 2015060");
		lblMohitAgarwal.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		JLabel lblEnterUsername = new JLabel("ENTER USERNAME ");
		
		username = new JTextField();
		username.setColumns(10);
		
		JLabel lblEnterPassword = new JLabel("ENTER PASSWORD");
		
		password = new JTextField();
		password.setColumns(10);
		
		JButton submit = new JButton("SUBMIT");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user, pass;
				user=username.getText();
				pass=password.getText();
				if(user.compareTo("akhil")==0 && pass.compareTo("goel")==0)
				{
					frame.dispose();
					
					choose_option ch1=new choose_option();
					ch1.frame.setVisible(true);
				}
				
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(136)
					.addComponent(lblAkhilGoel)
					.addPreferredGap(ComponentPlacement.RELATED, 357, Short.MAX_VALUE)
					.addComponent(lblMohitAgarwal)
					.addGap(124))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(344, Short.MAX_VALUE)
					.addComponent(lblWelcomeTo)
					.addGap(320))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(297, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEnterUsername)
						.addComponent(lblEnterPassword))
					.addGap(62)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(295))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(397)
					.addComponent(submit)
					.addContainerGap(413, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAkhilGoel)
						.addComponent(lblMohitAgarwal))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblWelcomeTo)
					.addGap(144)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEnterUsername))
					.addGap(43)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterPassword)
						.addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addComponent(submit)
					.addContainerGap(185, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
