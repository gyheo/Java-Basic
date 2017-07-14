
public class CalculationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculation();
		calc.plus(5, 5);
		int result = calc.exec(10, 20);
		System.out.println(result);
		
		System.out.println(Calculator.exec2(10, 40));
	}

}
