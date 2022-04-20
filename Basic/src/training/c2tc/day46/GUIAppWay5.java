package training.c2tc.day46;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import training.c2tc.day46.GUIAppWay3.ZA;



public class GUIAppWay5 extends Frame {
	Button b1,b2;
	static TextField t;
	public GUIAppWay5()
	{
		setLayout(new FlowLayout());
		add(b1=new Button("Click"));
		add(t=new TextField(15));
		add(b2=new Button("Clear"));
		b1.addActionListener(new ABA());
		
		b2.addActionListener(new ABB());
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new GUIAppWay5();
	}

}
class ABA implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent arg0) {

		GUIAppWay5.t.setText("Hello World");
		
	}
	
}
class ABB implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		GUIAppWay5.t.setText(" ");

	}
	
}