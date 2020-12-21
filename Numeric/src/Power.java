import java.util.*;
public class Power {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int p=s.nextInt();
		int pow=1;
		while(p>0) {
			pow=pow*n;
			p--;
		}
		System.out.println(pow);
		s.close();
	}

}
