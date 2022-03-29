package training.c2tc.day22;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class FillColor extends Applet
{
	public void paint(Graphics g) // is used to paint the Applet.
	{
	      g.drawRect(300,150,200,100); 
	      g.setColor(Color.red);           //setColor() method of Graphics class to fill color in a Rectangle.
	      g.fillRect( 300,150, 200, 100 ); //fillRect() method of Graphics class to fill color in a Rectangle.

	   }

}
