package training.c2tc.day32;
/* lambda Expression */
import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;

public class AppletPart6 extends Applet 
{
	Button b1,b2;
	TextField t;
	public void init() //override
	{
		add(b1=new Button("Click"));
		add(t=new TextField(15));
		add(b2=new Button("Clear"));
		b1.addActionListener((ActionEvent e )-> {t.setText("Hello world");});
		b1.addActionListener((e)->{t.setText("Hello world");});
		b1.addActionListener((e)->t.setText("Hello world"));
		b2.addActionListener((e)->t.setText(""));
}
}