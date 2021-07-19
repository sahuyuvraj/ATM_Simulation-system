
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class Pin extends JFrame implements ActionListener {

	JPasswordField t1,t2,t3;
	JButton b1,b2;
	JLabel l1,l2,l3,l4;
	
	Pin(){
		setFont(new Font("System",Font.BOLD,22));
		Font f=getFont();
		FontMetrics fm = getFontMetrics(f);
		int x= fm.stringWidth("PIN CHANGE");
		int y= fm.stringWidth(" ");
		int z= getWidth()/2-(x/2);
		int w= z/y;
		String pad="";
		//for(int i=0;i!=w;i++)pad+=" ";
		setTitle(pad+"PIN CHANGE");
		
		
		l1=new JLabel("CHANGE YOUR PIN ");
		l1.setFont(new Font("System",Font.BOLD,30));
		l1.setForeground(Color.WHITE);
		
		l2=new JLabel("Currenrt PIN");
		l2.setFont(new Font("System",Font.BOLD,20));
		l2.setForeground(Color.WHITE);
		
		l3=new JLabel("New PIN");
		l3.setFont(new Font("System",Font.BOLD,20));
		l3.setForeground(Color.WHITE);
		
		l4=new JLabel("Re-Enter New PIN");
		l4.setFont(new Font("System",Font.BOLD,20));
		l4.setForeground(Color.WHITE);

		
		t1=new JPasswordField();
		t1.setFont(new Font("System",Font.BOLD,20));
		
		
		t2=new JPasswordField();
		t2.setFont(new Font("System",Font.BOLD,20));
		
		t3=new JPasswordField();
		t3.setFont(new Font("System",Font.BOLD,20));
		
		b1=new JButton("SAVE");
		b1.setFont(new Font("System",Font.BOLD,14));
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		
		
		b2=new JButton("BACK");
		b2.setFont(new Font("System",Font.BOLD,14));
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		
		
		setLayout(null);
		
		
		l1.setBounds(220,50,700,80);
		add(l1);
		
		l2.setBounds(100,140,200,30);
		add(l2);
		
		l3.setBounds(100,200,200,30);
		add(l3);
		
		l4.setBounds(100,260,200,30);
		add(l4);
		
		t1.setBounds(310,140,300,30);
		add(t1);
		
		t2.setBounds(310,200,300,30);
		add(t2);
		
		t3.setBounds(310,260,300,30);
		add(t3);
		
		b1.setBounds(390,320,100,30);
		add(b1);
		b2.setBounds(510,320,100,30);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
			
		getContentPane().setBackground(Color.BLUE);
		setSize(750,700);
		setLocation(300,20);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent ae) {
				
		try {
			String a=t1.getText();
			String b=t3.getText();
			String c=t3.getText();
			
			if(ae.getSource()==b1) {
				if(t1.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Plese Enter Current PIN");
				}
				if(t2.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Enter New PIN");
				}
				if(t3.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Re-Enrter New PIN");
				}
				if(t2.getText().equals(t3.getText())) {
					conn c1=new conn();
					String q1="update bank set pin='"+b+"' where pin = '"+a+"' ";
					String q2="update login set pin='"+b+"' where pin = '"+a+"' ";
					String q3="update signup3 set pin='"+b+"' where pin = '"+a+"' ";
			
				c1.s.executeUpdate(q1);
				c1.s.executeUpdate(q2);
				c1.s.executeUpdate(q3);
				
				JOptionPane.showMessageDialog(null,"PIN Changed Successfully");
				new Transcations().setVisible(true);
				setVisible(false);
				
				}
				else {
					JOptionPane.showMessageDialog(null,"PIN entered doesn't match");
					
				}
				
			}else if(ae.getSource()==b2) {
				new Transcations().setVisible(true);
				setVisible(false);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("error: "+e);
			
		}
		
	}
	public static void main(String[] args) {
		new Pin().setVisible(true);
	}
}
