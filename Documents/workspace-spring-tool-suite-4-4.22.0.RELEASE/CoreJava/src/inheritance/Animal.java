package inheritance;
//Single inheritance
public class Animal {
	String name; //field and methods of the parent class
	public void eat() {
		System.out.println("I can eat");
	}
}
class Dog extends Animal{
	public void display() { //new method in subclass
		System.out.println("My name is " +name);
	}
	public void sound() {
		System.out.println("Dog can Bark");
	}
	public static void main(String[] args) {
		Dog d = new Dog(); //create object
		d.name = "Lassi";
		d.display();
		d.eat();
		d.sound();
	}

}
