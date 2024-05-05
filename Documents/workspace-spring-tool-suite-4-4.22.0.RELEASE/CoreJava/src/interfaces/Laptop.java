package interfaces;

public interface Laptop {
	public void copy();
	public void paste();
	public void cut();
	public void keyboard();
	
	default void printer() {
		System.out.println("Printer code");
	}
	static void securityCode() {
		System.out.println("Common Security code");
	}
}
