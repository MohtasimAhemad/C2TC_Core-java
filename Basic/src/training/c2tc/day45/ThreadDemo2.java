package training.c2tc.day45;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadDemo2 extends Frame implements ActionListener, Runnable {

	TextField tx1,tx2;
	int cnt;
    Thread t1 = new Thread(this, "tx1");
    Thread t2 = new Thread(this, "tx2");
	ThreadDemo2()
	{
		setLayout(new FlowLayout());
		add(tx1 = new TextField(15));
		add(tx2 = new TextField(15));
		tx1.addActionListener((ActionListener) this);
        tx2.addActionListener((ActionListener)this);
        cnt=0;

		addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent we )
			{
				System.exit(0);
			}
		});
		setSize(400,500);
		setVisible(true);
		

	}
	public void focusGained(FocusEvent e) {
		tx1.setText("");
		
	}
	 public void actionPerformed(ActionEvent a)
     {
          String str;
          str=a.getActionCommand();
          if (str.equals("Start"))
          {
               t1.start();
               t2.start();
              
          }
          
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ThreadDemo2();
	}
	
	public void run() {

		try
        {
             for (int i=1; i<=100;i++)
             {
                  tx1.setText(""+i);
                  t1.sleep(150);
                  tx2.setText(""+i);
                  t2.sleep(150);
             }
        }
        catch (Exception ex)
        {
             System.out.println(ex);
        }
	}

}
