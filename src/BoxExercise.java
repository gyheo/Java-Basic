
public class BoxExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Box box = new Box();
//		box.setObj(new Object());
//		Object obj = box.getObj();
//		
//		box.setObj("Hello");
//		System.out.println(box.getObj().toString());
//		String str = (String)box.getObj();
//		System.out.println(str);
//		
//		box.setObj(10);
//		int value = (int)box.getObj();
//		System.out.println(value);
		
		Box<Object> box = new Box<>();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box<String> box2 = new Box<>();
		box2.setObj("Hello");
		String str = box2.getObj();
		
		Box<Integer> box3 = new Box<>();
		box3.setObj(100);
		int value = box3.getObj();
	}

}
