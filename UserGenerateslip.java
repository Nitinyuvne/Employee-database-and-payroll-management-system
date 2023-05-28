import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class UserGenerateslip extends JPanel implements ActionListener 
{
	JLabel l0,l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30;
int x,y,z;

JButton b1,b2,b3,b4;

UserGenerateslip()
{
setBackground(Color.yellow);
	setLayout(null);
	
l0=new JLabel("");
l0.setBounds(800,1,200,200);
add(l0);	

	 
b1=new JButton("EMPLOYEE REPORT ");
b1.setBounds(50,50,250,50);
add(b1);
//b1.addActionListener(this);
b2=new JButton("SALARY REPORT ");
b2.setBounds(50,150,250,50);
add(b2);

b3=new JButton("CLEAR");
b3.setBounds(50,250,250,50);
add(b3);

b4=new JButton("LOGOUT");
b4.setBounds(50,350,250,50);
add(b4);

l=new JLabel("");
l.setBounds(400,15,200,200);
add(l);	

l1=new JLabel("");
l1.setBounds(400,45,200,200);
add(l1);

l2=new JLabel("");
l2.setBounds(400,70,200,200);
add(l2);

l3=new JLabel("");
l3.setBounds(400,100,200,200);
add(l3);

l4=new JLabel("");
l4.setBounds(400,130,200,200);
add(l4);

l5=new JLabel("");
l5.setBounds(400,160,200,200);
add(l5);

l6=new JLabel("");
l6.setBounds(400,190,200,200);
add(l6);

l7=new JLabel("");
l7.setBounds(400,220,200,200);
add(l7);

l8=new JLabel("");
l8.setBounds(400,250,200,200);
add(l8);

l9=new JLabel("");
l9.setBounds(400,280,200,200);
add(l9);

l10=new JLabel("");
l10.setBounds(400,310,200,200);
add(l10);

l11=new JLabel("");
l11.setBounds(400,340,200,200);
add(l11);

l12=new JLabel("");
l12.setBounds(400,370,200,200);
add(l12);

l13=new JLabel("");
l13.setBounds(400,400,200,200);
add(l13);

b3.addActionListener(this);

l25=new JLabel("");
l25.setBounds(650,15,200,200);
add(l25);
l29=new JLabel("");
l29.setBounds(650,15,200,200);
add(l29);

l14=new JLabel("");
l14.setBounds(650,45,200,200);
add(l14);

l15=new JLabel("");
l15.setBounds(650,75,200,200);
add(l15);

l16=new JLabel("");
l16.setBounds(650,105,200,200);
add(l16);

l17=new JLabel("");
l17.setBounds(650,135,200,200);
add(l17);

l26=new JLabel("");
l26.setBounds(650,135,200,200);
add(l26);

l18=new JLabel("");
l18.setBounds(650,160,200,200);
add(l18);

l27=new JLabel("");
l27.setBounds(650,200,200,200);
add(l27);

l30=new JLabel("");
l30.setBounds(650,200,200,200);
add(l30);

l19=new JLabel("");
l19.setBounds(650,230,200,200);
add(l19);

l20=new JLabel("");
l20.setBounds(650,260,200,200);
add(l20);

l21=new JLabel("");
l21.setBounds(650,290,200,200);
add(l21);

l22=new JLabel("");
l22.setBounds(650,320,200,200);
add(l22);

l28=new JLabel("");
l28.setBounds(650,320,300,200);
add(l28);

l23=new JLabel("");
l23.setBounds(650,350,200,200);
add(l23);

l24=new JLabel("");
l24.setBounds(750,400,200,200);
add(l24);


}
public void actionPerformed(ActionEvent e)
{ 
if(e.getSource()==b3)
			{
				
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