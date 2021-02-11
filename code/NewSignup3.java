
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class NewSignup3 extends JFrame implements ActionListener {
  
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	JButton b1,b2;
	JRadioButton r1,r2,r3,r4;
	JTextField t1;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	
	
	NewSignup3(){
		
		super("New Account Application Form-Page 3");
		l1=new JLabel("Page 3:Account Details ");
		l1.setFont(new Font("Raleway",Font.BOLD,22));
		l1.setForeground(Color.WHITE);
		l2=new JLabel("Account Type");
		l2.setFont(new Font("Raleway",Font.BOLD,18));
		l2.setForeground(Color.WHITE);
		l3=new JLabel("Card Number:");
		l3.setFont(new Font("Raleway",Font.BOLD,18));
		l3.setForeground(Color.WHITE);
		l4=new JLabel("XXXX-XXXX-XXXX-XXXX-4184");
		l4.setFont(new Font("Raleway",Font.BOLD,15));
		l4.setForeground(Color.WHITE);
		l5=new JLabel("(Your 16 digit card number)");
		l5.setFont(new Font("Raleway",Font.BOLD,12));
		l5.setForeground(Color.WHITE);
		l6=new JLabel("(It would appear on ATM card/cheque Book and Statements)");
		l6.setFont(new Font("Raleway",Font.BOLD,12));
		l6.setForeground(Color.WHITE);	
		l7=new JLabel("PIN:");
		l7.setFont(new Font("Raleway",Font.BOLD,18));
		l7.setForeground(Color.WHITE);
		l8=new JLabel("XXXX");
		l8.setFont(new Font("Raleway",Font.BOLD,18));
		l8.setForeground(Color.WHITE);
		l9=new JLabel("(4-digit password)");
		l9.setFont(new Font("Raleway",Font.BOLD,12));
		l9.setForeground(Color.WHITE);
		l10=new JLabel("Services Required:");
		l10.setFont(new Font("Raleway",Font.BOLD,18));
		l10.setForeground(Color.WHITE);
		l11=new JLabel("Form No:");
		l11.setFont(new Font("Raleway",Font.BOLD,12));
		l11.setForeground(Color.WHITE);
		
		b1=new JButton("Submit");
		b1.setFont(new Font("Raleway",Font.BOLD,14));
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		b2=new JButton("Cancel");
		b2.setFont(new Font("Raleway",Font.BOLD,14));
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
	
        
		c1=new JCheckBox("ATM Card");
		c1.setFont(new Font("Raleway",Font.BOLD,16));
		c1.setForeground(Color.WHITE);
		c1.setBackground(Color.BLUE);
		c2=new JCheckBox("Internet Banking");
		c2.setFont(new Font("Raleway",Font.BOLD,16));
		c2.setForeground(Color.WHITE);
		c2.setBackground(Color.BLUE);
		c3=new JCheckBox("Mobile Banking");
		c3.setFont(new Font("Raleway",Font.BOLD,16));
		c3.setForeground(Color.WHITE);
		c3.setBackground(Color.BLUE);
		c4=new JCheckBox("Email Alerts");
		c4.setFont(new Font("Raleway",Font.BOLD,16));
		c4.setForeground(Color.WHITE);
		c4.setBackground(Color.BLUE);
		c5=new JCheckBox("Cheque Book");
		c5.setFont(new Font("Raleway",Font.BOLD,16));
		c5.setForeground(Color.WHITE);
		c5.setBackground(Color.BLUE);
		c6=new JCheckBox("E-Statement");
		c6.setFont(new Font("Raleway",Font.BOLD,16));
		c6.setForeground(Color.WHITE);
		c6.setBackground(Color.BLUE);
		c7=new JCheckBox("I hereby declares that the above entered details correct to the best of my knoledge",true);
		c7.setFont(new Font("Raleway",Font.BOLD,12));
		c7.setForeground(Color.WHITE);
		c7.setBackground(Color.BLUE);
		
		r1=new JRadioButton("Saving Account");
		r1.setFont(new Font("Raleway",Font.BOLD,16));
		r1.setForeground(Color.WHITE);
		r1.setBackground(Color.BLUE);
		
		r2=new JRadioButton("Fixed Deposit Account");
		r2.setFont(new Font("Raleway",Font.BOLD,16));
		r2.setForeground(Color.WHITE);
		r2.setBackground(Color.BLUE);
		
		r3=new JRadioButton("Current Account");
		r3.setFont(new Font("Raleway",Font.BOLD,16));
		r3.setForeground(Color.WHITE);
		r3.setBackground(Color.BLUE);
		
		r4=new JRadioButton("Recurring Account");
		r4.setFont(new Font("Raleway",Font.BOLD,16));
		r4.setForeground(Color.WHITE);
		r4.setBackground(Color.BLUE);
		
		t1=new JTextField();
		t1.setFont(new Font("Raleway",Font.BOLD,12));
		
		setLayout(null);
		
		l11.setBounds(660,30,100,30);
		add(l11);
		t1.setBounds(720,30,100,30);
		add(t1);
		
		l1.setBounds(100,30,400,30);
		add(l1);
		l2.setBounds(100,70,200,30);
		add(l2);
		r1.setBounds(100,100,250,30);
		add(r1);
		r2.setBounds(350,100,250,30);
		add(r2);
		r3.setBounds(100,140,250,30);
		add(r3);
		r4.setBounds(350,140,250,30);
		add(r4);
		
		l3.setBounds(100,200,220,30);
		add(l3);
		l4.setBounds(330,200,220,30);
		add(l4);
		l5.setBounds(100,230,220,20);
		add(l5);
		l6.setBounds(330,230,500,20);
		add(l6);
		l7.setBounds(100,280,200,30);
		add(l7);
		l8.setBounds(330,280,200,30);
		add(l8);
		l9.setBounds(100,300,200,20);
		add(l9);
		l10.setBounds(100,350,200,30);
		add(l10);
		
		c1.setBounds(100,400,200,30);
		add(c1);
		c2.setBounds(350,400,200,30);
		add(c2);
		c3.setBounds(100,450,200,30);
		add(c3);
		c4.setBounds(350,450,200,30);
		add(c4);
		c5.setBounds(100,500,200,30);
		add(c5);
		c6.setBounds(350,500,200,30);
		add(c6);
		c7.setBounds(100,540,600,20);
		add(c7);
		
		b1.setBounds(370,580,100,30);
		add(b1);
		b2.setBounds(490,580,100,30);
		add(b2);
		ButtonGroup group=new ButtonGroup();
		group.add(r1);
		group.add(r2);
		group.add(r3);
		group.add(r4);
	
		getContentPane().setBackground(Color.BLUE);
		
		setSize(850,800);
		setLocation(250,0);
		setVisible(true);
		//setResizable(false);
		b1.addActionListener(this);
		b2.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae) {
		String a=null;
		if(r1.isSelected()) {
			a="Saving Account";
		}else if(r2.isSelected()) {
			a="Fixed Deposit Account";
		}else if(r3.isSelected()) {
			a="Current Account";
		}else if(r4.isSelected()) {
			a="Recurring Deposit Account ";
		}
		
		Random ran =new Random();
		long first7=(ran.nextLong() % 90000000L)+5040936000000000L;
		long first8=Math.abs(first7);
		
		long first3=(ran.nextLong()%9000L)+1000L;
		long first4=Math.abs(first3);
		
		
		String b="";
		if(c1.isSelected()) {
			b=b+"ATM Card";
		}
		if(c2.isSelected()) {
			b=b+"Internet Banking";
			
		}
		if(c3.isSelected()) {
			b=b+"Mobile Banking";
		}
		if(c4.isSelected()) {
			b=b+"EMail Alerts";
			
		}
		if(c5.isSelected()) {
			b=b+"Cheque Book";
			
		}
		if(c6.isSelected()) {
			b=b+"E-Statement";
		}
		String c=t1.getText();
		
		try {
			if(ae.getSource()==b1) {
				if(b.equals("")) {
					JOptionPane.showMessageDialog(null,"Fill all the required fields");
					
				}else {
					
				JOptionPane.showMessageDialog(null, "Card Number:"+first8+"\n Pin:"+ first4);
				new CustomerLogin().setVisible(true);
				setVisible(false);
				}
			}else if(ae.getSource()==b2) {
				System.exit(0);
			}
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new NewSignup3().setVisible(true);
	}
	
}
