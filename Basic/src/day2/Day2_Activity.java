package day2;

class AreaOfGeoShapes    // Using Method Overloading 
{                         /*In this program we have 4 methods with same name Area(),
                            which means we are overloading Area() method. 
                            By having 4 different implementation of area method,
                            we are calculating the area of square, rectangle, circle, Triangle.
    */
    void Area(float x)    
    {
        System.out.println(" Area of the square is :"+Math.pow(x, 2));
    }
    void Area(float x, float y)
    {
        System.out.println("Area of the rectangle is  :"+x*y);
    }
    void Area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("Area of the circle is :"+z);
    }
    void Area(int x,int y)
    {
    	System.out.println("Area of the triangle is :"+(x*y)/2);
    }
}

public class Day2_Activity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfGeoShapes ob = new AreaOfGeoShapes();
		   ob.Area(5);
		   ob.Area(11,12);
		   ob.Area(2.5);
		   ob.Area(2,3);

	}

}
