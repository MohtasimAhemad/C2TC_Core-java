package training.c2tc.day25;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Label;
import java.awt.TextField;

public class FiboApplet  extends Applet
{

	Label l1, l2;
	   TextField t1, t2;

	   public void init() /* initialize both labels and Textfields*/
		{
		l1 = new Label("Enter a number");
		t1 = new TextField(10);
		l2 = new Label("Fibonacci value is");
		t2 = new TextField(15);
		t2.setEditable(false);

		add( l1);
		add( t1);
		add (l2);
		add (t2);
	 	}

	   public boolean action(Event e, Object o)  //  get number  , compute and display its 	*/ 
	    {
		long number, fiboval;
		number = Long.parseLong( t1.getText());
		fiboval = fibonacci (number);
		t2.setText (Long.toString( fiboval ));
		return true;
	      }
	   
	  long fibonacci (long n) // fibonacci logic
	  {
		if ( n == 0 || n == 1)
			return n;
		else
			return (fibonacci(n-1) + fibonacci(n-2));
	  }
}
