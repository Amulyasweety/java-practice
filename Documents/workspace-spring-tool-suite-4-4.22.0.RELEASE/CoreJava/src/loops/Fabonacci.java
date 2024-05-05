package loops;

import java.util.Scanner;

public class Fabonacci {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1+ " " +n2);
		for(int i=2; i<=a; i++) {
			int n3 = n1+n2;
			System.out.print(" " +n3);
			n1=n2;
			n2=n3;
		}
	}
}
