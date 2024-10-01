package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		Map<String, Float> dssv = new HashMap<String, Float>();
		dssv.put("Bảo", 9.0f);
		dssv.put("Boi",3.0f);
		dssv.put("Bo", 5.99f);
		dssv.put("Ben", 8.0f);
		System.out.println(dssv);
		System.out.println(dssv.get("Bảo"));
		dssv.remove("Bảo");
		System.out.println(dssv);
		dssv.put("Baro de Mole", 9.99f);
		System.out.println(dssv);
	}
	
}