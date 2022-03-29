package training.c2tc.day22;

import java.applet.Applet;
import java.awt.TextField;

public class Simple extends Applet
{

	TextField t1, t2,t3,t4;  
	
	public void init()
	{
		add(t1 = new TextField("Hello"));
		add(t2 = new TextField("hiii"));
		add(t4 = new TextField("Hello"));
		add(t4 = new TextField("hiii"));

	}

}
