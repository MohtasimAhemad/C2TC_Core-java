package training.c2tc.day37;

import java.awt.Button;
import java.awt.FlowLayout;
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
		setLayout(new FlowLayout()); 
		add(b1 = new Button("Click Me!!"));
		add(t = new TextField(15));
		add(b2 = new Button("Clear me"));
		b1.addActionListener((e)->t.setText("hello world"));
		b2.addActionListener((e)->t.setText(""));
		addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent we )
			{
				System.exit(0);
			}
		});
		setSize(400,500);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{

		new GUIApp1();
		
	}

}
