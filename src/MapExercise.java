import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("001", "Kim");
		map.put("002", "Heo");
		map.put("003", "Choi");
		
		map.put("001", "Kang");
		
		System.out.println(map.size());
		System.out.println(map.get("001"));
		
		Set<String> keys = map.keySet();

		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key + " " + value);
		}
	}

}
