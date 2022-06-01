public class Circle {
	private point center ;
	private double radius ;
	public Circle(double r,point c)
	{
		radius = r;
		center=c ;
	}
	public double perimeter()
	{
		return 2 * Math.PI * radius;
	}
	public double area()
	{
		return Math.PI * radius * radius;
	}
	public boolean concentric(Circle c1,Circle c2) {
		           if(c1.center==c2.center)
		        	   return true ;
		           else return false ;
		
	}
	public String toString() {
		return "Circle [radius=" + radius + ", center=" + center + "]";
	}
}
 
