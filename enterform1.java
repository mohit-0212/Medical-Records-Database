import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class enterform1 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					enterform1 window = new enterform1();
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
	public enterform1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblChoseARelation = new JLabel("Choose a Relation");
		lblChoseARelation.setFont(new Font("Times New Roman", Font.PLAIN, 36));
		
		JRadioButton medicine = new JRadioButton("Medicine");
		
		JRadioButton cures = new JRadioButton("Cures");
		
		JRadioButton disease = new JRadioButton("Disease");
		
		JRadioButton prescribes = new JRadioButton("Prescribes");
		
		JRadioButton doctor = new JRadioButton("Doctor");
		
		JRadioButton patient = new JRadioButton("Patient");
		
		JRadioButton consults = new JRadioButton("Consults");
		
		JRadioButton tests = new JRadioButton("Tests");
		
		JRadioButton takesm = new JRadioButton("Takes_Medicine");
		
		JRadioButton takest = new JRadioButton("Takes_Test");
		
		JRadioButton surgeon = new JRadioButton("Surgeon");
		
		JRadioButton operation = new JRadioButton("Operation");
		
		JRadioButton conducts = new JRadioButton("Conducts");
		
		JRadioButton performst = new JRadioButton("Performs_Test");
		
		JRadioButton bill = new JRadioButton("Bill");
		
		JRadioButton pays = new JRadioButton("Pays");
		
		JRadioButton belongsto = new JRadioButton("Belongs_To");
		
		JRadioButton presides = new JRadioButton("Presides");
		
		JRadioButton offers = new JRadioButton("Offers");
		
		JRadioButton isa = new JRadioButton("Is_A");
		
		JRadioButton prescribeso = new JRadioButton("Prescribes_Operation");
		
		JRadioButton has = new JRadioButton("Has");
		
		JRadioButton department = new JRadioButton("Department");
		
		JRadioButton performso = new JRadioButton("Performs_Operation");
		
		JButton submit = new JButton("SUBMIT");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(medicine.isSelected())
				{
					frame.dispose();
					addMedicine med=new addMedicine();
					med.frame.setVisible(true);
				}
				else if(cures.isSelected())
				{
					frame.dispose();
					addCures cur=new addCures();
					cur.frame.setVisible(true);
				}
				else if(disease.isSelected())
				{
					frame.dispose();
					addDisease dis=new addDisease();
					dis.frame.setVisible(true);
				}
				else if(prescribes.isSelected())
				{
					frame.dispose();
					addPrescribes pre=new addPrescribes();
					pre.frame.setVisible(true);
				}
				else if(doctor.isSelected())
				{
					frame.dispose();
					addDoctor doc=new addDoctor();
					doc.frame.setVisible(true);
				}
				else if(patient.isSelected())
				{
					frame.dispose();
					addPatient pat=new addPatient();
					pat.frame.setVisible(true);
				}
				else if(consults.isSelected())
				{
					frame.dispose();
					addConsults con=new addConsults();
					con.frame.setVisible(true);
				}
				else if(tests.isSelected())
				{
					frame.dispose();
					addTests tes=new addTests();
					tes.frame.setVisible(true);
				}
				else if(takesm.isSelected())
				{
					frame.dispose();
					addTakesm takm=new addTakesm();
					takm.frame.setVisible(true);
				}
				else if(takest.isSelected())
				{
					frame.dispose();
					addTakest takt=new addTakest();
					takt.frame.setVisible(true);
				}
				else if(surgeon.isSelected())
				{
					frame.dispose();
					addSurgeon sur=new addSurgeon();
					sur.frame.setVisible(true);
				}
				else if(operation.isSelected())
				{
					frame.dispose();
					addOperation ope=new addOperation();
					ope.frame.setVisible(true);
				}
				else if(conducts.isSelected())
				{
					frame.dispose();
					addConducts con=new addConducts();
					con.frame.setVisible(true);
				}
				else if(performst.isSelected())
				{
					frame.dispose();
					addPerformst pert=new addPerformst();
					pert.frame.setVisible(true);
				}
				else if(bill.isSelected())
				{
					frame.dispose();
					addBill bil=new addBill();
					bil.frame.setVisible(true);
				}
				else if(pays.isSelected())
				{
					frame.dispose();
					addPays pay=new addPays();
					pay.frame.setVisible(true);
				}
				else if(belongsto.isSelected())
				{
					frame.dispose();
					addBelongsto bel=new addBelongsto();
					bel.frame.setVisible(true);
				}
				else if(presides.isSelected())
				{
					frame.dispose();
					addPresides pre=new addPresides();
					pre.frame.setVisible(true);
				}
				else if(offers.isSelected())
				{
					frame.dispose();
					addOffers off=new addOffers();
					off.frame.setVisible(true);
				}
				else if(isa.isSelected())
				{
					frame.dispose();
					addIsA isa=new addIsA();
					isa.frame.setVisible(true);
				}
				else if(prescribeso.isSelected())
				{
					frame.dispose();
					addPrescribesO pre=new addPrescribesO();
					pre.frame.setVisible(true);
				}
				else if(has.isSelected())
				{
					frame.dispose();
					addHas ihas=new addHas();
					ihas.frame.setVisible(true);
				}
				else if(department.isSelected())
				{
					frame.dispose();
					addDepartment dept=new addDepartment();
					dept.frame.setVisible(true);
				}
				else if(performso.isSelected())
				{
					frame.dispose();
					addPerformsO per=new addPerformsO();
					per.frame.setVisible(true);
				}
				
				
			}
		});
		
		JButton button = new JButton("BACK");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choose_option ef=new choose_option();
				frame.dispose();
				ef.frame.setVisible(true);

			}
		});
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(119)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(tests)
						.addComponent(medicine)
						.addComponent(cures)
						.addComponent(disease)
						.addComponent(prescribes)
						.addComponent(doctor)
						.addComponent(patient)
						.addComponent(consults))
					.addGap(74)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(takesm)
								.addComponent(bill)
								.addComponent(performst)
								.addComponent(conducts)
								.addComponent(operation)
								.addComponent(surgeon)
								.addComponent(takest)
								.addComponent(pays))
							.addPreferredGap(ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(belongsto)
								.addComponent(presides)
								.addComponent(offers)
								.addComponent(isa)
								.addComponent(prescribeso)
								.addComponent(has)
								.addComponent(department)
								.addComponent(performso))
							.addContainerGap(44, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(111)
							.addComponent(submit)
							.addContainerGap())))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(323)
					.addComponent(lblChoseARelation)
					.addContainerGap(313, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(53)
					.addComponent(lblChoseARelation)
					.addGap(50)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(medicine)
						.addComponent(takesm)
						.addComponent(belongsto))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(cures)
						.addComponent(takest)
						.addComponent(presides))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(disease)
						.addComponent(surgeon)
						.addComponent(offers))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(prescribes)
						.addComponent(operation)
						.addComponent(isa))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(doctor)
						.addComponent(conducts)
						.addComponent(prescribeso))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(patient)
						.addComponent(performst)
						.addComponent(has))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(consults)
						.addComponent(bill)
						.addComponent(department))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(tests)
						.addComponent(pays)
						.addComponent(performso))
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(submit))
					.addContainerGap(144, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
