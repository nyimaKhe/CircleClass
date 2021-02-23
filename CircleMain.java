import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c1 = new circle();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter x and y for circle: ");
		c1.setX(scan.nextInt());
		c1.setY(scan.nextInt());
		
		int cr1x = c1.getX();
		int cr1y = c1.getY();
		
		circle c2 = new circle();
		System.out.println("Enter x and y for circle: ");
		c2.setX(scan.nextInt());
		c2.setY(scan.nextInt());
		
		int cir2x = c2.getX();
		int cir2y = c2.getY();
		if(c1.isEqualTo(c2)) {
			System.out.println("Both circles are identical");
		} else {
			System.out.println("they are not equal");
		}
		
		c1.move(cir2x, cir2y);
		c2.move(cr1x, cr1y);
		
		
	}

}
