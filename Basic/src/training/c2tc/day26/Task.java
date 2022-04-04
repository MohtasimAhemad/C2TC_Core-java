package training.c2tc.day26;
/*  left side 10 button and right side table of that number. */

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Event;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Task extends Applet
{
	Panel3 p3;
	Panel4 p4;
	public void init()
	{
		setLayout(new GridLayout(1,2));
		add(p3 = new Panel3());
		add(p4 = new Panel4());
		p3.c1.setState(true);
		p3.c2.setState(true);
		p3.c3.setState(true);
		p3.c4.setState(true);
		p3.c5.setState(true);
		p3.c6.setState(true);
		p3.c7.setState(true);
		p3.c8.setState(true);
		p3.c9.setState(true);
		p3.c10.setState(true);
		
		
	}
public boolean action(Event e,Object o)
{
	if(p3.c1.getState())
	{
		for(int i = 1;i<=10;i++)
		{
		    System.out.println(1*i);
		}
	}
	if(p3.c2.getState())
	{
		for(int i = 1;i<=10;i++)
		{
			System.out.println(2*i);
		}
	}
	if(p3.c3.getState())
	{
		for(int i = 1;i<=10;i++)
		{
			System.out.println(3*i);
		}
	}
	if(p3.c4.getState())
	{
		for(int i = 1;i<=10;i++)
		{
			System.out.println(4*i);
		}
	}
	if(p3.c5.getState())
	{
		for(int i = 1;i<=10;i++)
		{
			System.out.println(5*i);
		}
	}
	
	if(p3.c6.getState())
	{
		for(int i = 1;i<=10;i++)
		{
			System.out.println(6*i);
		}
	}
	if(p3.c7.getState())
	{
		for(int i = 1;i<=10;i++)
		{
			System.out.println(7*i);
		}
	}
	if(p3.c8.getState())
	{
		for(int i = 1;i<=10;i++)
		{
			System.out.println(8*i);
		}
	}
	if(p3.c9.getState())
	{
		for(int i = 1;i<=10;i++)
		{
			System.out.println(9*i);
		}
	}
	if(p3.c10.getState())
	{
		for(int i = 1;i<=10;i++)
		{
			System.out.println(10*i);
		}
	}
	return true;
}
}


class Panel3 extends Panel
{
	Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
	CheckboxGroup group;
	public Panel3()
	{
		setLayout(new GridLayout(10,1));
		group = new CheckboxGroup();
		add(c1 = new Checkbox("T1", group , true));
		add(c2 = new Checkbox("T2", group , true));
		add(c3 = new Checkbox("T3", group , true));
		add(c4 = new Checkbox("T3", group , true));
		add(c5 = new Checkbox("T3", group , true));
		add(c6 = new Checkbox("T3", group , true));
		add(c7 = new Checkbox("T3", group , true));
		add(c8 = new Checkbox("T3", group , true));
		add(c9 = new Checkbox("T3", group , true));
		add(c10 = new Checkbox("T3", group , true));
	}
}
class Panel4 extends Panel
{
	
	TextField t;
	public Panel4()
	{
		setLayout(new GridLayout(4,1));
		
		add(t = new TextField(15));
	}
	
}