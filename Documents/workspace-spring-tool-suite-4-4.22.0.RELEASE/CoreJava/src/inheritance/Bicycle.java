package inheritance;
//Single inheritance by using this and super keywords
public class Bicycle {
	public int gear;
	public int speed;
public Bicycle(int gear, int speed) {
	this.gear=gear;
	this.speed=speed;
}
public void applyBreak(int decrement) {
	speed -= decrement;
}
public void speedup(int increment) { 
	speed += increment;
}
public String toString() {
	return ("No of gears are " +gear + "\n" +"Speed of bicycle is " + speed);
 }
}
class MountainBike extends Bicycle{
	public int seatheight;
	public char[] toString;
	public MountainBike(int gear, int speed, int startheight) {
		super(gear, speed);
		seatheight = startheight;
	}
	public void setheight (int newvalue) {
		seatheight = newvalue;
	}
	public String toString() {
		return (super.toString()+"\nSeatheight is: "+ seatheight);
	}
	public static void main(String[] args) {
		MountainBike mb = new MountainBike(3,100,25);
		System.out.println(mb.toString());
	}

}
