package training.c2tc.day22;

import java.applet.Applet;
import java.awt.Graphics;

public class Shapes extends Applet 
{
	int x = 300, y = 100, r = 50;
	   public void paint(Graphics g) {
	      g.drawLine(30,300,200,10); //darwLine of Graphics class
	      g.drawOval(x-r,y-r,100,100);//darwOval of Graphics class
	      g.drawRect(400,50,200,100);//darwRect of Graphics class
	   }

}
