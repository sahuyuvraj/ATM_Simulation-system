
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener {

	JTextField  t1,t2;
	JButton b1,b2,b3;
	JLabel l1,l2,l3,l4;
	
	Withdrawl(){
		setFont(new Font("System",Font.BOLD,22));
		Font f=getFont();
		FontMetrics fm = getFontMetrics(f);
		int x= fm.stringWidth("Withdrawl");
		int y= fm.stringWidth(" ");
		int z= getWidth()/2-(x/2);
		int w= z/y;
		String pad="";
		//for(int i=0;i!=w;i++)pad+=" ";
		setTitle(pad+"Withdrawl");
		
		
		l1=new JLabel("MAXIMUM DAILY WITHDRAWL");
		l1.setFont(new Font("System",Font.BOLD,30));
		l1.setForeground(Color.WHITE);
		
		l2=new JLabel("IS Rs.10,000");
		l2.setFont(new Font("System",Font.BOLD,30));
		l2.setForeground(Color.WHITE);
		
		l3=new JLabel("PLESE ENTER YOUR AMOUNT");
		l3.setFont(new Font("System",Font.BOLD,27));
		l3.setForeground(Color.WHITE);
		
		l4=new JLabel("Enter PIN");
		l4.setFont(new Font("System",Font.BOLD,14));
		l4.setForeground(Color.WHITE);

		
		t1=new JTextField();
		t1.setFont(new Font("System",Font.BOLD,22));
		
		
		t2=new JTextField();
		t2.setFont(new Font("System",Font.BOLD,14));
		
		b1=new JButton("WITHDRAWL");
		b1.setFont(new Font("System",Font.BOLD,12));
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
		
		l4.setBounds(550,10,80,30);
		add(l4);
		
		t2.setBounds(650,10,80,30);
		add(t2);
		
		l1.setBounds(190,150,800,60);
		add(l1);
		
		l2.setBounds(290,190,800,60);
		add(l2);
		
		l3.setBounds(190,260,800,40);
		add(l3);
		
		t1.setBounds(250,300,300,50);
		add(t1);
		
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
			String a=t1.getText();
			String b=t2.getText();
			
			if(ae.getSource()==b1) {
				if(t1.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Plese Enter The Amount You Want To WITHDRAW");
					
				}
				else {
					conn c1=new conn();
					
					ResultSet rs=c1.s.executeQuery("select* from bank where pin = '"+b+"'");
					
					if(rs.next()) {
						String pin=rs.getString("pin");
						double balance =rs.getDouble("balance");
						
						double d = Double.parseDouble(a);
						balance-=d;
						String q1="insert into bank (pin,deposit,withdraw,balance) values('"+pin+"',null,'"+d+"','"+balance+"')";
						c1.s.executeUpdate(q1);
										
					}
					JOptionPane.showMessageDialog(null,"Rs. "+a+" Debited Successfully");
					
					new Transcations().setVisible(true); 
					setVisible(false);
					
				}
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
		new Withdrawl().setVisible(true);
	}
}
