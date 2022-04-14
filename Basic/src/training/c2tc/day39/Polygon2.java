package training.c2tc.day39;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Polygon2 extends Frame{
	        // give x coordinates value
	        int x[] = { 27, 30, 40, 50, 110, 140 };
	  
	       // give y coordinates value
	        int y[] = { 140, 110, 50, 40, 30, 10 };
	
	
	Polygon2()
	{
		
//		setLayout(new FlowLayout()); 
		addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent we )
			{
				System.exit(0);
			}
		});
		setSize(400,400);
		setVisible(true);
	}

	
	public void paint(Graphics g)
	{
		g.drawPolyline(x, y, 6);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Polygon2();
	}

}
