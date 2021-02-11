
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class NewSignup1 extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JRadioButton r1,r2,r3,r4,r5;
	JButton b1;
	JComboBox c1,c2,c3;
	
	Random run=new Random();
	long first4 = (run.nextLong() % 9000L) + 1000L;
	long first = Math.abs(first4);
	
	NewSignup1(){
		
		super("NEW ACCOUNT APPLICATION FORM");
		l1=new JLabel("APPLICATION FORM NO. "+first);
		l1.setFont(new Font("Raleway",Font.BOLD,30));
		l1.setForeground(Color.WHITE);
		l2=new JLabel("Page 1: Personal Details");
		l2.setFont(new Font("Raleway",Font.BOLD,22));
		l2.setForeground(Color.WHITE);
		l3=new JLabel("Name:");
		l3.setFont(new Font("Raleway",Font.BOLD,20));
		l3.setForeground(Color.WHITE);
		l4=new JLabel("Father's Name:");
		l4.setFont(new Font("Raleway",Font.BOLD,20));
		l4.setForeground(Color.WHITE);
		l5=new JLabel("Date of Birth:");
		l5.setFont(new Font("Raleway",Font.BOLD,20));
		l5.setForeground(Color.WHITE);
		l6=new JLabel("Gender:");
		l6.setFont(new Font("Raleway",Font.BOLD,20));
		l6.setForeground(Color.WHITE);
		l7=new JLabel("Email Address:");
		l7.setFont(new Font("Raleway",Font.BOLD,20));
		l7.setForeground(Color.WHITE);
		l8=new JLabel("Marital Status:");
		l8.setFont(new Font("Raleway",Font.BOLD,20));
		l8.setForeground(Color.WHITE);
		l9=new JLabel("Address:");
		l9.setFont(new Font("Raleway",Font.BOLD,20));
		l9.setForeground(Color.WHITE);
		l10=new JLabel("City:");
		l10.setFont(new Font("Raleway",Font.BOLD,20));
		l10.setForeground(Color.WHITE);
		l11=new JLabel("PIN Code:");
		l11.setFont(new Font("Raleway",Font.BOLD,20));
		l11.setForeground(Color.WHITE);
		l12=new JLabel("State:");
		l12.setFont(new Font("Raleway",Font.BOLD,20));
		l12.setForeground(Color.WHITE);
		l13=new JLabel("Date");
		l13.setFont(new Font("Raleway",Font.BOLD,14));
		l13.setForeground(Color.WHITE);
		l14=new JLabel("Month");
		l14.setFont(new Font("Raleway",Font.BOLD,14));
		l14.setForeground(Color.WHITE);
		l15=new JLabel(" Year");
		l15.setFont(new Font("Raleway",Font.BOLD,14));
		l15.setForeground(Color.WHITE);
		t1=new JTextField();
		t1.setFont(new Font("Raleway",Font.BOLD,14));
		t2=new JTextField();
		t2.setFont(new Font("Raleway",Font.BOLD,14));
		t3= new JTextField();
		t3.setFont(new Font("Raleway",Font.BOLD,14));
		t4=new JTextField();
		t4.setFont(new Font("Raleway",Font.BOLD,14));
		t5=new JTextField();
		t5.setFont(new Font("Raleway",Font.BOLD,14));
		t6=new JTextField();
		t6.setFont(new Font("Raleway",Font.BOLD,14));
		t7=new JTextField();
		t7.setFont(new Font("Raleway",Font.BOLD,14));
		
		b1=new JButton("Next");
		b1.setFont(new Font("Raleway",Font.BOLD,14));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		
		r1= new JRadioButton("Male");
		r1.setFont(new Font("Raleway",Font.BOLD,14));
		r1.setBackground(Color.BLUE);
		r1.setForeground(Color.WHITE);
		r2=new JRadioButton("Female");
		r2.setFont(new Font("Raleway",Font.BOLD,14));
		r2.setBackground(Color.BLUE);
		r2.setForeground(Color.WHITE);
		r3=new JRadioButton("Married");
		r3.setFont(new Font("Raleway",Font.BOLD,14));
		r3.setBackground(Color.BLUE);
		r3.setForeground(Color.WHITE);
		r4=new JRadioButton("Unmarried");
		r4.setFont(new Font("Raleway",Font.BOLD,14));
		r4.setBackground(Color.BLUE);
		r4.setForeground(Color.WHITE);
		r5=new JRadioButton("Others");
		r5.setFont(new Font("Raleway",Font.BOLD,14));
		r5.setBackground(Color.BLUE);
		r5.setForeground(Color.WHITE);
		String date[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
		c1=new JComboBox(date);
		c1.setBackground(Color.WHITE);
		c1.setFont(new Font("Raleway",Font.BOLD,14));
		String month[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		c2=new JComboBox(month);
		c2.setBackground(Color.WHITE);
		c2.setFont(new Font("Raleway",Font.BOLD,14));
		
		String year[]= {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002"};
		c3=new JComboBox(year);
		c3.setBackground(Color.WHITE);
		c3.setFont(new Font("Raleway",Font.BOLD,14));
		
		setLayout(null);
		l1.setBounds(200,20,600,40);
		add(l1);
		l2.setBounds(100,90,600,30);
		add(l2);
		l3.setBounds(100,140,200,30);
		add(l3);
		l4.setBounds(100,190,200,30);
		add(l4);
	   
		t1.setBounds(300,140,400,30);
		add(t1);
		t2.setBounds(300,190,400,30);
		add(t2);
		
		
		l5.setBounds(100,240,200,30);
		add(l5);
		
		l13.setBounds(300,240,40,30);
		add(l13);
		c1.setBounds(340,240,60,30);
		add(c1);
		l14.setBounds(410,240,50,30);
		add(l14);
		c2.setBounds(460,240,100,30);
		add(c2);
		l15.setBounds(570,240,40,30);
		add(l15);
		c3.setBounds(610,240,90,30);
		add(c3);
		
		l6.setBounds(100,290,200,30);
		add(l6);
		r1.setBounds(300,290,60,30);
		add(r1);
		r2.setBounds(450,290,90,30);
		add(r2);
		
		l7.setBounds(100,340,200,30);
		add(l7);
		t3.setBounds(300,340,400,30);
		add(t3);
		
		l8.setBounds(100,390,200,30);
		add(l8);
		r3.setBounds(300,390,100,30);
		add(r3);
		r4.setBounds(450,390,100,30);
		add(r4);
		r5.setBounds(635,390,100,30);
		add(r5);
		
		l9.setBounds(100,440,200,30);
		add(l9);
		t4.setBounds(300,440,400,30);
		add(t4);
		l10.setBounds(100,490,200,30);
		add(l10);
		t5.setBounds(300,490,400,30);
		add(t5);
		l11.setBounds(100,540,200,30);
		add(l11);
		t6.setBounds(300,540,400,30);
		add(t6);
		l12.setBounds(100,590,200,30);
		add(l12);
		t7.setBounds(300,590,400,30);
		add(t7);

		ButtonGroup group=new ButtonGroup();
		group.add(r1);
		group.add(r2);
		ButtonGroup group2=new ButtonGroup();
		group2.add(r3);
		group2.add(r4);
		group2.add(r5);
		
		
		b1.setBounds(620,640,80,30);
		add(b1);
		b1.addActionListener(this);
		getContentPane().setBackground(Color.BLUE);
		
		setSize(850,800);
		setLocation(250,0);
		setVisible(true);
	//	setResizable(false);
		
		
	}
	public void actionPerformed(ActionEvent ae) {
		String a=t1.getText();
		String b=t2.getText();
		
		String ac=(String)c1.getSelectedItem(); 
		String bc=(String)c2.getSelectedItem();
		String cc=(String)c3.getSelectedItem();
		
		String d=null;
		if(r1.isSelected()) {
			d="Male";
		}else if(r2.isSelected()) {
			d="Female";
		}
		String e=t3.getText();
		String f=null;
		if(r3.isSelected()) {
			f="Married";
		}else if(r4.isSelected()) {
			f="Unmarried";
		}else if(r5.isSelected()) {
			f="Others";
		}
		String g=t4.getText();
		String h=t5.getText();
		String i=t6.getText();
		String j=t7.getText();
		
	
	try {
			if(t6.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Fill All The Required Fields");
				
			}else {
				
				new NewSignup2().setVisible(true);
				setVisible(false);
				
			}
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
		
	}
	public static void main(String[] args) {
		new NewSignup1().setVisible(true);
	}
	
	

}
