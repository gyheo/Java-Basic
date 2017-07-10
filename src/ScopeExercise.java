
public class ScopeExercise {
	int globalScope = 10;
	static int staticNum = 11;
	
	public void scopeExam(int value){
		int localScope = 20;
		
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public void scopeTest(int number){
	
		System.out.println(globalScope);
		// System.out.println(localScope);
		// System.out.println(value);
		System.out.println(number);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		
		System.out.println(staticNum);
		ScopeExercise v1 = new ScopeExercise();
		System.out.println(v1.globalScope);
		ScopeExercise v2 = new ScopeExercise();
		
		v1.globalScope = 10;
		v2.globalScope = 20;
		
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		
		v1.staticNum = 1000;
		v2.staticNum = -1000;
		
		System.out.println(v1.staticNum);
		System.out.println(v2.staticNum);
		
	}

}
