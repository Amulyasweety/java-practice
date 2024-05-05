package conditionalStatements;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a Year: ");
		int year = a.nextInt();
		if(year%4==0) {
			System.out.println(year+" is Leap Year");
		}else {
			System.out.println(year+" is not a Leap Year");
		}
	}

}
