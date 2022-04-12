package training.c2tc.day37;

import java.applet.Applet;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

public class MouseMotionListener1 extends Applet 
{
    int x,y;
    public void init()
{
            setLayout(new GridLayout(5,2));
            x=0;
            y=0;
            
            addMouseMotionListener(new MouseMotionAdapter()
            {
        		public void mouseDragged(MouseEvent me)
        		{
        			x=me.getX();
                    y=me.getY();
                    repaint();
        		}
        		
        	});
            }
        

}
