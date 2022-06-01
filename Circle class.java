 package test;

public class point {
static private double x;
static private double y;
point(){
x=0;
y=0;

}
point(float x,float y){
this.x=x;
this.y=y;

}
public void move(float dx ,float dy) {
x=x+dx;
y=y+dy;

}

public double Distance(point p1,point p2) {

return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x)
+ (p1.y-p2.y)*(p1.y-p2.y));
}

}

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
 
