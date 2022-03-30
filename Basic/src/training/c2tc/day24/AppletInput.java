package training.c2tc.day24;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;

public class AppletInput extends Applet
{
	TextField txt1,txt2,txt3;
	Label lbl1,lbl2,lbl3;
	public void init()
	{
		
	txt1=new TextField(8);
	lbl1=new Label("Enter First No");
	txt2=new TextField(8);
	lbl2=new Label("Enter second No");
	
	
	
	add(lbl1);
	add(txt1);
	add(lbl2);
	add(txt2);

	
	}
	
	public void paint(Graphics g)
	{
		int a=0,b=0,c=0;
		String s1,s2,res;
		
		try
		{
			s1=txt1.getText();
			a=Integer.parseInt(s1);
			
			s2=txt2.getText();
			b=Integer.parseInt(s2);
		}
		catch(Exception e)
		{
		}

		
		c=a+b;
		res=String.valueOf(c); 
		g.drawString("The Sum is :",50,150); 
		g.drawString(res,150,150);

	}
	public boolean action(Event e,Object obj)
	{
	repaint();
	return true;
	}
}
