import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/*

Akhil Goel
Mohit Agarwal

*/

public class choose_option {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					choose_option window = new choose_option();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public choose_option() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JRadioButton enter = new JRadioButton("Enter Data");
		
		JRadioButton query = new JRadioButton("Query Data");
		
		JButton submit = new JButton("SUBMIT");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(enter.isSelected() || query.isSelected()))
				{
			        JOptionPane.showMessageDialog(null, "Select an option", "ERROR", JOptionPane.INFORMATION_MESSAGE);

				}
				else if(enter.isSelected())
				{
					frame.dispose();
					enterform1 e1=new enterform1();
					e1.frame.setVisible(true);
				}
				else if(query.isSelected())
				{
					frame.dispose();
					queryform q=new queryform();
					q.frame.setVisible(true);
				}
				
			}
		});
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myGUI ef=new myGUI();
				frame.dispose();
				ef.frame.setVisible(true);

			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(266)
					.addComponent(enter)
					.addGap(161)
					.addComponent(query)
					.addContainerGap(274, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(329, Short.MAX_VALUE)
					.addComponent(btnLogout)
					.addGap(40)
					.addComponent(submit)
					.addGap(324))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(215)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(enter)
						.addComponent(query))
					.addGap(73)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(submit)
						.addComponent(btnLogout))
					.addContainerGap(238, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
