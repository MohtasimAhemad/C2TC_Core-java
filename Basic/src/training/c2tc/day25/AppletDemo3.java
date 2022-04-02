package training.c2tc.day25;


import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.Event;
import java.awt.GridLayout;
import java.awt.TextField;

public class AppletDemo3 extends Applet{
	Checkbox c1,c2,c3,c4,c5;
	TextField  t;
	
	public void init() 
	{
		setLayout(new GridLayout(5,1));
		add(c1= new Checkbox("1"));
		add(c2= new Checkbox("2"));
		add(c3= new Checkbox("3"));
		add(c4= new Checkbox("4"));
		add(c5= new Checkbox("5"));
		add(t = new TextField(15));
	}
	public boolean action(Event e, Object o)
	{
		int pro = 1;
		if(c1.getState())
			pro= pro*1;
		if(c2.getState())
			pro= pro*2;
		if(c3.getState())
			pro= pro*3;
		if(c4.getState())
			pro= pro*4;
		if(c5.getState())
			pro= pro*5;
		t.setText(String.valueOf(pro));
		
		return true;
	}
}
