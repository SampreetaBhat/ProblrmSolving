import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rem,sum=0;
		int temp=n;
		while(n!=0) {
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not an armstrong number");
		}
		s.close();

	}

}
