package training.c2tc.day38;

class BB{
	int i;
	String name;
	public BB(int i,String name)
	{
		this.i=i;
		this.name=name;
	}
}
public class EQualDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BB b= new BB(1,"mohtasim");
		BB b1=b;
		BB b2= new BB(1,"mohtasim");
		if(b == b1) 
        {
            System.out.println(" equal");
        } else 
        {
            System.out.println(" Not equal");
        }   
 
        if(b == b2)
        {
            System.out.println(" equal");
        }else 
        {
            System.out.println(" not equal");
        }       
        if(b.equals(b1))
        {
        	System.out.println(" equal");
        } else 
        {
        	System.out.println(" Not equal");
        }   
        
        if(b.equals(b2))
        {
        	System.out.println(" equal");
        }else 
        {
        	System.out.println(" not equal");
        }      
	}
}


