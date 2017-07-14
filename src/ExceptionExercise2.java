
public class ExceptionExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 0;
		int k;
		try{
			k = divide(i, j);
		}catch(ArithmeticException e){
			System.out.println(e.toString());
		}
	}
	
	// handle the error where error occured
	public static int divide(int i, int j) throws ArithmeticException{
		return i / j;
	}
}
