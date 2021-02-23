
public class circle {
private int x;
private int y;
private double radius;

	circle(){
		x = 0;
		y = 0;
		radius = 1;
		
	}
	circle(int a , int b, double c){
		x = a;
		y = b;
		c = radius;
	}
	
	circle(double r) {
		radius = r;
	}

	public void setX(int xval) {x = xval;}
	public void setY(int yval) { y= yval;}
	public void setR(double rval) { radius = rval;}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public double getR() {
		return radius;
	}
	public String toString() {
		return "center: ("+ x + y +")\n"+"radius:" +radius;
	}
	public void move(int a, int b) {
		x =+a;
		y =+b;
	}
	public boolean isEqualTo(circle c) {
		if(radius == c.radius && x == c.x && y == c.y) {
			return true;
		}else {
			return false;
		}
	}
	public double area() {
		return Math.pow(radius, 2) *Math.PI;
	}
}
