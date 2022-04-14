package training.c2tc.day38;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



	public class FrameCheckBox extends Frame{
		Checkbox cb_sing,cb_dance,cb_read;
		
		FrameCheckBox()
		{
			cb_sing = new Checkbox("singing");
			cb_dance = new Checkbox("dance");
			cb_read = new Checkbox("read");
			cb_sing.setBounds(100, 100,  50, 50);
			cb_dance.setBounds(100, 150,  50, 50);
			cb_read.setBounds(100, 200,  50, 50);
			
			add(cb_sing);
			add(cb_read);
			add(cb_dance);
			addWindowListener(new WindowAdapter()
			{
				
				public void windowClosing(WindowEvent we )
				{
					System.exit(0);
				}
			});
			setSize(400,400);
			setVisible(true);
			setTitle("checkbox demo");
			
		}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				new FrameCheckBox();
				
			}

		}

