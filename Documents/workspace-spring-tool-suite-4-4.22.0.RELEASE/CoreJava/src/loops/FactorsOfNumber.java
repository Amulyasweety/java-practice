package loops;

public class FactorsOfNumber {

	public static void main(String[] args) {
		int a = 36;
		System.out.println("The factors of "+a+" are ");
		for(int i=1; i<=a;i++) {
			if(a%i==0) {
				System.out.print(i+ " ");
			}
		}
	}

}
