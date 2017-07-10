
public class NewClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewClass nc1 = new NewClass();
		nc1.method1();
		nc1.method2(10);
		String m3Str = nc1.method3("Hello");
		
		nc1.method4(10, 20);
		
		int m5Num = nc1.method5(100);
		System.out.println(m5Num);
	}

}
