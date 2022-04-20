package training.c2tc.day32;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletPart3 extends Applet {

	Button b1,b2;
	static TextField t;
	public void init() //override
	{
		add(b1=new Button("Click"));
		add(t=new TextField(15));
		add(b2=new Button("Clear"));
		b1.addActionListener(new ABA());
	
		b2.addActionListener(new ABB());
	}
}

class ABA implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent arg0) {

		AppletPart3.t.setText("Hello World");
		
	}
	
}
class ABB implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		AppletPart3.t.setText("Hello World");

	}
	
}
