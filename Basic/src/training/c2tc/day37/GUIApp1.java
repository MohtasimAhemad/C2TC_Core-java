package training.c2tc.day37;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUIApp1 extends Frame
{
	Button b1,b2;
	TextField t;

	GUIApp1()
	{
		add(b1 = new Button("Click Me!!"));
		add(t = new TextField(15));
		add(b2 = new Button("Clear me"));
		b1.addActionListener((e)->t.setText("hello world"));
		b2.addActionListener((e)->t.setText(""));
		addWindowListener(new WindowAdapter()
		{
			
			public void windowClosing(WindowEvent we )
			{
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args)
	{

		GUIApp1 g = new GUIApp1();
		
	}

}
