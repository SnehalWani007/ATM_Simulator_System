package bankManagementSystem;

import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 

public class Signup2 extends JFrame implements ActionListener{
	
	JTextField panTF, aadharTF;
	JButton next;
	JRadioButton sYes, sNo, eYes, eNo;
	JComboBox religionCB, categoryCB, incomeCB, educationCB, occupationCB; 
	String formno;
	
	Signup2(String formno){
		this.formno = formno;
		setLayout(null); 
		
		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
		
		JLabel additionalDetails = new JLabel("Page 2: Additional Details");
		additionalDetails.setFont(new Font("Raleway",Font.BOLD, 22));
		additionalDetails.setBounds(290, 80, 400, 30);
		add(additionalDetails);
		
		JLabel religion = new JLabel("Religion :");
		religion.setFont(new Font("Raleway",Font.BOLD, 20));
		religion.setBounds(100, 140, 100, 30);
		add(religion);
		
		String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
		religionCB = new JComboBox(valReligion);
		religionCB.setBackground(Color.WHITE);
		religionCB.setBounds(300, 140, 400, 30);
		add(religionCB);
		
		JLabel category = new JLabel("Category :");
		category.setFont(new Font("Raleway",Font.BOLD, 20));
		category.setBounds(100, 190, 200, 30);
		add(category);
		
		String valCategory[] = {"General","OBC","SC","ST","Other"};
		categoryCB = new JComboBox(valCategory);
		categoryCB.setBackground(Color.WHITE);
		categoryCB.setBounds(300, 190, 400, 30);
		add(categoryCB);
		
		JLabel income = new JLabel("Income :");
		income.setFont(new Font("Raleway",Font.BOLD, 20));
		income.setBounds(100, 240, 200, 30);
		add(income);
		
		String valIncome[] = {"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
		incomeCB = new JComboBox(valIncome);
		incomeCB.setBackground(Color.WHITE);
		incomeCB.setBounds(300, 240, 400, 30);
		add(incomeCB);
		
		JLabel education = new JLabel("Educational");
		education.setFont(new Font("Raleway",Font.BOLD, 20));
		education.setBounds(100, 290, 200, 30);
		add(education);
		
		JLabel qualification = new JLabel("Qualification :");
		qualification.setFont(new Font("Raleway",Font.BOLD, 20));
		qualification.setBounds(100, 315, 200, 30);
		add(qualification);
		
		String valEducation[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
		educationCB = new JComboBox(valEducation);
		educationCB.setBackground(Color.WHITE);
		educationCB.setBounds(300, 300, 400, 30);
		add(educationCB);
		
		JLabel occupation = new JLabel("Occupation :");
		occupation.setFont(new Font("Raleway",Font.BOLD, 20));
		occupation.setBounds(100, 370, 200, 30);
		add(occupation);
		
		String valOccupation[] = {"Salaried","Self-Employed","Bussiness","Student","Retired","Others"};
		occupationCB = new JComboBox(valOccupation);
		occupationCB.setBackground(Color.WHITE);
		occupationCB.setBounds(300, 370, 400, 30);
		add(occupationCB);
		
		JLabel pan = new JLabel("Pan Number :");
		pan.setFont(new Font("Raleway",Font.BOLD, 20));
		pan.setBounds(100, 430, 200, 30);
		add(pan);
		
		panTF = new JTextField();
		panTF.setFont(new Font("Raleway", Font.BOLD, 14));
		panTF.setBounds(300, 430, 400, 30);
		add(panTF);
		
		JLabel aadhar = new JLabel("Aadhar Number :");
		aadhar.setFont(new Font("Raleway",Font.BOLD, 20));
		aadhar.setBounds(100, 480, 200, 30);
		add(aadhar);
		
		aadharTF = new JTextField();
		aadharTF.setFont(new Font("Raleway", Font.BOLD, 14));
		aadharTF.setBounds(300, 480, 400, 30);
		add(aadharTF);
		
		JLabel senior = new JLabel("Senior citizen :");
		senior.setFont(new Font("Raleway",Font.BOLD, 20));
		senior.setBounds(100, 530, 200, 30);
		add(senior);
		
		sYes = new JRadioButton("Yes");
		sYes.setBounds(300, 530, 100, 30);
		sYes.setBackground(Color.WHITE);
		add(sYes);
		
		sNo = new JRadioButton("No");
		sNo.setBounds(450, 530, 100, 30);
		sNo.setBackground(Color.WHITE);
		add(sNo);
		
		ButtonGroup seniorgroup = new ButtonGroup();
		seniorgroup.add(sYes);
		seniorgroup.add(sNo);
		
		JLabel account = new JLabel("Existing Account :");
		account.setFont(new Font("Raleway",Font.BOLD, 20));
		account.setBounds(100, 580, 200, 30);
		add(account);
		
		eYes = new JRadioButton("Yes");
		eYes.setBounds(300, 580, 100, 30);
		eYes.setBackground(Color.WHITE);
		add(eYes);
		
		eNo = new JRadioButton("No");
		eNo.setBounds(450, 580, 100, 30);
		eNo.setBackground(Color.WHITE);
		add(eNo);
		
		ButtonGroup EAgroup = new ButtonGroup();
		EAgroup.add(eYes);
		EAgroup.add(eNo);
		
		next = new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway", Font.BOLD, 16));
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.WHITE);
		setSize(850, 800);
		setLocation(350, 10);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		String religion = (String) religionCB.getSelectedItem();
	    String category = (String) categoryCB.getSelectedItem();
		String income = (String) incomeCB.getSelectedItem();
		String education = (String) educationCB.getSelectedItem();
		String occupation = (String) occupationCB.getSelectedItem();
		String senior = null;
		if(sYes.isSelected()) {
			senior = "Yes";
		}else if (sNo.isSelected()) {
			senior = "No";
		}
		
		String eaccount = null;
		if(eYes.isSelected()) {
			eaccount = "Yes";
		}else if (eNo.isSelected()) {
			eaccount = "No";
		}
		
		String pan = panTF.getText();
		String aadhar = aadharTF.getText();
		
		try {
			if(pan.equals("")) {
				JOptionPane.showMessageDialog(null, "Pan Number is Required");
			}else if(aadhar.equals("")) {
				JOptionPane.showMessageDialog(null, "Aadhar Number is Required");
			}else {
				Conn c = new Conn();
				String query = "insert into signuptwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+senior+"','"+eaccount+"','"+pan+"','"+aadhar+"')";
				c.s.executeUpdate(query);
				
				setVisible(false);
				new Signup3(formno).setVisible(true);
				
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static void main (String[] args) {
		new Signup2("");
	}

}
