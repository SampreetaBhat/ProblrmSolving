import java.util.*;
public class Sum_digit {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int rem,sum=0;
     while(n!=0) {
    	 rem=n%10;
    	 sum=sum+rem;
    	 n=n/10;
     }
     System.out.println(sum);
     s.close();
	}

}
