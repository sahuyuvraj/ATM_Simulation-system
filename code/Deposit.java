
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener {

	JTextField  t1,t2;
	JButton b1,b2,b3;
	JLabel l1,l2,l3;
	
	Deposit(){

		super("DEPOSIT");
		
		l1=new JLabel("ENTER AMOUNT YOU WANT");
		l1.setFont(new Font("System",Font.BOLD,30));
		l1.setForeground(Color.WHITE);
		
		l2=new JLabel("TO DEPOSIT");
		l2.setFont(new Font("System",Font.BOLD,30));
		l2.setForeground(Color.WHITE);
		
		l3=new JLabel("Enter PIN");
		l3.setFont(new Font("System",Font.BOLD,14));
		l3.setForeground(Color.WHITE);
		
		t1=new JTextField();
		t1.setFont(new Font("System",Font.BOLD,22));
		
		
		t2=new JTextField();
		t2.setFont(new Font("System",Font.BOLD,14));
		
		b1=new JButton("DEPOSIT");
		b1.setFont(new Font("System",Font.BOLD,18));
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		
		
		b2=new JButton("BACK");
		b2.setFont(new Font("System",Font.BOLD,18));
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		
		b3=new JButton("EXIT");
		b3.setFont(new Font("System",Font.BOLD,18));
		b3.setForeground(Color.WHITE);
		b3.setBackground(Color.BLACK);
		
		
		setLayout(null);
		
		l3.setBounds(550,10,80,30);
		add(l3);
		
		t1.setBounds(650,10,80,30);
		add(t1);
		
		l1.setBounds(150,150,800,60);
		add(l1);
		
		l2.setBounds(290,210,800,60);
		add(l2);
		
		t2.setBounds(250,300,300,50);
		add(t2);
		
		b1.setBounds(260,380,125,50);
		add(b1);
		b2.setBounds(415,380,125,50);
		add(b2);
		b3.setBounds(300,550,200,50);
		add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		getContentPane().setBackground(Color.BLUE);
		setSize(750,700);
		setLocation(300,20);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		
		try {
			String a=t2.getText();
			String b=t1.getText();
			
			if(ae.getSource()==b1) {
				if(t1.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Plese Enter The Amount You Want To Deposit");
					
				}
				else {
					
					}
					JOptionPane.showMessageDialog(null,"Rs. "+a+" Deposit Successfully");
					
					new Transcations().setVisible(true);
					setVisible(false);
					
			}else if(ae.getSource()==b2) {
				new Transcations().setVisible(true);
				setVisible(false);
				
			}else if(ae.getSource()==b3) {
				System.exit(0);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("error: "+e);
		}
	}
	public static void main(String[] args) {
		new Deposit().setVisible(true);
	}
}
