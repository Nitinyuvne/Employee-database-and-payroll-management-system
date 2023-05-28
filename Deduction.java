import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Deduction extends JPanel implements ActionListener 
{
	JLabel u1,u2,u3,u4,u5,u6,u7,u8,u9,u10,u11;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
	JButton b1,b2,b3,b4;
	JLabel l;
Deduction()
{
	setBackground(Color.yellow);
setLayout(null);
        u1=new JLabel("EMPLOYEE ID");
        u1.setBounds(50,50,120,35);
        add(u1);
        
        t1=new JTextField();
        t1.setBounds(180,50,150,30);
        add(t1);
        
        u2=new JLabel("FIRST NAME");
        u2.setBounds(50,100,120,35);
        add(u2);
        
        t2=new JTextField();
        t2.setBounds(180,100,150,30);
        add(t2);
        
        u3=new JLabel("LAST NAME");
        u3.setBounds(50,150,120,35);
        add(u3);
        
        t3=new JTextField();
        t3.setBounds(180,150,150,30);
        add(t3);
		
		u4=new JLabel("DATE OF BIRTH");
        u4.setBounds(50,200,120,35);
        add(u4);
        
        t4=new JTextField();
        t4.setBounds(180,200,150,30);
        add(t4);
        
        u5=new JLabel("DEPARTMENTt");
        u5.setBounds(50,250,120,35);
        add(u5);
        
        t5=new JTextField();
        t5.setBounds(180,250,150,30);
        add(t5);
        
		u6=new JLabel("PF");
        u6.setBounds(500,50,120,35);
        add(u6);
        
        t6=new JTextField();
        t6.setBounds(600,50,150,30);
        add(t6);
		
		u7=new JLabel("TAX");
        u7.setBounds(500,100,120,35);
        add(u7);
        
        t7=new JTextField();
        t7.setBounds(600,100,150,30);
        add(t7);
		
		
		u8=new JLabel("ROOM");
        u8.setBounds(500,150,120,35);
        add(u8);
        
        t8=new JTextField();
        t8.setBounds(600,150,150,30);
        add(t8);
		
		u9=new JLabel("OTHERS");
        u9.setBounds(500,200,120,35);
        add(u9);
        
        t9=new JTextField();
        t9.setBounds(600,200,150,30);
        add(t9);
	
	u10=new JLabel("TOTAL");
u10.setBounds(800,300,120,30);
add(u10);
t10=new JTextField();
t10.setBounds(850,300,120,30);
add(t10);	
 		
b1=new JButton("BACK");
b1.setBounds(50,500,100,30);
add(b1);
b2=new JButton("SAVE");
 b2.setBounds(200,500,100,30);
add(b2);
b3=new JButton("CALCULATE");
 b3.setBounds(350,500,150,30);
add(b3);
b4=new JButton("CLEAR");
 b4.setBounds(550,500,100,30);
add(b4);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);

    }
	public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b3)
	{
 String a=t6.getText();
 int i=Integer.parseInt(a);
 String b=t7.getText();
 int j=Integer.parseInt(b);
 String c=t8.getText();
 int k=Integer.parseInt(c);
 String d=t9.getText();
 int l=Integer.parseInt(d);
 int z=i+j+k+l; 
t10.setText(""+z);


	}
	if(e.getSource()==b4)
	{
		    t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
            t10.setText("");
            
			
	}
	if(e.getSource()==b2)
	{
		 String s1=t1.getText();
	    String s2=t2.getText();
	    String s3=t3.getText();
	    String s4=t4.getText();
	    String s5=t5.getText();
	    String s6=t6.getText();
	    String s7=t7.getText();
	    String s8=t8.getText();
	    String s9=t9.getText();
	    String s10=t10.getText();
	    try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///minor","root","root");
		Statement st=con.createStatement();
		st.executeUpdate("insert into deduction values ('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"')");
		
			JOptionPane.showMessageDialog(null,"Data insert...");
			con.close();
            
            	}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
	}
}