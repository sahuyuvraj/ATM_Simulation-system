

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CustomerLogin extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	JTextField tf1;
	JPasswordField pf2;
	JButton b1,b2,b3;
	CustomerLogin(){


		super("AUTOMATED TELLER MACHINE");
		l1=new JLabel("WELCOME TO ATM");
		l1.setFont(new Font("Oswald",Font.BOLD,30));
		l2=new JLabel("Card No:");
		l2.setFont(new Font("Relway",Font.BOLD,20));
		l3=new JLabel("PIN:    ");
		l3.setFont(new Font("Relway",Font.BOLD,20));
		l1.setForeground(Color.WHITE);
		l2.setForeground(Color.WHITE);
		l3.setForeground(Color.WHITE);
		
		tf1=new JTextField(15);
		pf2=new JPasswordField(15);
		
		b1=new JButton("SIGN IN");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		
		b2=new JButton("CLEAR");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		
		b3= new JButton("SIGN UP");
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		
		setLayout(null);
		
		l1.setBounds(250,50,400,200);
		add(l1);
		l2.setBounds(175,150,375,200);
		add(l2);
		l3.setBounds(175,225,375,200);
		add(l3);
		
		tf1.setFont(new Font("Arial",Font.BOLD,14));
		tf1.setBounds(300,235,230,30);
		add(tf1);
		
		pf2.setFont(new Font("Arial",Font.BOLD,14));
		pf2.setBounds(300,310,230,30);
		add(pf2);
		
		b1.setFont(new Font("Arial",Font.BOLD,14));
		b1.setBounds(300,400,100,30);
		add(b1);
		b2.setFont(new Font("Arial",Font.BOLD,14));
		b2.setBounds(430,400,100,30);
		add(b2);
		b3.setFont(new Font("Arial",Font.BOLD,14));
		b3.setBounds(300,450,230,30);
		add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		getContentPane().setBackground(Color.BLUE);
		
		setSize(800,650);
		setLocation(300,50);
		setVisible(true);
		setResizable(false);
		
	}
	public void actionPerformed(ActionEvent ae) {
		
		
		try {
			
			if(ae.getSource()==b1) 
			{
					new Transcations().setVisible(true);
					setVisible(false);	
			}else if(ae.getSource()==b2) {
				tf1.setText("");
				pf2.setText("");
			}else if(ae.getSource()==b3) {
				new NewSignup1().setVisible(true);
				setVisible(false);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	} 
	
	public static void main(String[] args) {
		new CustomerLogin().setVisible(true);
	}
}