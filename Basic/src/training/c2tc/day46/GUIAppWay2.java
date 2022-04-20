package training.c2tc.day46;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUIAppWay2 extends Frame implements ActionListener{
	Button b1,b2;
	TextField t;
	public GUIAppWay2()
	{
		setLayout(new FlowLayout());
		add(b1=new Button("Click"));
		add(t=new TextField(15));
		add(b2=new Button("Clear"));
		b1.addActionListener(this);
		b2.addActionListener(this);
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(b1))
			t.setText("Hello World");
		if(o.equals(b2))
			t.setText("");
	}

	public static void main(String[] args) {

		new GUIAppWay2();
		
	}

	
	

}
