import java.util.*;
public class Count_oddeve {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		int rem,even=0,odd=0;
		while(n!=0) {
			rem=n%10;
			if(rem%2==0) {
				even+=1;
				
			}
			else {
				odd+=1;
				
			}
			
			n=n/10;	
		}
		
		System.out.println(odd +" "+ even);
		

	}

}
