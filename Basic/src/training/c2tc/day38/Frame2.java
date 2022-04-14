package training.c2tc.day38;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//extending Frame class to our class AWTExample1  
public class Frame2 extends Frame {    

//initializing using constructor  
	Frame2() {  

 // creating a button   
 Button b = new Button("Click Me!!");  

 // setting button position on screen  
 b.setBounds(30,100,80,30);  

 // adding button into frame    
 add(b);  
 addWindowListener(new WindowAdapter()
	{
		
		public void windowClosing(WindowEvent we )
		{
			System.exit(0);
		}
	});

 // frame size 300 width and 300 height    
 setSize(300,300);  

 // setting the title of Frame  
 setTitle("This is our basic AWT example");   
     
 // no layout manager   
 setLayout(null);   

 // now frame will be visible, by default it is not visible    
 setVisible(true);  
 
}    

//main method  
public static void main(String args[]) {   

	new Frame2();    

}  

}    