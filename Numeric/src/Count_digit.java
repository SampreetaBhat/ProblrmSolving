import java.util.*;
public class Count_digit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    int number=s.nextInt();
	    int digit=0;
	    while(number!=0) {
	    	digit+=1;
	    	number=number/10;
	    }
	    System.out.println(digit);
	    s.close();

	}

}
