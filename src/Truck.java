
public class Truck extends Car {
	public Truck(){
		super("Hello");
		System.out.println("Basic Constructor");
	}
	
	public void bang(){
		System.out.println("bang!");
	}
	
	public void run(){
		super.run();
		System.out.println("truck is running!");
	}
}
