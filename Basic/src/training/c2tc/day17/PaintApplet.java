package training.c2tc.day17;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class PaintApplet extends Applet
{
	  public void init ()
	    {
	        setBackground (Color.cyan);
	    }
	    public void paint (Graphics g)
	    {
	        g.drawString (" Applet window ", 10, 20);
	        showStatus ("This is shown in the status window.");
	    }
}
