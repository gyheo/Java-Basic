
public class Car {
	String name;
	int number;
	
	
	// Constructor Overloading
	public Car(){
		System.out.println("Car Constructor");
	}
	
	public Car(String name){
		this.name = name;
	}
	
	public Car(String name, int number){
		this.name = name;
		this.number = number;
	}
	
	public void run(){
		System.out.println("RUN!");
	}
}
