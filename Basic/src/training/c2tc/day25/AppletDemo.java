package training.c2tc.day25;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;

public class AppletDemo extends Applet {
	Button b ;  //declaration area
	TextField t;

	public void init() {
		b = new Button();
		t = new TextField();
		b.setLabel("Submit");
//		b.setLabel("Cancel");
		add(b);
		add(t);
	}

}
