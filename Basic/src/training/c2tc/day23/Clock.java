package training.c2tc.day23;

import java.awt.*;
import java.applet.*;
import java.applet.*;
import java.awt.*;
import java.util.*;

public class Clock extends Applet implements Runnable //used Runnable interface
{

		Thread t,t1;           // Using Thread
	   public void start()
	   {
	      t = new Thread(this);
	      t.start();
	   }
	   public void run() 
	   { 
	      t1 = Thread.currentThread();
	      while(t1 == t) 
	      {
	         repaint();
	         try {
	            t1.sleep(2000);    
	      }
	         catch(InterruptedException e)
	         {
	        	 
	         }
	      }
	   }
	   public void paint(Graphics g) 
	   {
	      Calendar cal = new GregorianCalendar();
	      String hrs = String.valueOf(cal.get(Calendar.HOUR));
	      String mins = String.valueOf(cal.get(Calendar.MINUTE));
	      String secs= String.valueOf(cal.get(Calendar.SECOND));
	      g.drawString(hrs + ":" + mins + ":" + secs, 50, 70);
}
}
