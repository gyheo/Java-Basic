
public class ExceptionExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 0;
		int k;
		try{
			k = divide(i, j);
			System.out.println(k);
		}catch(IllegalArgumentException e){
			System.out.println(e.toString());
		}
	}
	
	// handle the error where error occured
	public static int divide(int i, int j) throws IllegalArgumentException{
		if(j == 0){
//			System.out.println("Zero Nope");
//			return 0;
			
			throw new IllegalArgumentException("Zero Nope!");
		}
		
		return i / j;
	}
}
