import java.util.ArrayList;
import java.util.List;

public class ListExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Kim");
		list.add("Choi");
		list.add("Kim");
		
		System.out.println(list.size());
		
		// List can have a overlap and order
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
	}

}
