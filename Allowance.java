import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Allowance extends JPanel implements ActionListener 
{
	JLabel u1,u2,u3,u4,u5,u6,u7,u8,u9,u10,u11,u12,u13;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
	JButton b1,b2,b3,b4;
Allowance()
{
	setBackground(Color.yellow);
setLayout(null);
        u1=new JLabel("Employee ID");
        u1.setBounds(50,50,120,35);
        add(u1);
        
        t1=new JTextField();
        t1.setBounds(180,50,150,30);
        add(t1);
        
        u2=new JLabel("First Name");
        u2.setBounds(50,100,120,35);
        add(u2);
        
        t2=new JTextField();
        t2.setBounds(180,100,150,30);
        add(t2);
        
        u3=new JLabel("Last Name");
        u3.setBounds(50,150,120,35);
        add(u3);
        
        t3=new JTextField();
        t3.setBounds(180,150,150,30);
        add(t3);
		
		u4=new JLabel("Date of Birth");
        u4.setBounds(50,200,120,35);
        add(u4);
        
        t4=new JTextField();
        t4.setBounds(180,200,150,30);
        add(t4);
        
        u5=new JLabel("Basic Salary");
        u5.setBounds(50,250,120,35);
        add(u5);
        
        t5=new JTextField();
        t5.setBounds(180,250,150,30);
        add(t5);
        
        u6=new JLabel("Department");
        u6.setBounds(50,300,120,35);
        add(u6);
        
        t6=new JTextField();
        t6.setBounds(180,300,150,30);
        add(t6);
		
		u7=new JLabel("Overtime");
        u7.setBounds(500,50,120,35);
        add(u7);
        
        t7=new JTextField();
        t7.setBounds(600,50,150,30);
        add(t7);
		
		u8=new JLabel("Medical");
        u8.setBounds(500,100,120,35);
        add(u8);
        
        t8=new JTextField();
        t8.setBounds(600,100,150,30);
        add(t8);
		
		u9=new JLabel("Bonus");
        u9.setBounds(500,150,120,35);
        add(u9);
        
        t9=new JTextField();
        t9.setBounds(600,150,150,30);
        add(t9);
		
		
		u10=new JLabel("Other");
        u10.setBounds(500,200,120,35);
        add(u10);
        
        t10=new JTextField();
        t10.setBounds(600,200,150,30);
        add(t10);
		
		u11=new JLabel("Total Overtimes Amount");
        u11.setBounds(450,250,200,35);
        add(u11);
        
        t11=new JTextField();
        t11.setBounds(600,250,150,30);
        add(t11);
		
		u12=new JLabel("Rate per hour");
        u12.setBounds(500,300,120,35);
        add(u12);
        
        t12=new JTextField();
        t12.setBounds(600,300,150,30);
        add(t12);
		u13=new JLabel("TOTAL");
u13.setBounds(700,350,120,30);
add(u13);
t13=new JTextField();
t13.setBounds(750,350,120,30);
add(t13);	
		
b1=new JButton("Save");
 b1.setBounds(50,500,100,30);
add(b1);
b2=new JButton("Calculate");
 b2.setBounds(200,500,150,30);
add(b2);
b3=new JButton("Clear");
 b3.setBounds(400,500,100,30);
add(b3);
b4=new JButton("Back");
 b4.setBounds(550,500,100,30);
add(b4);
b1.addActionListener(this);
b3.addActionListener(this);
b2.addActionListener(this);

    }
	public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b1)
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
	    String s11=t11.getText();
	    String s12=t12.getText();
	    String s13=t13.getText();
	    try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///minor","root","root");
		Statement st=con.createStatement();
		st.executeUpdate("insert into allowance values ('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"','"+s12+"','"+s13+"')");
		
			JOptionPane.showMessageDialog(null,"Data insert...");
			con.close();
            
            	}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
		if(e.getSource()==b3)
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
            t11.setText("");
            t12.setText("");
            t13.setText("");
		}
		if(e.getSource()==b2)
		{
 String a=t7.getText();
 int i=Integer.parseInt(a);
 
 String b=t8.getText();
 int j=Integer.parseInt(b);
 
 String c=t9.getText();
 int k=Integer.parseInt(c);
 
 String d=t10.getText();
 int l=Integer.parseInt(d);
// String e1=t11.getText();
 //int m=Integer.parseInt();

 String f=t12.getText();
 int n=Integer.parseInt(f);
 
 int z1=i*n;
 t11.setText(""+z1);
 int z=j+k+l+z1;
 t13.setText(""+z);
		}
	
}


}