import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class FDemo extends JFrame implements ActionListener
{


CardLayout card;
	Container cn=getContentPane();
	HomeDemo home;
	Admin ad;
	Admin1 ad1;
	User us;
	Regis rs;
	EmployeeReport er;
	Allowance aw;
	Deduction de;
	 SearchEmployeeSalary ses;
	 Generateslip salslip;
	 UserGenerateslip usg;
FDemo()
{
	card=new CardLayout();
	   setLayout(card);
	    home=new HomeDemo();
	   ad=new Admin();
	   us=new User();
	   rs=new Regis();
	   ad1=new Admin1();
	   er=new EmployeeReport();
	    aw=new Allowance();
		de=new Deduction();
	   ses=new  SearchEmployeeSalary();
	   salslip=new Generateslip();
	   usg=new UserGenerateslip();
	    add("hm",home);
	    add("admin",ad);
		add("user",us);
		add("regis",rs);
		add("admin1",ad1);
		add("Employee",er);
		add("allow",aw);
		add("deduct",de);
		add("ses",ses);
		add("salslip",salslip);
		add("usg",usg);
		
	  home.b1.addActionListener(this);
	  home.b2.addActionListener(this);
	  home.b3.addActionListener(this);  
	  us.b2.addActionListener(this);
	  us.b1.addActionListener(this);
	 ad.b1.addActionListener(this);
	 ad.b2.addActionListener(this);
	 rs.b2.addActionListener(this);
	 
	 ad1.b1.addActionListener(this);
	 ad1.b2.addActionListener(this);
	 ad1.b3.addActionListener(this);
	 ad1.b4.addActionListener(this);
	 ad1.b5.addActionListener(this);
	 
	 er.b1.addActionListener(this);
	aw.b4.addActionListener(this);
	de.b1.addActionListener(this);
	ses.b3.addActionListener(this);
	ses.b2.addActionListener(this);
	
	salslip.b2.addActionListener(this);
	
	
	usg.b1.addActionListener(this);
	usg.b2.addActionListener(this);
	usg.b4.addActionListener(this);
	
	
	// rs.b2.addActionListener(this);


		}

public void actionPerformed(ActionEvent e)
{

if(e.getSource()==us.b1)
	{
		String s1=us.tx1.getText();
		String s2=us.t2.getText();
		try{
		Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql:///minor","root","root");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from login where uname='"+s1+"' and upass='"+s2+"'");

			if(rs.next())
	{
		usg.l0.setText("WELCOME ID No."+" "+" "+s1);
		card.show(cn,"usg");	
	}		
	else{
		JOptionPane.showMessageDialog(null,"Invalid user_name and password","wrong detail",JOptionPane.INFORMATION_MESSAGE);
		con.close();
	}
	
		}	
		
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		
	}

	if(e.getSource()==ad.b1)
	{
		String s1=ad.tx1.getText();
		String s2=ad.t2.getText();
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql:///minor","root","root");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from login where uname='"+s1+"' and upass='"+s2+"'");

			if(rs.next())
	{
		ad1.l.setText("WELCOME"+" "+" "+s1);
		card.show(cn,"admin1");	
	}		
	else{
		JOptionPane.showMessageDialog(null,"Invalid user_name and password","wrong detail",JOptionPane.INFORMATION_MESSAGE);
			//	JOptionPane.showMessageDialog(null,"invalid user name and Password",""JOptionPane.WARNING_MESSAGE);
	con.close();
	}
		}	
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		 ad.tx1.setText("");
		ad.t2.setText("");
	}
if(e.getSource()==home.b2)
{
		card.show(cn,"user");
}
if(e.getSource()==ad.b2||e.getSource()==us.b2||e.getSource()==rs.b2)
{
	 card.show(cn,"hm");  

}	
if(e.getSource()==home.b3)
{
	card.show(cn,"regis");
}
if(e.getSource()==ad1.b1)
{
	card.show(cn,"Employee");
}
if(e.getSource()==ad1.b2)
{
	card.show(cn,"allow");
}
if(e.getSource()==ad1.b3)
{
	card.show(cn,"deduct");
}
if(e.getSource()==ad1.b4||e.getSource()==salslip.b2)
{
	card.show(cn,"ses");
}
if(e.getSource()==aw.b4||e.getSource()==de.b1||e.getSource()==ses.b3||e.getSource()==er.b1)
{
	card.show(cn,"admin1");
}
if(e.getSource()==ad1.b5||e.getSource()==home.b1)
{
	card.show(cn,"admin");
}
if(e.getSource()==ses.b2)
{
	card.show(cn,"salslip");
}

if(e.getSource()==usg.b4)
{
	 us.tx1.setText("");
	us.t2.setText("");
	card.show(cn,"user");
	usg.l.setText("");
				usg.l1.setText("");
				usg.l2.setText("");
				usg.l3.setText("");
				usg.l4.setText("");
				usg.l5.setText("");
				usg.l6.setText("");
				usg.l7.setText("");
				usg.l8.setText("");
				usg.l9.setText("");
				usg.l10.setText("");
				usg.l11.setText("");
				usg.l12.setText("");
				usg.l13.setText("");
				usg.l14.setText("");
				usg.l15.setText("");
				usg.l16.setText("");
				usg.l17.setText("");
				usg.l18.setText("");
				usg.l19.setText("");
				usg.l20.setText("");
				usg.l21.setText("");
				usg.l22.setText("");
				usg.l23.setText("");
				usg.l24.setText("");
				usg.l25.setText("");
				usg.l26.setText("");
				usg.l27.setText("");
				usg.l28.setText("");
				usg.l29.setText("");
				usg.l30.setText("");
}

if(e.getSource()==usg.b1){
int s1=Integer.parseInt(us.tx1.getText());
		try
		{	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///minor","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from employeerecord where EMPID='"+s1+"' ");
			if(rs.next())
			{
				
				usg.l.setText("Employee ID :"+" "+" "+" "+rs.getString(1));
				usg.l1.setText("FNAME :"+" "+" "+" "+rs.getString(2));
				usg.l2.setText("LNAME :"+" "+" "+" "+rs.getString(3));
				usg.l3.setText("DOB :"+" "+" "+" "+rs.getString(4));
				usg.l4.setText("EMAIL :"+" "+" "+" "+rs.getString(5));
				usg.l5.setText("CONTACT :"+" "+" "+" "+rs.getString(6));
				usg.l6.setText("ADDRESS :"+" "+" "+" "+rs.getString(7));
				usg.l7.setText("DEPARTMENT :"+" "+" "+" "+rs.getString(8));
				usg.l8.setText("DESINGNATION :"+" "+" "+" "+rs.getString(9));
				usg.l9.setText("DATE HIRED :"+" "+" "+" "+rs.getString(10));
				usg.x=rs.getInt(11);
				usg.l10.setText("BASIC SALARY :"+" "+" "+" "+usg.x);
				usg.l11.setText("JOB TITLE :"+" "+" "+" "+rs.getString(12));
				usg.l12.setText("GRADE :"+" "+" "+" "+rs.getString(13));
				usg.l13.setText("POST CODE :"+" "+" "+" "+rs.getString(14));
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

if(e.getSource()==usg.b2){

String s1=us.tx1.getText();
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///minor","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from deduction where EMPID='"+s1+"' ");
			if(rs.next())
			{
				usg.l25.setText("DEDUCTION");
				usg.l29.setText("_____");
				usg.l14.setText("PF :"+" "+" "+" "+rs.getString(6));
				usg.l15.setText("TAX :"+" "+" "+" "+rs.getString(7));
				usg.l16.setText("ROM :"+" "+" "+" "+rs.getString(8));
				usg.l17.setText("OTHER :"+" "+" "+" "+rs.getString(9));
				usg.l26.setText("______");
				usg.y=rs.getInt(10);
			usg.l18.setText("TOTAL :"+" "+" "+" "+usg.y);
				
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
	try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///minor","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from allowance where EMPID='"+s1+"' ");
			if(rs.next())
			{
				usg.l27.setText("ALLOWANCE");
				usg.l30.setText("_____");
				usg.l19.setText("MEDICAL :"+" "+" "+" "+rs.getString(8));
				usg.l20.setText("BONUS :"+" "+" "+" "+rs.getString(9));
				usg.l21.setText("OTHER :"+" "+" "+" "+rs.getString(10));
				usg.l22.setText("TOTAL OVERTIME AMOUNT :"+" "+" "+" "+rs.getString(11));
				usg.l28.setText("___________");
				usg.z=rs.getInt(13);
				usg.l23.setText("TOTAL :"+" "+" "+" "+usg.z);
				
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
			{
			usg.l24.setText("TOTAL SALARY :"+" "+" "+" "+((usg.x-usg.y)+usg.z));
			}
			}
	}

}


class Demo
{
public static void main(String ar[])
{
FDemo f=new FDemo();
int p,q,r=1000,s=600;
		f.setVisible(true);
		Toolkit t=Toolkit.getDefaultToolkit();
		Dimension d =t.getScreenSize();
		p=(d.width-r)/2;
		q=(d.height-s)/2;
		
		f.setBounds(p,q,r,s);	
		}
}