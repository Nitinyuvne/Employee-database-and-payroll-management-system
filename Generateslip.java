import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Generateslip extends JPanel implements ActionListener 
{
JButton b1,b2,b3;
JLabel u1;
JTextField t1;
JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30;
int x,y,z;
Generateslip()
{
	setBackground(Color.yellow);
	setLayout(null);
	 u1=new JLabel("Employee ID");
        u1.setBounds(20,20,120,35);
        add(u1);
        
        t1=new JTextField();
        t1.setBounds(100,20,150,30);
        add(t1);
b1=new JButton("GENERATE SLIP ");
b1.setBounds(250,20,180,30);
add(b1);
b2=new JButton("Back ");
 b2.setBounds(700,20,100,30);
add(b2);
b3=new JButton("Clear");
 b3.setBounds(450,20,100,30);
add(b3);
	l=new JLabel("");
l.setBounds(50,15,200,200);
add(l);	

l1=new JLabel("");
l1.setBounds(50,45,200,200);
add(l1);

l2=new JLabel("");
l2.setBounds(50,70,200,200);
add(l2);

l3=new JLabel("");
l3.setBounds(50,100,200,200);
add(l3);

l4=new JLabel("");
l4.setBounds(50,130,200,200);
add(l4);

l5=new JLabel("");
l5.setBounds(50,160,200,200);
add(l5);

l6=new JLabel("");
l6.setBounds(50,190,200,200);
add(l6);

l7=new JLabel("");
l7.setBounds(50,220,200,200);
add(l7);

l8=new JLabel("");
l8.setBounds(50,250,200,200);
add(l8);

l9=new JLabel("");
l9.setBounds(50,280,200,200);
add(l9);

l10=new JLabel("");
l10.setBounds(50,310,200,200);
add(l10);

l11=new JLabel("");
l11.setBounds(50,340,200,200);
add(l11);

l12=new JLabel("");
l12.setBounds(50,370,200,200);
add(l12);

l13=new JLabel("");
l13.setBounds(50,400,200,200);
add(l13);

l25=new JLabel("");
l25.setBounds(400,15,200,200);
add(l25);
l29=new JLabel("");
l29.setBounds(400,15,200,200);
add(l29);

l14=new JLabel("");
l14.setBounds(400,45,200,200);
add(l14);

l15=new JLabel("");
l15.setBounds(400,75,200,200);
add(l15);

l16=new JLabel("");
l16.setBounds(400,105,200,200);
add(l16);

l17=new JLabel("");
l17.setBounds(400,135,200,200);
add(l17);

l26=new JLabel("");
l26.setBounds(400,135,200,200);
add(l26);

l18=new JLabel("");
l18.setBounds(400,160,200,200);
add(l18);

l27=new JLabel("");
l27.setBounds(400,200,200,200);
add(l27);
l30=new JLabel("");
l30.setBounds(400,200,200,200);
add(l30);

l19=new JLabel("");
l19.setBounds(400,230,200,200);
add(l19);

l20=new JLabel("");
l20.setBounds(400,260,200,200);
add(l20);

l21=new JLabel("");
l21.setBounds(400,290,200,200);
add(l21);

l22=new JLabel("");
l22.setBounds(400,320,200,200);
add(l22);

l28=new JLabel("");
l28.setBounds(400,320,300,200);
add(l28);

l23=new JLabel("");
l23.setBounds(400,350,200,200);
add(l23);

l24=new JLabel("");
l24.setBounds(700,300,200,200);
add(l24);
	
b1.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
	
	if(e.getSource()==b1)
	{
		{
		 String s1=t1.getText();
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///minor","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from deduction where EMPID='"+s1+"' ");
			if(rs.next())
			{
				l25.setText("DEDUCTION");
				l29.setText("_____");
				l14.setText("PF :"+" "+" "+" "+rs.getString(6));
				l15.setText("TAX :"+" "+" "+" "+rs.getString(7));
				l16.setText("ROM :"+" "+" "+" "+rs.getString(8));
				l17.setText("OTHER :"+" "+" "+" "+rs.getString(9));
				l26.setText("______");
				y=rs.getInt(10);
				l18.setText("TOTAL :"+" "+" "+" "+y);
				
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Invalid ROLL.no...");
			con.close();
			}
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
		{
		String s1=t1.getText();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///minor","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from employeerecord where EMPID='"+s1+"' ");
			if(rs.next())
			{
				l.setText("Employee ID :"+" "+" "+" "+rs.getString(1));
				l1.setText("FNAME :"+" "+" "+" "+rs.getString(2));
				l2.setText("LNAME :"+" "+" "+" "+rs.getString(3));
				l3.setText("DOB :"+" "+" "+" "+rs.getString(4));
				l4.setText("EMAIL :"+" "+" "+" "+rs.getString(5));
				l5.setText("CONTACT :"+" "+" "+" "+rs.getString(6));
				l6.setText("ADDRESS :"+" "+" "+" "+rs.getString(7));
				l7.setText("DEPARTMENT :"+" "+" "+" "+rs.getString(8));
				l8.setText("DESINGNATION :"+" "+" "+" "+rs.getString(9));
				l9.setText("DATE HIRED :"+" "+" "+" "+rs.getString(10));
				x=rs.getInt(11);
				l10.setText("BASIC SALARY :"+" "+" "+" "+x);
				l11.setText("JOB TITLE :"+" "+" "+" "+rs.getString(12));
				l12.setText("GRADE :"+" "+" "+" "+rs.getString(13));
				l13.setText("POST CODE :"+" "+" "+" "+rs.getString(14));
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Invalid ROLL.no...");
			con.close();
			}
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
			}
			
			
			{
				 String s1=t1.getText();
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///minor","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from allowance where EMPID='"+s1+"' ");
			if(rs.next())
			{
				l27.setText("ALLOWANCE");
				l30.setText("_____");
				l19.setText("MEDICAL :"+" "+" "+" "+rs.getString(8));
				l20.setText("BONUS :"+" "+" "+" "+rs.getString(9));
				l21.setText("OTHER :"+" "+" "+" "+rs.getString(10));
				l22.setText("TOTAL OVERTIME AMOUNT :"+" "+" "+" "+rs.getString(11));
				l28.setText("___________");
				z=rs.getInt(13);
				l23.setText("TOTAL :"+" "+" "+" "+z);
				
			}
			else
			{
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
			{
			l24.setText("TOTAL SALARY :"+" "+" "+" "+((x-y)+z));
			}
			if(e.getSource()==b3)
			{
				t1.setText("");
				l.setText("");
				l1.setText("");
				l2.setText("");
				l3.setText("");
				l4.setText("");
				l5.setText("");
				l6.setText("");
				l7.setText("");
				l8.setText("");
				l9.setText("");
				l10.setText("");
				l11.setText("");
				l12.setText("");
				l13.setText("");
				l14.setText("");
				l15.setText("");
				l16.setText("");
				l17.setText("");
				l18.setText("");
				l19.setText("");
				l20.setText("");
				l21.setText("");
				l22.setText("");
				l23.setText("");
				l24.setText("");
				l25.setText("");
				l26.setText("");
				l27.setText("");
				l28.setText("");
				l29.setText("");
				l30.setText("");
				
			}
}
}