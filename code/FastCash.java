import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class FastCash extends JFrame implements ActionListener{
	JLabel l1,l2;
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	JTextField t1;
	
	FastCash(){

		super("FAST CASE");

		l1=new JLabel("SELECT WITHDRAWL AMOUNT");
		l1.setFont(new Font("System",Font.BOLD,30));
		l1.setForeground(Color.WHITE);
		
		l2=new JLabel("Enter PIN");
		l2.setFont(new Font("System",Font.BOLD,13));
		l2.setForeground(Color.WHITE);
		
		t1=new JTextField();
		t1.setFont(new Font("System",Font.BOLD,13));
		t1.setBackground(Color.WHITE);
		
		b1=new JButton("Rs 100");
		b1.setFont(new Font("System",Font.BOLD,18));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		
		b2=new JButton("Rs 500");
		b2.setFont(new Font("System",Font.BOLD,18));
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		
		b3=new JButton("Rs 1000");
		b3.setFont(new Font("System",Font.BOLD,18));
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		
		b4=new JButton("Rs 2000");
		b4.setFont(new Font("System",Font.BOLD,18));
		b4.setBackground(Color.BLACK);
		b4.setForeground(Color.WHITE);
		
		b5=new JButton("Rs 5000");
		b5.setFont(new Font("System",Font.BOLD,18));
		b5.setBackground(Color.BLACK);
		b5.setForeground(Color.WHITE);
		
		b6=new JButton("Rs 10000");
		b6.setFont(new Font("System",Font.BOLD,18));
		b6.setBackground(Color.BLACK);
		b6.setForeground(Color.WHITE);
		
		b7=new JButton("BACK");
		b7.setFont(new Font("System",Font.BOLD,18));
		b7.setBackground(Color.BLACK);
		b7.setForeground(Color.WHITE);
		
		setLayout(null);
	
		l1.setBounds(100,100,700,40);
		add(l1);
		
		l2.setBounds(550,10,80,40);
		add(l2);
		
		t1.setBounds(650,10,80,30);
		add(t1);
		
		b1.setBounds(40,250,200,40);
		add(b1);
		
		b2.setBounds(440,250,200,40);
		add(b2);
		
		b3.setBounds(40,300,200,40);
		add(b3);
		
	
		b4.setBounds(440,300,200,40);
		add(b4);
		
		b5.setBounds(40,350,200,40);
		add(b5);
		
		b6.setBounds(440,350,200,40);
		add(b6);
		
		b7.setBounds(240,400,200,40);
		add(b7);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		
		getContentPane().setBackground(Color.BLUE);
		setSize(750,700);
		setLocation(300,20);
		setVisible(true);
	
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		try {
			String a=t1.getText();
			double balance=0;
			
			
			if(ae.getSource()==b1) {
				
				JOptionPane.showMessageDialog(null,"Rs."+100+" Debited Successfully");
				
				new Transcations().setVisible(true);
				setVisible(false);
			}
			else if(ae.getSource()==b2) {
				
				JOptionPane.showMessageDialog(null,"Rs."+500+" Debited Successfully");
				
				new Transcations().setVisible(true);
				setVisible(false);
			}
			if(ae.getSource()==b3) {
				
				JOptionPane.showMessageDialog(null,"Rs."+1000+" Debited Successfully");
				
				new Transcations().setVisible(true);
				setVisible(false);
			}
			else if(ae.getSource()==b4) {
				
				JOptionPane.showMessageDialog(null,"Rs."+2000+" Debited Successfully");
				
				new Transcations().setVisible(true);
				setVisible(false);
			}
			else if(ae.getSource()==b5) {
				
				JOptionPane.showMessageDialog(null,"Rs."+5000+" Debited Successfully");
				
				new Transcations().setVisible(true);
				setVisible(false);
			}
			else if(ae.getSource()==b6) {
				
				JOptionPane.showMessageDialog(null,"Rs."+10000+" Debited Successfully");
				
				new Transcations().setVisible(true);
				setVisible(false);
			}
			else if(ae.getSource()==b7) {
				new Transcations().setVisible(true);
				setVisible(false);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("error: "+e);
		}
	}
	public static void main(String[] args) {
		new FastCash().setVisible(true);
	}
	
}