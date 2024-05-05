package inheritance;
//Single Inheritance
public class Employee {
	float Salary = 40000;
}
	class Programmer extends Employee{
		int Bonus = 10000;
	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println("Programmer Salary: "+p.Salary);
		System.out.println("Bonus of the Programmer: "+p.Bonus);
	}

}
