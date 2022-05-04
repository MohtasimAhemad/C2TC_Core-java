package training.c2tc.day51;

import java.applet.Applet;
import java.awt.TextField;

public class AppletThreadWay2 extends Applet implements Runnable {
	TextField t1,t2;
	Thread th1,th2;
	int i,j;
	public void init()
	{
		add(t1 = new TextField(10));
        add(t2 = new TextField(10));
        th1=new Thread(this);
        th2=new Thread(this);
        th1.start();
        th2.start();
	}
	@Override
	public void run() {

		while(true)
		{
			Thread th = Thread.currentThread();
			if(th.equals(th1))
			{
				t1.setText(String.valueOf(i));
				try {
					th1.sleep(150);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(i==100)
					i=0;
				else
					i++;
				
			}
			if(th.equals(th2))
			{
				t2.setText(String.valueOf(j));
				try {
					th2.sleep(150);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(j==100)
					j=0;
				else
					j++;
			}
			
		}
	}
}
