package training.c2tc.day36;
// u cant create object  focus adapter.abstract in nature 
import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public  class Applet6 extends Applet  {

	Button b1,b2;
	TextField t;
	public void init() //override
	{
		add(b1=new Button("Click"));
		add(t=new TextField(15));
		add(b2=new Button("Clear"));

		b1.addFocusListener(new  FocusAdapter() // Adapter class already have body
		{
			
			@Override
			public void focusGained(FocusEvent arg0) {
				t.setText("HeLLo World");
			}
		});
		
		b2.addFocusListener(new FocusListener()
		{
	public void focusGained(FocusEvent e) {
		t.setText("");
		
	}
	
	public void focusLost(FocusEvent e) {
		
		}
	});
	}
	}
/*
{
@Override
public void focusGained(FocusEvent arg0) {
	t.setText("HeLLo World");
}
@Override
public void focusLost(FocusEvent arg0) {
}
}
focus adapter giving already body

*/