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

/*

Akhil Goel
Mohit Agarwal

*/

public class queryform {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					queryform window = new queryform();
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
	public queryform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblChoseARelation = new JLabel("Choose a Query");
		lblChoseARelation.setFont(new Font("Times New Roman", Font.PLAIN, 36));
		
		JRadioButton allpatients = new JRadioButton("Get all Patients");
		
		JRadioButton alldoctors = new JRadioButton("Get All Doctors");
		
		JRadioButton alldiseases = new JRadioButton("Get All Diseases");
		
		JRadioButton allmedicines = new JRadioButton("Get All Medicines");
		
		JRadioButton alltests = new JRadioButton("Get All Tests");
		
		JRadioButton alloperations = new JRadioButton("Get All Operations");
		
		JRadioButton allsurgeons = new JRadioButton("Get All Surgeons");
		
		JRadioButton allbills = new JRadioButton("Get All Bills");
		
		JRadioButton particular_dept = new JRadioButton("Records belonging to different departments");
		
		JRadioButton surgeon_operation = new JRadioButton("No. of operations performed by surgeons");
		
		JRadioButton disease_common = new JRadioButton("Diseases in decreasing prevailing order at the moment");
		
		JRadioButton freq = new JRadioButton("Estimate patients' frequency of visits ");
		
		JRadioButton doc_drug = new JRadioButton("Details of drugs that a doctor prescribes more than n times");
		
		JRadioButton com_prescription = new JRadioButton("Most common medical prescription");
		
		JRadioButton com_oper = new JRadioButton("Most common operation");
		
		JRadioButton bill_cash = new JRadioButton("All Bills paid via cash");
		
		JRadioButton com_test = new JRadioButton("Most common medical test");
		
		JRadioButton his = new JRadioButton("Medical history of a patient (Disease)");
		
		JRadioButton bill_online = new JRadioButton("All Bills paid online");
		JRadioButton noofpatients = new JRadioButton("No. of patients of a doctor");
		JRadioButton medcommon = new JRadioButton("Medicine for most common disease");
		JRadioButton commontest = new JRadioButton("Test for the most common disease");
		
JRadioButton pat_det = new JRadioButton("Patient details");
		
		JRadioButton test_pat = new JRadioButton("Tests that a patient has taken");
		
		JRadioButton doc_pat = new JRadioButton("Doctors a patient has seen in the past");
		
		JRadioButton med_past = new JRadioButton("Medicines a patient has taken in past");
		
		JRadioButton bill_past = new JRadioButton("Bills a patient has paid in past");
		
		JButton submit = new JButton("SUBMIT");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(allpatients.isSelected())
				{
					frame.dispose();
					getallPatients med=new getallPatients();
					med.frame.setVisible(true);
				}
				else if(alldoctors.isSelected())
				{
					frame.dispose();
					getallDoctors cur=new getallDoctors();
					cur.frame.setVisible(true);
				}
				else if(alldiseases.isSelected())
				{
					frame.dispose();
					getallDisease dis=new getallDisease();
					dis.frame.setVisible(true);
				}
				else if(allmedicines.isSelected())
				{
					frame.dispose();
					getallMedicines pre=new getallMedicines();
					pre.frame.setVisible(true);
				}
				else if(alltests.isSelected())
				{
					frame.dispose();
					getallTest doc=new getallTest();
					doc.frame.setVisible(true);
				}
				else if(alloperations.isSelected())
				{
					frame.dispose();
					getallOperation pat=new getallOperation();
					pat.frame.setVisible(true);
				}
				else if(allsurgeons.isSelected())
				{
					frame.dispose();
					getallSurgeon con=new getallSurgeon();
					con.frame.setVisible(true);
				}
				else if(allbills.isSelected())
				{
					frame.dispose();
					getallBills tes=new getallBills();
					tes.frame.setVisible(true);
				}
				else if(particular_dept.isSelected())
				{
					frame.dispose();
					get_particular_dept takm=new get_particular_dept();
					takm.frame.setVisible(true);
				}
				else if(surgeon_operation.isSelected())
				{
					frame.dispose();
					get_surgeon_operation takt=new get_surgeon_operation();
					takt.frame.setVisible(true);
				}
				else if(disease_common.isSelected())
				{
					frame.dispose();
					get_disease_common sur=new get_disease_common();
					sur.frame.setVisible(true);
				}
				else if(freq.isSelected())
				{
					frame.dispose();
					get_patient_frequency ope=new get_patient_frequency();
					ope.frame.setVisible(true);
				}
				else if(doc_drug.isSelected())
				{
					frame.dispose();
					get_doc_drug con=new get_doc_drug();
					con.frame.setVisible(true);
				}
				else if(com_prescription.isSelected())
				{
					frame.dispose();
					get_com_prescription pert=new get_com_prescription();
					pert.frame.setVisible(true);
				}
				else if(com_oper.isSelected())
				{
					frame.dispose();
					get_com_operation bil=new get_com_operation();
					bil.frame.setVisible(true);
				}
				else if(bill_cash.isSelected())
				{
					frame.dispose();
					get_bill_cash pay=new get_bill_cash();
					pay.frame.setVisible(true);
				}
				else if(com_test.isSelected())
				{
					frame.dispose();
					get_com_test bel=new get_com_test();
					bel.frame.setVisible(true);
				}
				else if(his.isSelected())
				{
					frame.dispose();
					get_history pre=new get_history();
					pre.frame.setVisible(true);
				}
				else if(bill_online.isSelected())
				{
					frame.dispose();
					get_bill_online off=new get_bill_online();
					off.frame.setVisible(true);
				}
				
				else if(noofpatients.isSelected())
				{
					frame.dispose();
					get_noofpatients ll=new get_noofpatients();
					ll.frame.setVisible(true);
				}
				else if(medcommon.isSelected())
				{
					frame.dispose();
					get_medcommon mm=new get_medcommon();
					mm.frame.setVisible(true);
				}
				else if(commontest.isSelected())
				{
					frame.dispose();
					get_testcommon gt=new get_testcommon();
					gt.frame.setVisible(true);
				}
				
				
				
				
				else if(pat_det.isSelected())
				{
					frame.dispose();
					get_pat_det pre=new get_pat_det();
					pre.frame.setVisible(true);
				}
				else if(test_pat.isSelected())
				{
					frame.dispose();
					get_test_pat off=new get_test_pat();
					off.frame.setVisible(true);
				}
				
				else if(doc_pat.isSelected())
				{
					frame.dispose();
					get_doc_pat ll=new get_doc_pat();
					ll.frame.setVisible(true);
				}
				else if(med_past.isSelected())
				{
					frame.dispose();
					get_med_past mm=new get_med_past();
					mm.frame.setVisible(true);
				}
				else if(bill_past.isSelected())
				{
					frame.dispose();
					get_bill_past gt=new get_bill_past();
					gt.frame.setVisible(true);
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
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(304)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addGap(100)
							.addComponent(submit))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(323)
							.addComponent(lblChoseARelation))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(allpatients)
								.addComponent(alldoctors)
								.addComponent(alldiseases)
								.addComponent(allmedicines)
								.addComponent(alltests)
								.addComponent(alloperations)
								.addComponent(allsurgeons)
								.addComponent(allbills)
								.addComponent(bill_cash))
							.addGap(40)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(doc_pat)
									.addPreferredGap(ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
									.addComponent(med_past))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(particular_dept)
										.addComponent(surgeon_operation)
										.addComponent(disease_common)
										.addComponent(doc_drug)
										.addComponent(freq))
									.addGap(1)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(bill_online)
										.addComponent(noofpatients)
										.addComponent(medcommon)
										.addComponent(commontest)
										.addComponent(com_test)))
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(com_prescription)
										.addComponent(com_oper)
										.addComponent(bill_past))
									.addPreferredGap(ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(test_pat)
										.addComponent(pat_det)
										.addComponent(his))))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(53)
					.addComponent(lblChoseARelation)
					.addGap(50)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(allpatients)
						.addComponent(particular_dept)
						.addComponent(com_test))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(alldoctors)
						.addComponent(surgeon_operation)
						.addComponent(commontest))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(alldiseases)
							.addComponent(disease_common))
						.addComponent(medcommon))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(allmedicines)
							.addComponent(freq))
						.addComponent(noofpatients))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(alltests)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(doc_drug)
							.addComponent(bill_online)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(alloperations)
								.addComponent(com_prescription))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(allsurgeons)
								.addComponent(com_oper))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(allbills)
								.addComponent(bill_past))
							.addGap(4)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(bill_cash)
								.addComponent(doc_pat))
							.addGap(29)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(button)
								.addComponent(submit)))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(his)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(pat_det)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(test_pat)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(med_past)))
					.addContainerGap(121, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
