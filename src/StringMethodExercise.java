
public class StringMethodExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String str = new String("Hello");
		String str = "Hello";
		
		System.out.println(str.length());
		System.out.println(str.concat(" Hi"));
		System.out.println(str);
		
		str = str.concat(" Hi");
		System.out.println(str);

		System.out.println(str.substring(3));
		System.out.println(str.substring(2, 7));
	}
}
