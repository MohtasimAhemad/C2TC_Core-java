package training.c2tc.day24;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Event;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Applet5 extends Applet
{
	Panel1 p1;
	Panel2 p2;
	public void init()
	{
		setLayout(new GridLayout(1,2));
		add(p1 = new Panel1());
		add(p2 = new Panel2());
		p2.c1.setState(true);
		p2.c2.setState(true);
		p2.c3.setState(false);
		p2.t.setText("boom");
		p2.t.setEditable(false);
		
	}
	 

}
	
class Panel1 extends Panel
{
	Checkbox c1,c2,c3;
	CheckboxGroup group;
	public Panel1()
	{
		setLayout(new GridLayout(3,1));
		group = new CheckboxGroup();
		add(c1 = new Checkbox("T1", group , true));
		add(c2 = new Checkbox("T2", group , true));
		add(c3 = new Checkbox("T3", group , true));
	}
}

class Panel2 extends Panel
{
	Checkbox c1,c2,c3;
	TextField t;
	public Panel2()
	{
		setLayout(new GridLayout(4,1));
		add(c1 = new Checkbox("m1"));
		add(c2 = new Checkbox("m2"));
		add(c3 = new Checkbox("m3"));
		add(t = new TextField(15));
	}
	
}