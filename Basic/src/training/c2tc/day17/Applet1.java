package training.c2tc.day17;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;

public class Applet1 extends Applet{

	Button b; // declaration area
	TextField t;
	public void init()
	{
		b = new Button("submit"); // 
		add(b);
		t=new TextField();
		add(t);
	}
}
//add gui components in java 