package training.c2tc.day22;

import java.awt.Button;
import java.awt.Event;
import java.applet.*;
import java.awt.TextField;

public class First extends Applet
{
	Button b1,b2;
	TextField t;
	
	public  void init()
	{
//		b1=new Button("Click");
//		t=new TextField(5);
//		b2 = new Button("clear");
		
		add(b1=new Button("Click"));
		add(t=new TextField(5));
		add(b2 = new Button("clear"));
	}

	public boolean action(Event e, Object o)
	{
		if(e.target.equals(b1))
				{
			t.setText("hello");
				}
		if(e.target.equals(b2))
				{
			t.setText("");
				}
				return true;
	}
	public static void main(String[] args) {

		
	}

}
