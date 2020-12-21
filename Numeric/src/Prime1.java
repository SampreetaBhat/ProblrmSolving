import java.util.*;
public class Prime1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0){
				temp+=1;
			}
			
		}
		if(temp==0) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not prime number");
		}
		s.close();

	}

}
