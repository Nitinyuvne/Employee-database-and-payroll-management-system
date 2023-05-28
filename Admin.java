import javax.swing.*;
import java.awt.*;
import java.sql.*;

class Admin extends JPanel 
{
JTextField tx1;
JLabel u1,u2;
JPasswordField t2;
JButton b1,b2;
Admin()
{
	setBackground(Color.red);

	setLayout(null);
 u1=new JLabel("Enter I'd");
 u1.setBounds(350,50,100,30);
 add(u1);
 
tx1=new JTextField(10);
tx1.setBounds(450,50,150,30);
add(tx1);
u2=new JLabel("Enter passward");
 u2.setBounds(350,100,100,30);
 add(u2);
t2=new JPasswordField(10);
t2.setBounds(450,100,150,30);
add(t2);
b1=new JButton("Login");
 b1.setBounds(450,200,100,30);
add(b1);
b2=new JButton("Back");
 b2.setBounds(350,200,90,30);
add(b2);

}
}