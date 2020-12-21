import java.util.*;
public class Square_Root {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double temp;
		System.out.println("enter the number");
		double n=s.nextDouble();
		s.close();
		double sr=n/2;
		do {
			temp=sr;
			sr=(temp+(n/temp))/2;
			
		}while((temp-sr)!=0);
		System.out.println("square root of a number is:"+sr);
		

	}

}
