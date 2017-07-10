
public class NewClass {
	public void method1(){
		System.out.println("method1");
	}
	
	public void method2(int num1){
		System.out.println("method2 with " + num1);
	}

	public String method3(String str){
		System.out.println("method3");
		
		return "Method";
	}
	
	public void method4(int num1, int num2){
		System.out.println("method4");
		
		System.out.println("num1, num2 " + num1 + " "+ num2);
	}
	
	public int method5(int num1){
		System.out.println("method5");
		
		return num1 * num1;
	}
}
