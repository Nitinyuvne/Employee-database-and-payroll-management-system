import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;
import java.sql.*;

class Admin1 extends JPanel
{
JButton b1,b2,b3,b4,b5;
JLabel l;

Admin1()
{
	setBackground(Color.yellow);
	setLayout(null);
	
l=new JLabel("");
l.setBounds(800,1,200,200);
add(l);	
b1=new JButton("Employee Record");
b1.setBounds(50,50,250,50);
add(b1);
b2=new JButton("Allowance");
b2.setBounds(50,150,250,50);
add(b2);
b3=new JButton("Deduction");
b3.setBounds(50,250,250,50);
add(b3);
b4=new JButton("Search Emplyee Salary");
b4.setBounds(50,350,250,50);
add(b4);

b5=new JButton("LogOut");
b5.setBounds(50,500,100,50);
add(b5);

}
}