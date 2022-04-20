package training.c2tc.day32;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletPart4 extends Applet
{
	Button b1,b2;
	static TextField t;
	public void init() //override
	{
		add(b1=new Button("Click"));
		add(t=new TextField(15));
		add(b2=new Button("Clear"));
		b1.addActionListener(new AAA());
//		AA a = new AA();
		b2.addActionListener(new BBB());
	}
}
class AAA  implements ActionListener //outer class
{
	
	
	public void actionPerformed(ActionEvent a) //implements
	{
//		AppletPart4 a1 = new AppletPart4();
		AppletPart4.t.setText("Hello World");
		
	}
	
}

class BBB  implements ActionListener
{
	
	@Override
	public void actionPerformed(ActionEvent a) //implements
	{
		AppletPart4.t.setText("");
		
	}
	
}