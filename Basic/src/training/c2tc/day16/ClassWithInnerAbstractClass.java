package training.c2tc.day16;

class BBB  // non abstract method
{  
    abstract class CCC    //abstract method
    {  
        abstract void print();  
    }  
  
class ZZZ extends CCC  
{  
  
    @Override  
    void print() {  
          
        System.out.println("inner abstract class is invoked");  
    }     
}  
}


public class ClassWithInnerAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BBB obj=new BBB();        //
	    BBB.CCC c=obj.new ZZZ();  
	    c.print();

	}

}
