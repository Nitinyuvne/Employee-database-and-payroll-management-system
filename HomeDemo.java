import javax.swing.*;
import java.awt.*;

class HomeDemo extends JPanel
{
JButton b1,b2,b3;
HomeDemo()
{
		setBackground(Color.cyan);

	b1=new JButton("Admin");
	add(b1);
	b2=new JButton("User");
	add(b2);
	b3=new JButton("Registration");
	add(b3);
	
	
}
}