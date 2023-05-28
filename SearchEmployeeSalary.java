import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class SearchEmployeeSalary extends JPanel implements ActionListener 
{
	JLabel u1,u2,u3,u4,u5,u6,u7,u8,u9,u10,u11,u12,u13,u14;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
	JButton b1,b2,b3;
 SearchEmployeeSalary()
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
		
		u14=new JLabel("Date of Birth");
        u14.setBounds(50,200,120,35);
        add(u14);
        
        t14=new JTextField();
        t14.setBounds(180,200,150,30);
        add(t14);
        
        u4=new JLabel("EMAIL");
        u4.setBounds(50,250,120,35);
        add(u4);
        
        t4=new JTextField();
        t4.setBounds(180,250,150,30);
        add(t4);
        
        u5=new JLabel("CONTACT");
        u5.setBounds(50,300,120,35);
        add(u5);
        
        t5=new JTextField();
        t5.setBounds(180,300,150,30);
        add(t5);
		
		u6=new JLabel("ADDRESS");
        u6.setBounds(50,350,120,35);
        add(u6);
        
        t6=new JTextField();
        t6.setBounds(180,350,150,30);
        add(t6);
		
		u7=new JLabel("DEPARTMENT");
        u7.setBounds(500,50,120,35);
        add(u7);
        
        t7=new JTextField();
        t7.setBounds(600,50,150,30);
        add(t7);
		
		u8=new JLabel("DESIGNATION");
        u8.setBounds(500,100,120,35);
        add(u8);
        
        t8=new JTextField();
        t8.setBounds(600,100,150,30);
        add(t8);
		
		
		u9=new JLabel("DATE HIRED");
        u9.setBounds(500,150,120,35);
        add(u9);
        
        t9=new JTextField();
        t9.setBounds(600,150,150,30);
        add(t9);
		
		u10=new JLabel("BASIC SALARY");
        u10.setBounds(500,200,120,35);
        add(u10);
        
        t10=new JTextField();
        t10.setBounds(600,200,150,30);
        add(t10);
		
		u11=new JLabel("JOB TITEL");
        u11.setBounds(500,250,120,35);
        add(u11);
        
        t11=new JTextField();
        t11.setBounds(600,250,150,30);
        add(t11);
		
		u12=new JLabel("GRADE");
        u12.setBounds(500,300,120,35);
        add(u12);
        
        t12=new JTextField();
        t12.setBounds(600,300,150,30);
        add(t12);
		
		u13=new JLabel("POST CODE");
        u13.setBounds(500,350,120,35);
        add(u13);
        
        t13=new JTextField();
        t13.setBounds(600,350,150,30);
        add(t13);
		

b1=new JButton("SEARCH");
 b1.setBounds(200,500,100,30);
add(b1);
b2=new JButton("GENERATE SLIP ");
 b2.setBounds(350,500,200,30);
add(b2);
b3=new JButton("BACK");
 b3.setBounds(600,500,100,30);
add(b3);
b1.addActionListener(this);

    }
	public void actionPerformed(ActionEvent e)
{ 
if(e.getSource()==b1)
{
	 String s1=t1.getText();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///minor","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from employeerecord where EMPID='"+s1+"'");
			if(rs.next())
			{
				t1.setText(rs.getString(1));
				t2.setText(rs.getString(2));
				t3.setText(rs.getString(3));
				t4.setText(rs.getString(5));
				t5.setText(rs.getString(6));
				t6.setText(rs.getString(7));
				t7.setText(rs.getString(8));
				t8.setText(rs.getString(9));
				t9.setText(rs.getString(10));
				t10.setText(rs.getString(11));
				t11.setText(rs.getString(12));
				t12.setText(rs.getString(13));
				t13.setText(rs.getString(14));
				t14.setText(rs.getString(4));
			}
			else
			{t1.setText("");			
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
			JOptionPane.showMessageDialog(null,"Invalid ROLL.no...");
			con.close();
			}
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
}

}
}