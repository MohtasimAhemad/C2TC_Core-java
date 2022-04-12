package training.c2tc.day36;
//0,1,n,public final variable
//0,1,n,public  abstract method
//0,1,n,public nested type
//0,1,n,public dufault method
// marker interface --> nothing inside this
//functional interface  -->only one abstract method

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public final class Applet06 extends Applet implements ActionListener  
{  
    Button b;  
    TextField t;  
    public void init()  
    {  
    	add(t=new TextField());  
        t.setBounds(70,85,350,50);  
        add(b=new Button("click me") );
        b.setBounds(70,110,70,60);  
        b.addActionListener(this);  
        setLayout(null);  
      }  
      public void actionPerformed(ActionEvent ae)  
      {  
        t.setText("welcome to JAVA World");  
      }    
}

