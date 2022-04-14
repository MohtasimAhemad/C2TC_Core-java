package training.c2tc.day38;
class AA{
	
}


public class EQualsDemo {

	public static void main(String[] args) {
		
		AA a= new AA();
		AA a1=a;
		AA a2= new AA();
		if(a == a1) 
        {
            System.out.println(" equal");
        } else 
        {
            System.out.println(" Not equal");
        }   
 
        if(a == a2)
        {
            System.out.println(" equal");
        }else 
        {
            System.out.println(" not equal");
        }         
        if(a.equals(a1))
        {
        	System.out.println(" equal");
        } else 
        {
        	System.out.println(" Not equal");
        }   
        
        if(a.equals(a2))
        {
        	System.out.println(" equal");
        }else 
        {
        	System.out.println(" not equal");
        }    
        
         
	}

}
