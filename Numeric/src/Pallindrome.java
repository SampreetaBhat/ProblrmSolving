import java.util.*;
public class Pallindrome {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 int temp,rem,rev=0;
	 temp=n;
	 while(temp!=0) {
		 rem=temp%10;
		 rev=rev*10+rem;
		 temp=temp/10;
	 }
	 if(rev==n){
		 System.out.println("pallindrome");
	 }
	 else
		 System.out.println("not pallindrome");
	 s.close();

	}

}
