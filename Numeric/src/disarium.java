import java.util.*;
public class disarium {
	static int pow(int r, int p) {
		int pp=1;
		while(p>0) {
			pp=pp*r;
			p--;
		}
		return pp;
	}
	static int Count_digit(int x) {
		int count=0;
		while(x!=0) {
			count++;
			x=x/10;
		}
		return count;
	}

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int temp=n,rem,sum=0,pos=0;
     pos=Count_digit(n);
     while(n!=0) {
    	 rem=n%10;
    	 sum=sum+pow(rem,pos);
    	 n=n/10;
    	 pos--;
     }
     if(sum==temp) {
    	 System.out.println("disarium number");
     }
     else
    	 System.out.println("not a disarium number");
     s.close();

	}

}
