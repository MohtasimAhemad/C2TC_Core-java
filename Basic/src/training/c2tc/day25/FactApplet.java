package training.c2tc.day25;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactApplet extends Applet  implements ActionListener //ActionListener interface is to perform action with the help of method actionPerformed() 
{

	TextField number,factorial;

	Button calulate;

	public void init(){

	Label numberp = new Label("Input Number: ");

	Label factorialp = new Label("Factorial: ");

	number= new TextField(10);

	factorial = new TextField(15);

	calulate = new Button("calulate");

	add(numberp);

	add(number);

	add(factorialp);

	add(factorial);

	add(calulate);
	calulate.addActionListener(this);
	
	}
	public void actionPerformed(ActionEvent e){

		String snumber;

		snumber = number.getText();

		int inumber = Integer.parseInt(snumber);

		factorial.setText(((Double)getFactorial(inumber)).toString());

		    }

		double getFactorial(int n)

	  {

		double fact = 1;

		for(int i=1;i<=n;i++)

		fact = fact * i;

		return fact;

	 }
		
}
