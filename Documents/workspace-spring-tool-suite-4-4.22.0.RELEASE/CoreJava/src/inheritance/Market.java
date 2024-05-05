package inheritance;
// Hierarchy inheritance
public class Market {  //Class A
	void Dryfruits() {
		System.out.println("Badam..Kajju..KissMiss..Dates");
	}
	void vegetables() {
		System.out.println("Vegtables & Leafy Vegetables");
	}
}
	class NonVeg extends Market{ //Class B from A
		void Chiken() {
			System.out.println("Chiken Lover");
		}
		void Mutton() {
			System.out.println("Mutton Lover");
		}
	}
	class Meat extends Market{  //Class C from A
		void fish() {
			System.out.println("Fish Lover");
		}
	public static void main(String[] args) {
		Market m = new Meat();
		m.Dryfruits();
	}

}
