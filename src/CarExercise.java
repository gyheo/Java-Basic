
public class CarExercise {
	public static void main(String[] args){
		// Mulitple instance
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car("경찰차");
		Car c4 = new Car("구급차", 4444);
		Truck t1 = new Truck();
		
		c1.name = "승용차";
		c1.number = 1111;
		
		c2.name = "버스";
		c2.number = 2222;
		
		System.out.println(c1.name);
		System.out.println(c1.number);
	
		System.out.println(c2.name);
		System.out.println(c2.number);
		
		System.out.println(c3.name);

		System.out.println(c4.name);
		System.out.println(c4.number);
		
		t1.run();
		t1.bang();
		
//		c1.bang();
	}
}
