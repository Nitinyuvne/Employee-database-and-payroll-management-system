import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class EmployeeReport extends JPanel implements ActionListener 
{
	JLabel u1,u2,u3,u4,u5,u6,u7,u8,u9,u10,u11,u12,u13,u14;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
	JButton b1,b2,b3,b4,b5;
EmployeeReport()
{
	setBackground(Color.yellow);
setLayout(null);
        u1=new JLabel("Employee ID");
        u1.setBounds(50,50,120,35);
        add(u1);
        
        t1=new JTextField();
        t1.setBounds(180,50,150,30);
        add(t1);
        
        u2=new JLabel("Full Name");
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
        
        u5=new JLabel("EMAIL");
        u5.setBounds(50,250,120,35);
        add(u5);
        
        t5=new JTextField();
        t5.setBounds(180,250,150,30);
        add(t5);
        
        u6=new JLabel("CONTACT");
        u6.setBounds(50,300,120,35);
        add(u6);
        
        t6=new JTextField();
        t6.setBounds(180,300,150,30);
        add(t6);
		
		u7=new JLabel("ADDRESS");
        u7.setBounds(50,350,120,35);
        add(u7);
        
        t7=new JTextField();
        t7.setBounds(180,350,150,30);
        add(t7);
		
		u8=new JLabel("DEPARTMENT");
        u8.setBounds(500,50,120,35);
        add(u8);
        
       t8=new JTextField();
        t8.setBounds(600,50,150,30);
        add(t8);
		
		u9=new JLabel("DESIGNATION");
        u9.setBounds(500,100,120,35);
        add(u9);
        
        t9=new JTextField();
        t9.setBounds(600,100,150,30);
        add(t9);
		
		
		u10=new JLabel("DATE HIRED");
        u10.setBounds(500,150,120,35);
        add(u10);
        
        t10=new JTextField();
        t10.setBounds(600,150,150,30);
        add(t10);
		
		u11=new JLabel("BASIC SALARY");
        u11.setBounds(500,200,120,35);
        add(u11);
        
        t11=new JTextField();
        t11.setBounds(600,200,150,30);
        add(t11);
		
		u12=new JLabel("JOB TITEL");
        u12.setBounds(500,250,120,35);
        add(u12);
        
        t12=new JTextField();
        t12.setBounds(600,250,150,30);
        add(t12);
		
		u13=new JLabel("GRADE");
        u13.setBounds(500,300,120,35);
        add(u13);
        
        t13=new JTextField();
        t13.setBounds(600,300,150,30);
        add(t13);
		
		u14=new JLabel("POST CODE");
        u14.setBounds(500,350,120,35);
        add(u14);
        
        t14=new JTextField();
        t14.setBounds(600,350,150,30);
        add(t14);
b1=new JButton("BACK");
b1.setBounds(50,500,100,30);
add(b1);
b2=new JButton("SEARCH");
 b2.setBounds(200,500,100,30);
add(b2);
b3=new JButton("ADD");
 b3.setBounds(350,500,100,30);
add(b3);
b4=new JButton("UPDATE");
 b4.setBounds(500,500,100,30);
add(b4);
b5=new JButton("DELETE");
 b5.setBounds(650,500,100,30);
add(b5);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);

    }
	public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b3)
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
	    String s14=t14.getText();
		
		
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///minor","root","root");
		Statement st=con.createStatement();
		st.executeUpdate("insert into employeerecord values ('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"','"+s12+"','"+s13+"','"+s14+"')");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
		System.out.println(s10);
		System.out.println(s11);
		System.out.println(s12);
		System.out.println(s13);
		System.out.println(s14);
			JOptionPane.showMessageDialog(null,"Data insert...");
			con.close();
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
            t14.setText("");
           		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
}
if(e.getSource()==b2)
{
	 String s1=t1.getText();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///minor","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from employeerecord where EMPID='"+s1+"'");
			if(rs.next())
			{
				t2.setText(rs.getString(2));
				t3.setText(rs.getString(3));
				t4.setText(rs.getString(4));
				t5.setText(rs.getString(5));
				t6.setText(rs.getString(6));
				t7.setText(rs.getString(7));
				t8.setText(rs.getString(8));
				t9.setText(rs.getString(9));
				t10.setText(rs.getString(10));
				t11.setText(rs.getString(11));
				t12.setText(rs.getString(12));
				t13.setText(rs.getString(13));
				t14.setText(rs.getString(14));
			}
			else
			{t2.setText("");			
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
t14.setText("");	
			JOptionPane.showMessageDialog(null,"Invalid ROLL.no...");
			con.close();
			}
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
}
if(e.getSource()==b4)
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
			String s14=t14.getText();
			try{
		Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///minor","root","root");
			Statement st=con.createStatement();
			st.executeUpdate("update employeerecord set NAME='"+s2+"',LNAME='"+s3+"',DOB='"+s4+"',EMAIL='"+s5+"',CONTACT='"+s6+"',ADDRESS='"+s7+"',DEPARTMENT='"+s8+"',DESINGNATION='"+s9+"',DATEHIRED='"+s10+"',BASICSALARY='"+s11+"',JOBTITLE='"+s12+"',GRADE='"+s13+"',POSTCODE='"+s14+"'where EMPID='"+s1+"' "); 	
		    con.close();
			JOptionPane.showMessageDialog(null,"Data Update...");

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
			t14.setText("");
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		}
		if(e.getSource()==b5)
		{
			String s1=t1.getText();
		try{
		Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///minor","root","root");
			Statement st=con.createStatement();
			 st.executeUpdate("Delete from  employeerecord where EMPID='"+s1+"'");	
			con.close();
			JOptionPane.showMessageDialog(null,"Data Delet...");
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
			t14.setText("");
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		}


}


}