import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new HashSet<>();
		boolean flag1 = set1.add("bus");
		boolean flag2 = set1.add("taxi");
		boolean flag3 = set1.add("bus");
		
		System.out.println(set1.size());
		
		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);
		
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
	}

}
