package loops;

public class ReverseNumber {

	public static void main(String[] args) {
		int a = 123;
		int rev =0;
		while(a>0) {
		int n = a%10;
		 rev = n;
		 a = a/10;			
		 System.out.print(rev);
		}
	}

}
