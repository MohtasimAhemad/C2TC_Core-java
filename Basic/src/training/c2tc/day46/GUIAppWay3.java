package training.c2tc.day46;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUIAppWay3 extends Frame implements ActionListener{
	Button b1,b2;
	TextField t;
	public GUIAppWay3()
	{
		setLayout(new FlowLayout());
		add(b1=new Button("Click"));
		add(t=new TextField(15));
		add(b2=new Button("Clear"));
		b1.addActionListener(this);
		b2.addActionListener(new ZA());
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

	

	@Override
	public void actionPerformed(ActionEvent e) {

		t.setText("Hello World");
	}


class ZA implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		t.setText(" ");
	}
	
}
public static void main(String[] args) {
	// TODO Auto-generated method stub

	new GUIAppWay3();
}
}