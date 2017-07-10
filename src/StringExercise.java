
public class StringExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Refer same constant
		String str1 = "hello";
		String str2 = "hello";
		
		// Make a new instance to heap area
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		if(str1 == str2)
			System.out.println("str1과 str2는 같은 영역");
		
		if(str1 == str3)
			System.out.println("str1과 str2는 같은 영역");
		
		if(str3 == str4)
			System.out.println("str1과 str2는 같은 영역");
		
		System.out.println(str1);
		System.out.println(str1.substring(3));
		System.out.println(str1);
	}
}
