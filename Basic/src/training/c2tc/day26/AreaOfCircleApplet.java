package training.c2tc.day26;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaOfCircleApplet extends Applet implements ActionListener
{

	TextField t1,t2;
    Button b1;
    Label l1;
    int r=0;

    public void init() {
        l1 = new Label("Enter radius of circle:");
        add(l1);
        t1 = new TextField(5);
        add(t1);
        b1 = new Button("Calculate Radius");
        add(b1);
    b1.addActionListener(this);
    }

  

public void actionPerformed(ActionEvent e)
{
	 float r = Float.parseFloat(t1.getText());
     float area = 0;

     if (e.getSource().equals(b1)) {
         area = (float) 3.14 * r * r;

         l1.setText(String.valueOf("Result :    " + area));
     }
}
}
