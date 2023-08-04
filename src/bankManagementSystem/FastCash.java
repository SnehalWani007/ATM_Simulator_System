package bankManagementSystem;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.sql.*; 
import java.util.Date; 

public class FastCash extends JFrame implements ActionListener {
	
	JButton r100, r500, r1000, r2000, r5000, r10000, back;
	String pinnumber;
	
	FastCash(String pinnumber){
		this.pinnumber = pinnumber;
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bankManagementSystem/icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		JLabel text = new JLabel("SELECT WITHDRAWAL AMOUNT");
		text.setBounds(220, 300, 700, 35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System", Font.BOLD, 16));
		image.add(text);
		
		r100 = new JButton("Rs 100");
		r100.setBounds(170, 415, 150, 30);
		r100.addActionListener(this);
		image.add(r100);
		
		r500 = new JButton("Rs 500");
		r500.setBounds(355, 415, 150, 30);
		r500.addActionListener(this);
		image.add(r500);
		
		r1000 = new JButton("Rs 1000");
		r1000.setBounds(170, 450, 150, 30);
		r1000.addActionListener(this);
		image.add(r1000);
		
		r2000 = new JButton("Rs 2000");
		r2000.setBounds(355, 450, 150, 30);
		r2000.addActionListener(this);
		image.add(r2000);
		
		r5000 = new JButton("Rs 5000");
		r5000.setBounds(170, 485, 150, 30);
		r5000.addActionListener(this);
		image.add(r5000);
		
		r10000 = new JButton("Rs 10000");
		r10000.setBounds(355, 485, 150, 30);
		r10000.addActionListener(this);
		image.add(r10000);
		
		back = new JButton("Back");
		back.setBounds(355, 520, 150, 30);
		back.addActionListener(this);
		image.add(back);
		
		setSize(900, 900);
		setLocation(300, 0);
		setUndecorated(true);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == back) {
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}else {
			String amount = ((JButton)ae.getSource()).getText().substring(3); 
			Conn c = new Conn();
			try {
				ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
				int balance = 0;
	 			while(rs.next()) { 
					if(rs.getString("type").equals("Deposit")) {
						balance += Integer.parseInt(rs.getString("amount"));
					}else {
						balance -= Integer.parseInt(rs.getString("amount")); 
					}
				}
				
				if(ae.getSource()  != back && balance < Integer.parseInt(amount)) {
					JOptionPane.showMessageDialog(null, "Insufficient Balance");
					return;
				}
				
				Date date = new Date();
				String query = "insert into bank values('"+pinnumber+"','"+date+"','Withdrawl', '"+amount+"')";
				c.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Rs" + amount + "Debited Sucessfully");
				
				setVisible(false);
				new Transactions(pinnumber).setVisible(true);
				  
		   }catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	
	public static void main(String[] args) {
		new FastCash("");
	}

}

 