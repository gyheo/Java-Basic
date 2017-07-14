
public class InnerTest {
	class Cal{
		int value = 0;
		public void plus(){
			value++;
		}
	}
	
	public static void main(String[] args){
		InnerTest t = new InnerTest();
		InnerTest.Cal cal = t.new Cal();
		
		cal.plus();
		System.out.println(cal.value);
	}
}
