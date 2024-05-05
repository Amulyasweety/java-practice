package interfaces;

public class Test {

	public static void main(String[] args) {
		Lenovo l = new Lenovo();
		l.copy();
		l.cut();
		l.paste();
		l.keyboard();
		Samsung s = new Samsung();
		s.copy();
		s.cut();
		s.paste();
		s.keyboard();
		s.printer();
		Laptop.securityCode();
	}

}
