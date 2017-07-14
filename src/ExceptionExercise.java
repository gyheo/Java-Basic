
public class ExceptionExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 0;
		try{
			int k = i / j;
			System.out.println(i / j);
		}catch(ArithmeticException e){
			System.out.println("Cannot divide by 0 " + e.toString());
		}finally{
			System.out.println("Must Execute");
		}
		
		System.out.println("Main End");
	
	}

}
