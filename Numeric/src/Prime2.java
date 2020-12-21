import java.util.*;
public class Prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range");
		int r=s.nextInt();
		s.close();
		int temp=0;
		for(int i=1;i<=r;i++) {
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					temp=temp+1;
				}
			}
		
			if(temp==0) {
				System.out.println(i+"is a prime number");
			}
			else {
				temp=0;
				System.out.println(i+"is not a prime number");
				
			}

	}

}
}
