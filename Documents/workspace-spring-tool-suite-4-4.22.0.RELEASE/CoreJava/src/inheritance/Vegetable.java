package inheritance;
// Multi-Level inheritance
public class Vegetable { //Class A
	void Brinjal() {
		System.out.println("Brinjal");
	}
	void Ladyfinger() {
		System.out.println("Lady's Finger");
	}
}
	class Roots extends Vegetable{  //Class B
		void Carrot() {
			System.out.println("carrot is raw food");
		}
	}
	class Raw extends Roots{  //Class C
	public static void Beetroot() {
			System.out.println("Beetroot is a raw food");
		}
	public static void main(String[] args) {
		Roots r = new Raw(); //Creating Object
		r.Brinjal();//Calling the method
		r.Carrot();
		Beetroot();
	}
}