
public class InnerTest2 {
	static class Cal{
		int value = 0;
		public void plus(){
			value++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerTest2.Cal cal = new InnerTest2.Cal();
		cal.plus();
		System.out.println(cal.value);
	}

}
