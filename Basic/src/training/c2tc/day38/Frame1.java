package training.c2tc.day38;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Frame1 extends Frame {

	private Label lblname,lblpassword,lblname1,lblname2;
	private TextField txtname,txtname1,txtname2,txtpassword;
	private Button btnsave;
	
	Frame1()
	{
		lblname=new Label("First Name");
		lblname.setBounds(100, 200, 70, 20);
		
		txtname = new TextField();
		txtname.setBounds(200, 200, 70, 20);
		lblpassword = new Label("password");
		lblpassword.setBounds(100, 250, 70, 20);
		
		txtpassword = new TextField();
		txtpassword.setBounds(200, 250, 70, 20);
		
		btnsave = new Button("Submit");
		btnsave.setBounds(100, 300, 60, 20);
		add(lblname);
		add(txtname);
		add(lblpassword);
		add(txtpassword);
		add(btnsave);
		addWindowListener(new WindowAdapter()
		{
			
			public void windowClosing(WindowEvent we )
			{
				System.exit(0);
			}
		});
		setTitle("login form");
		setSize(600,600);
		setVisible(true);
		setLayout(null);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame1();
		
		
	}

}
