package interfaces;

public class Hp implements Laptop {

	public static void main(String[] args) {

	}

	@Override
	public void copy() {
		System.out.println("copy code");
	}

	@Override
	public void paste() {
		System.out.println("paste code");
	}

	@Override
	public void cut() {
		System.out.println("cut code");
	}

	@Override
	public void keyboard() {
		System.out.println("keyboard code");
	}

}
