package training.c2tc.day40;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ArrayDemoApplet1 extends Frame implements ActionListener {

	Button[][]b;
	private String letter = "";
    private int count = 0;

	public  ArrayDemoApplet1()
	{
		setLayout(new GridLayout(3,3));
		b= new Button[3][3];
		for(int i=0; i<b.length ; i++)
		{
			for(int j=0; j<b[i].length ; j++)
			{
				if(Math.random()<0.5)
					add(b[i][j]=new Button("X"));
				else
					add(b[i][j]=new Button("O"));
				b[i][j].addActionListener(this);
				
			}
		}
		addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent we )
			{
				System.exit(0);
			}
		});
		setSize(500,500);
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {

		new ArrayDemoApplet1();
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		count++;
		        if(count == 1 || count == 3 || count == 5 || count == 7 || count == 9){
		 
		        letter = "X";
		 
		        } else if(count == 2 || count == 4 || count == 6 || count == 8 || count == 10){
		 
		        letter = "O";
		 
		        }

		  Object o =e.getSource();
		  if(o instanceof Button)
		  {
			  Button b = (Button)o;
			  //((Button) o).setLabel("X");
//			  String c = ((Button)o).getLabel()
			  String c = ((Button)o).getLabel();
			  if(c.equals("X"))
				  ((Button)o).setLabel("O");
				  else
					  ((Button)o).setLabel("X");
		  }
		 
	}

}
