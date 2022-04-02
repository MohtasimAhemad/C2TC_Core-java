package training.c2tc.day26;

import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimeApplet extends Applet implements ActionListener
{
 Label lbl1;
 TextField txt1;
 Button btn1;
 public void init()
 {
  lbl1=new Label(" Enter any Number : ");

  btn1=new Button("Check");
  txt1=new TextField(20);
  
  setLayout(null);  
  lbl1.setBounds(100,100,120,20);
  add(lbl1);
  btn1.setBounds(100,120,40,20);
  add(btn1);
  txt1.setBounds(230,100,120,20);
  add(txt1);

  btn1.addActionListener(this);
 } 
 public void actionPerformed(ActionEvent a)
 {
  String num1=txt1.getText();
  int i;
  int k=0;
  int num;
  String str1="Prime number";
  String str2="Not Prime number";
  num=Integer.parseInt(num1);
  for(i=1;i<=num;i++)
  {
   if(num%i==0)
   {
    k++;
   }
  }
  if(a.getSource()==btn1)
  {
   if(k==2)
   {
	   txt1.setText(str1);
   } 
  
   else
   {
    txt1.setText(str2);
   }
  } 
 }
}