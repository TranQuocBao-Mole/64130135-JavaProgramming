package oop_citizen;

public class App {
	public static void main(String[] args) {
		Citizen c1 = new Citizen();
		c1.setId("001");
		c1.setYear((short)2004);
		c1.setName("Trần Quốc Bảo");
		c1.setGender("Male");
		c1.setNation("VietNam");
		System.out.println(c1.toString());
		
	}

}
