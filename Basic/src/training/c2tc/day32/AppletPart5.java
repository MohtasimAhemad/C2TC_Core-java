package training.c2tc.day32;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AppletPart5 extends Applet{

	Button b1,b2;
	TextField t;
	public void init() //override
	{
		add(b1=new Button("Click"));
		add(t=new TextField(15));
		add(b2=new Button("Clear"));
//		b1.addActionListener(new AAA());
//		b2.addActionListener(new BBB());
		b1.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						t.setText("Hello World");
					}
			
				});
		b2.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						t.setText("");
					}
			
				});
	}
	/*
	 class AAA implements ActionListener
	{
		
		@Override
		public void actionPerformed(ActionEvent a) //implements
		{
			t.setText("Hello World");
			
		}
		
	}

	class BBB implements ActionListener
	{
		
		@Override
		public void actionPerformed(ActionEvent a) //implements
		{
			t.setText("");
			
		}
		
	}
	 */
}
