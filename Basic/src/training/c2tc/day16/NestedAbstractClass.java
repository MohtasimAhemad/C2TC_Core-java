package training.c2tc.day16;

abstract class D1  
{  
    abstract class C1   
    {  
        abstract void display();  
    }  
}  
class M2m extends D1  
{  
    class S1 extends C1 
    {  
    @Override  
    void display() 
    {  
          
        System.out.println("nested abstract class is invoked");  
    }     
}  
}  

public class NestedAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 D1 obj=new M2m();  
	     M2m m=(M2m)obj;  
	     M2m.S1 s=m.new S1();  
	     s.display();  

	}

}
