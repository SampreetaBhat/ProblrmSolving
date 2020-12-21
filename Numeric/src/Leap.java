import java.util.*;
public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the year");
		int y=s.nextInt();
		s.close();
		if(y%4==0 || y%100==0 || y%400==0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not a leap year");
		}
		


	}

}
