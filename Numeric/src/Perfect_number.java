import java.util.*;
public class Perfect_number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int  sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("not a perfect number");
		}
		s.close();

	}

}
