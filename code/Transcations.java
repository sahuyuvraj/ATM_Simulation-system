

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Transcations  extends JFrame implements ActionListener{
	JLabel l1;
	JButton b1,b2,b3,b4,b5,b6,b7;
	Transcations(){
		
		super("TRANSCATION");
		
		l1=new JLabel("Plese Select Your Transcation");
		l1.setFont(new Font("System",Font.BOLD,30));
		l1.setForeground(Color.WHITE);
		
		b1=new JButton("DEPOSIT");
		b1.setFont(new Font("System",Font.BOLD,18));
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		
		b2=new JButton("CASHY WITHDRAWL");
		b2.setFont(new Font("System",Font.BOLD,18));
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		
		b3=new JButton("FAST CASE");
		b3.setFont(new Font("System",Font.BOLD,18));
		b3.setForeground(Color.WHITE);
		b3.setBackground(Color.BLACK);
		
		b4=new JButton("MINI STATEMENT");
		b4.setFont(new Font("System",Font.BOLD,18));
		b4.setForeground(Color.WHITE);
		b4.setBackground(Color.BLACK);
		
		b5=new JButton("PIN CHANGE");
		b5.setFont(new Font("System",Font.BOLD,18));
		b5.setForeground(Color.WHITE);
		b5.setBackground(Color.BLACK);
		
		b6=new JButton("BALENCE ENQURY");
		b6.setFont(new Font("System",Font.BOLD,18));
		b6.setForeground(Color.WHITE);
		b6.setBackground(Color.BLACK);
		
		b7=new JButton("EXIT");
		b7.setFont(new Font("System",Font.BOLD,18));
		b7.setForeground(Color.WHITE);
		b7.setBackground(Color.BLACK);
		
		
		setLayout(null);
		
		l1.setBounds(160,50,700,40);
		add(l1);
		
		b1.setBounds(40,150,300,60);
		add(b1);
		b2.setBounds(440,150,300,60);
		add(b2);
		b3.setBounds(40,250,300,60);
		add(b3);
		b4.setBounds(440,250,300,60);
		add(b4);
		b5.setBounds(40,350,300,60);
		add(b5);
		b6.setBounds(440,350,300,60);
		add(b6);
		b7.setBounds(240,450,300,60);
		add(b7);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		
		getContentPane().setBackground(Color.BLUE);
		setSize(800,680);
		setLocation(300,20);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==b1) {
			new Deposit().setVisible(true);
			setVisible(false);
		}
		else if(ae.getSource()==b2) {
			new Withdrawl().setVisible(true);
			setVisible(false);
		}
		else if(ae.getSource()==b3) {
			new FastCash().setVisible(true);
			setVisible(false);
		}
		else if(ae.getSource()==b4) {
			new CustomerLogin().setVisible(true);
			setVisible(false);
		}
		else if(ae.getSource()==b5) {
			new Pin().setVisible(true);
			setVisible(false);
			
		}
		else if(ae.getSource()==b6) {
			
			String pinn =JOptionPane.showInputDialog("Enter PIN");
					
			try {
					}catch(Exception e) {
				e.printStackTrace();
			
				
			}
		}else if(ae.getSource()==b7) {
			System.exit(0);
		}
	   
	}
	

	public static void main(String[] args) {
		new Transcations().setVisible(true);
	}
}
