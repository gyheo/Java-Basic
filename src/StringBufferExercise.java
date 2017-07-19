
public class StringBufferExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" ");
		sb.append("Computer");

		String str = sb.toString();
		
		System.out.println(str);
	
		StringBuffer sb2 = new StringBuffer();
		// Method Chaining
		StringBuffer sb3 = sb2.append("Hi");
		if(sb2 == sb3){
			System.out.println("sb2 == sb3");
		}
		
		String str2 = new StringBuffer().append("Hi").append(" ").append("Hello").append("!").toString();
		System.out.println(str2);
	}

}
