package training.c2tc.day32;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// when ever we i am suppose to pass the ob of the class who implement the interface
public class AppletPart1 extends Applet implements ActionListener
{
	Button b1,b2;
	TextField t;
	public void init()
	{
		add(b1=new Button("Click"));
		add(t=new TextField(15));
		add(b2=new Button("Clear"));
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent a) {
		// TODO Auto-generated method stub
		Object o = a.getSource();
		if(o.equals(b1))
			t.setText("Hello World");
		if(o.equals(b2))
			t.setText("");
	}

}
