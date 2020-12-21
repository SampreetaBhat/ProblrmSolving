import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int range=s.nextInt();
        int t0=0,t1=1,t2;
        System.out.print(t0+" "+t1);
        for(int i=2;i<=range;i++) {
        	t2=t0+t1;
        	System.out.print(" "+t2);
        	t0=t1;
        	t1=t2;
        }
        s.close();

	}

}
