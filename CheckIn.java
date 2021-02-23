import java.util.Scanner;

public class CheckIn {

	public static void main(String[] args) {
		int h, m, s;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Check in time in H,M, S order:  ");
		h = in.nextInt();		
		m = in.nextInt();
		s = in.nextInt();
		
		CheckTime ctime = new CheckTime(h,m,s);	
		
		CheckTime noonTime = new CheckTime(12,00,00);
		CheckTime afterNoon = new CheckTime(18,00,00);
		
		if(ctime.LessThan(noonTime)) {
			System.out.println("Good Morning!");
		} else if(ctime.Greater(noonTime)) {
			System.out.println("Good AfterNoon");
		} else if(ctime.Greater(afterNoon)) {
			System.out.println("Good Evening ");
		}
		
		
		
		

	}

}
