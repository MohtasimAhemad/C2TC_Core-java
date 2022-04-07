package training.c2tc.day29;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class AppletCubeOfAnyNumber extends Applet implements ActionListener
{
	TextField num,out;
    Label l1;
    Button c;
    //Initialize 
    public void init()
    {
        
    	add(l1 = new Label("Enter a number :"));
		add(num=new TextField(15));
		add(c=new Button("Clear"));
		c.addActionListener(this);
		out = new TextField();
    }
    @Override
    //Function to display the square of the number
    public void actionPerformed(ActionEvent e)
    {
	double n = Double.valueOf(num.getText());
	double Cube=n*n*n;
	out.setText("Cube of "+n+" is "+Cube);
	this.add(out);

    }
}