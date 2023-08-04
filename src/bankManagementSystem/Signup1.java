package bankManagementSystem;

import java.awt.*; 
import javax.swing.*; 
import java.util.*; 
import com.toedter.calendar.JDateChooser;
import java.awt.event.*; 

public class Signup1 extends JFrame implements ActionListener{
	
	long random;
	JTextField nameTF, fNameTF, dobTF, emailTF, addressTF, cityTF, stateTF, pinTF;
	JButton next;
	JRadioButton male, female, married, unmarried, other;
	JDateChooser dateChooser;
	
	Signup1(){
		
		setLayout(null); 
		
		Random ran = new Random();
		random = (Math.abs((ran.nextLong() % 9000L) + 1000L)); 
		
		JLabel formNo = new JLabel("APPLICATION FORM NO. " + random);
		formNo.setFont(new Font("Raleway",Font.BOLD, 38));
		formNo.setBounds(140, 20, 600, 40);
		add(formNo);
		
		JLabel personDetails = new JLabel("Page 1: Personal Details");
		personDetails.setFont(new Font("Raleway",Font.BOLD, 22));
		personDetails.setBounds(290, 80, 400, 30);
		add(personDetails);
		
		JLabel name = new JLabel("Name :");
		name.setFont(new Font("Raleway",Font.BOLD, 20));
		name.setBounds(100, 140, 100, 30);
		add(name);
		
		nameTF = new JTextField();
		nameTF.setFont(new Font("Raleway", Font.BOLD, 14));
		nameTF.setBounds(300, 140, 400, 30);
		add(nameTF);
		
		JLabel fName = new JLabel("Father's Name :");
		fName.setFont(new Font("Raleway",Font.BOLD, 20));
		fName.setBounds(100, 190, 200, 30);
		add(fName);
		
		fNameTF = new JTextField();
		fNameTF.setFont(new Font("Raleway", Font.BOLD, 14));
		fNameTF.setBounds(300, 190, 400, 30);
		add(fNameTF);
		
		JLabel dob = new JLabel("Date of Birth :");
		dob.setFont(new Font("Raleway",Font.BOLD, 20));
		dob.setBounds(100, 240, 200, 30);
		add(dob);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(300, 240, 400, 30);
		add(dateChooser);
		
		JLabel gender = new JLabel("Gender :");
		gender.setFont(new Font("Raleway",Font.BOLD, 20));
		gender.setBounds(100, 290, 200, 30);
		add(gender);
		
		male = new JRadioButton("Male");
		male.setBounds(300, 290, 60, 30);
		male.setBackground(Color.WHITE);
		add(male);
		
		female = new JRadioButton("Female");
		female.setBounds(450, 290, 120, 30);
		female.setBackground(Color.WHITE);
		add(female);
		
		ButtonGroup gendergroup = new ButtonGroup();
		gendergroup.add(male);
		gendergroup.add(female);
		
		JLabel email = new JLabel("Email Address :");
		email.setFont(new Font("Raleway",Font.BOLD, 20));
		email.setBounds(100, 340, 200, 30);
		add(email);
		
		emailTF = new JTextField();
		emailTF.setFont(new Font("Raleway", Font.BOLD, 14));
		emailTF.setBounds(300, 340, 400, 30);
		add(emailTF);
		
		JLabel marital = new JLabel("Marital Status :");
		marital.setFont(new Font("Raleway",Font.BOLD, 20));
		marital.setBounds(100, 390, 200, 30);
		add(marital);
		
		married = new JRadioButton("Married");
		married.setBounds(300, 390, 100, 30);
		married.setBackground(Color.WHITE);
		add(married);
		
		unmarried = new JRadioButton("Unmarried");
		unmarried.setBounds(450, 390, 100, 30);
		unmarried.setBackground(Color.WHITE);
		add(unmarried);
		
		other = new JRadioButton("Other");
		other.setBounds(630, 390, 100, 30);
		other.setBackground(Color.WHITE);
		add(other);
		
		ButtonGroup maritalgroup = new ButtonGroup();
		maritalgroup.add(married);
		maritalgroup.add(unmarried);
		maritalgroup.add(other);
		
		JLabel address = new JLabel("Address :");
		address.setFont(new Font("Raleway",Font.BOLD, 20));
		address.setBounds(100, 440, 200, 30);
		add(address);
		
		addressTF = new JTextField();
		addressTF.setFont(new Font("Raleway", Font.BOLD, 14));
		addressTF.setBounds(300, 440, 400, 30);
		add(addressTF);
		
		JLabel city = new JLabel("City :");
		city.setFont(new Font("Raleway",Font.BOLD, 20));
		city.setBounds(100, 490, 200, 30);
		add(city);
		
		cityTF = new JTextField();
		cityTF.setFont(new Font("Raleway", Font.BOLD, 14));
		cityTF.setBounds(300, 490, 400, 30);
		add(cityTF);
		
		JLabel state = new JLabel("State :");
		state.setFont(new Font("Raleway",Font.BOLD, 20));
		state.setBounds(100, 540, 200, 30);
		add(state);
		
		stateTF = new JTextField();
		stateTF.setFont(new Font("Raleway", Font.BOLD, 14));
		stateTF.setBounds(300, 540, 400, 30);
		add(stateTF);
		
		JLabel pincode = new JLabel("Pin Code :");
		pincode.setFont(new Font("Raleway",Font.BOLD, 20));
		pincode.setBounds(100, 590, 200, 30);
		add(pincode);
		
		pinTF = new JTextField();
		pinTF.setFont(new Font("Raleway", Font.BOLD, 14));
		pinTF.setBounds(300, 590, 400, 30);
		add(pinTF);
		
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
		String formno = ""+ random; 
		String name = nameTF.getText(); 
		String fName = fNameTF.getText();
		String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText(); 
		String gender = null;
		if(male.isSelected()) {
			gender = "Male";
		}else if (female.isSelected()) {
			gender = "Female";
		}
		
		String email = emailTF.getText();
		String marital = null;
		if(married.isSelected()) {
			marital = "Married";
		}else if (unmarried.isSelected()) {
			marital = "Unmarried";
		}else if (other.isSelected()) {
			marital = "Other";
		}
		
		String address = addressTF.getText();
		String city = cityTF.getText();
		String state = stateTF.getText();
		String pin = pinTF.getText();
		
		try {
			if(name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name is Required");
			}else if(fName.equals("")) {
				JOptionPane.showMessageDialog(null, "Father's Name is Required");
			}else if(dob.equals("")) {
				JOptionPane.showMessageDialog(null, "Date of Birth is Required");
			}else if(gender.equals("")) {
				JOptionPane.showMessageDialog(null, "Gender is Required");
			}else if(email.equals("")) {
				JOptionPane.showMessageDialog(null, "Email is Required");
			}else if(marital.equals("")) {
				JOptionPane.showMessageDialog(null, "Marital is Required");
			}else if(address.equals("")) {
				JOptionPane.showMessageDialog(null, "Address is Required");
			}else if(city.equals("")) {
				JOptionPane.showMessageDialog(null, "City is Required");
			}else if(state.equals("")) {
				JOptionPane.showMessageDialog(null, "State is Required");
			}else if(pin.equals("")) {
				JOptionPane.showMessageDialog(null, "Pin Code is Required");
			}else {
				Conn c = new Conn();
				String query = "insert into signup values('"+formno+"','"+name+"','"+fName+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
				c.s.executeUpdate(query);
				
				setVisible(false);
				new Signup2(formno).setVisible(true);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static void main (String[] args) {
		new Signup1();
	}

}
