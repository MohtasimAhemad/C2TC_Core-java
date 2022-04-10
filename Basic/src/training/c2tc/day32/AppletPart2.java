package training.c2tc.day32;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletPart2 extends Applet implements ActionListener
{
	Button b1,b2;
	TextField t;
	public void init() //override
	{
		add(b1=new Button("Click"));
		add(t=new TextField(15));
		add(b2=new Button("Clear"));
		b1.addActionListener(this);
//		AA a = new AA();
		b2.addActionListener(new AA());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		t.setText("Hello World");
		
	}
	class AA implements ActionListener
	{
		/*public AA()
		{
			b2.addActionListener(this);
		}
		*/
		
		@Override
		public void actionPerformed(ActionEvent a) //implements
		{
			t.setText("");
			
		}
		
	}
	

}

