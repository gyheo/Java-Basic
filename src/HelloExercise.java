import java.lang.reflect.Method;

public class HelloExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloHello hello = new HelloHello();
		
		try {
			Method method = hello.getClass().getDeclaredMethod("hello");
			
			if(method.isAnnotationPresent(Count100.class)){
				for(int i = 0; i < 100; i++) {
					hello.hello();
				}
			} else {
				hello.hello();
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
