package assignment;

public class Integers {
	 int a = 25;
	 int b = 5;
	 int Sum = a+b;
	 int Diff = a-b;
	 int Product = a*b;
	 int Averg = (a+b/2);
	 int Distance = a-b;

	public static void main(String[] args) {
		
		int x = 25;
		int y = 5;
		Integers d = new Integers();
		System.out.println(d.Sum);
		System.out.println(d.Diff);
		System.out.println(d.Product);
		System.out.println(d.Averg);
		System.out.println(d.Distance);
		
		if(x>y){
			System.out.println(x+ " is Greater");
		}if(x<y) {
			System.out.println(y+ " is Smaller");
		}
		
	}

}
