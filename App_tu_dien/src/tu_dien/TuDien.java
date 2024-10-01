package tu_dien;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TuDien {
	public static void main(String[] args) {
		Map<String,String> tudien = new HashMap<String, String>();
		tudien.put("Hello", "Xin Chào");
		tudien.put("Go", "Đi");
		tudien.put("Move", "Di Chuyển");
		tudien.put("Buy", "Mua");
		tudien.put("Good", "Tốt");
		tudien.put("Bad", "Tệ");
		tudien.put("Clear", "làm sạch");
		tudien.put("You", "Bạn");
		tudien.put("Love", "Yêu");
		tudien.put("I", "Tôi");
		Scanner s = new Scanner(System.in);
		String S = s.nextLine();
		System.out.println(tudien.get(S));
	}
}