package training.c2tc.day46;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class  ThreadClass extends Frame implements ActionListener,Runnable
{
     Button b1;
     TextField txt1, txt2;
     int cnt;
     Thread t1 = new Thread(this, "txt1");
     Thread t2 = new Thread(this, "txt12");
     public ThreadClass()
     {
    	  setLayout(new FlowLayout());         
          add(txt1 = new TextField(10));
          add(txt2 = new TextField(10));
          add(b1 = new Button("Start"));
          b1.addActionListener(this);
          cnt=0;
          addWindowListener(new WindowAdapter()
          {
               public void windowClosing(WindowEvent e)
               {
                    System.exit(0);
               }
          });
          setSize(400,400);
          setVisible(true);
     }
     public void actionPerformed(ActionEvent e)
     {
          String str;
          str=e.getActionCommand();
          if (str.equals("Start"))
          {
               t1.start();
               txt1.addFocusListener(null);
               t2.start();
               t2.run();
          }
          
     }
     public void run()
     {
          try
          {
               for (int i=1; i<=100;i++)
               {
                    txt1.setText(" "+i);
                    t1.sleep(100);
                    txt2.setText(" "+i);
                    t2.sleep(100);
               }
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
     public static void main(String[] args)
     {
          new ThreadClass();
     }
}
