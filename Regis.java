import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Regis extends JPanel implements ActionListener
{
JTextField tx1;
JLabel u1,u2;
JPasswordField t2;
JButton b1,b2;
Regis()
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
b1=new JButton("Registration");
 b1.setBounds(450,200,150,30);
add(b1);
b2=new JButton("Back");
 b2.setBounds(350,200,90,30);
add(b2);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
	String s1=tx1.getText();
	String s2=t2.getText();
	try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql:///minor","root","root");
Statement st=con.createStatement();
st.executeUpdate("insert into login values ('"+s1+"','"+s2+"')");
JOptionPane.showMessageDialog(b1,"Data Insert","insert page",JOptionPane.INFORMATION_MESSAGE);
//System.out.println("data insert");
tx1.setText("");
t2.setText("");

con.close();
}
catch(Exception e1)
{
	System.out.println(e1);
}
}

}