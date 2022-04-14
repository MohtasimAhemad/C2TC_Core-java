package training.c2tc.day38;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class RegFormInFrame extends Frame
{
	
	public RegFormInFrame()
	{
		Label fName = new Label("First Name");  
		fName.setBounds(30, 50, 80, 20);  
		  
		Label lName = new Label("Last Name");  
		lName.setBounds(30, 80, 80, 20);  
		  
		Label email = new Label("Email");  
		email.setBounds(30, 110, 80, 20);
		
		Label mobile = new Label("Mobile");  
		mobile.setBounds(30, 110, 80, 20);
		
		Label addr = new Label("Address");  
		addr.setBounds(30, 110, 80, 20);  
		
		Label dob = new Label("Date of Birth");  
		dob.setBounds(30, 110, 80, 20);  
		
		TextField fName1 = new TextField();  
		fName1.setBounds(120, 50, 100, 20);  
		  
		TextField lName1 = new TextField();  
		lName1.setBounds(120, 80, 100, 20);  
		
		TextField email1 = new TextField();  
		email1.setBounds(120, 80, 100, 20);
		  
		TextField mobile1 = new TextField();  
		mobile1.setBounds(120, 80, 100, 20);
		
		TextField addr1 = new TextField();  
		addr1.setBounds(120, 80, 100, 20);
		
		
		TextField dob1 = new TextField();  
		dob1.setBounds(120, 110, 100, 20);  
		  
		
		Button submit = new Button("Submit");  
		submit.setBounds(20, 160, 100, 30);  
		  
		Button reset = new Button("Reset");  
		reset.setBounds(120,160,100,30); 
		
		add(fName);  
		add(fName1);  
		add(lName); 
		add(lName1); 
		add(dob); 
		add(dob1);  
		add(email);
		add(email1);
		add(mobile);
		add(mobile1);
		add(addr);
		add(addr1);
		
		add(submit);  
		add(reset);  
		  
		
		setSize(600,600);  
		setLayout(null);  
		setVisible(true);
		
		addWindowListener(new WindowAdapter()
		{
			
			public void windowClosing(WindowEvent we )
			{
				System.exit(0);
			}
		});
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new RegFormInFrame();
	}

}
