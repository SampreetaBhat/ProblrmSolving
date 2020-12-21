import java.util.*;
public class Count_Factors {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				count+=1;
			}
		}
		System.out.println("number of factors are" +count);
		s.close();

	}

}
