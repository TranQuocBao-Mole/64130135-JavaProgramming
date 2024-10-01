package bai6_OOP_Interface;

public class App {
	public static void main(String[] args) {
		Cats a = new Cats("Meo den",false);
		Dogs b = new Dogs("alaska",true);
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		IAnimal a1 = new Cats("Meo trang",false);
		IAnimal b1 = new Dogs("husky",true);
		System.out.println(a1.toString());
		System.out.println(b1.toString());

	}
}
