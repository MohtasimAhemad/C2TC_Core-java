package training.c2tc.day39;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class ArrayDemoApplet extends Frame {
	int[] x;
	int[] y;
	int i=0;
	ArrayDemoApplet()
	{
		x= new int[7];
		y= new int[7];
		for( i=0; i<x.length; i++)  
		{
			x[i]=(int)(400*Math.random());
			y[i]=(int)(400*Math.random());
		}
//		setLayout(new FlowLayout()); 
		addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent we )
			{
				System.exit(0);
			}
		});
		setSize(500,500);
		setVisible(true);
	}

	
	public void paint(Graphics g)
	{
		g.drawPolyline(x, y, 5);
	}
	public static void main(String[] args) {
		new ArrayDemoApplet();
	}

}
/*
 * Activity
 * difference between for,while,do while,for each
 * type casting
 */
 