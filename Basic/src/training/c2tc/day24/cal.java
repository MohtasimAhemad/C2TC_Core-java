package training.c2tc.day24;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cal extends Applet implements ActionListener
{

	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;

	String s1="",s2;

	Frame f;
	Panel p2;

	TextField t;
	int n1,n2;

	public void init()

	{

	setLayout(new BorderLayout());    

	t=new TextField();

	p2=new Panel();

	p2.setLayout(new GridLayout(4,4));

	b1=new Button("1");
	b1.addActionListener(this); 

	b2=new Button("2");  
	b2.addActionListener(this);

	b3=new Button("3");
	b3.addActionListener(this);

	b4=new Button("+"); 
	b4.addActionListener(this);

	b5=new Button("4"); 
	b5.addActionListener(this);

	b6=new Button("5"); 
	b6.addActionListener(this);

	b7=new Button("6"); 
	b7.addActionListener(this);

	b8=new Button("-");
	b8.addActionListener(this);

	b9=new Button("7"); 
	b9.addActionListener(this);

	b10=new Button("8");
	b10.addActionListener(this);

	b11=new Button("9"); 
	b11.addActionListener(this);

	b12=new Button("*");  
	b12.addActionListener(this);

	b13=new Button("c"); 
	b13.addActionListener(this);

	b14=new Button("0"); 
	b14.addActionListener(this);

	b15=new Button("/"); 
	b15.addActionListener(this);

	b16=new Button("=");  
	b16.addActionListener(this);

	add(t,"South");

	p2.add(b1);
	p2.add(b2);
	p2.add(b3);
	p2.add(b4);

	p2.add(b5);
	p2.add(b6);
	p2.add(b7);
	p2.add(b8);

	p2.add(b9);
	p2.add(b10);
	p2.add(b11);
	p2.add(b12);

	p2.add(b13);
	p2.add(b14);
	p2.add(b15);
	p2.add(b16);

	add(p2);

	}

	public void actionPerformed(ActionEvent e)

	{

	String str=e.getActionCommand();

	if(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/"))

	{
	String str1=t.getText();

	s2=str;

	n1=Integer.parseInt(str1);

	s1="";

	}

	else if(str.equals("="))

	{

	String str2=t.getText();

	n2=Integer.parseInt(str2);

	int sum=0;

	if(s2=="+")

	sum=n1+n2;

	else if(s2=="-")

	sum=n1-n2;

	else if(s2=="/")

	sum=n1/n2;
	
	else if(s2=="*")

	sum=n1*n2;
	

	String str1=String.valueOf(sum);

	t.setText(""+str1);

	s1="";

	}

	else if(str.equals("c"))

	{

	t.setText("");

	}

	else

	{

	s1= s1+str;

	t.setText(""+s1);

	}

	}

	}

