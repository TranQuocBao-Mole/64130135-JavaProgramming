package bai6_OOP_Interface;

public class Cats implements IAnimal {

	private String category;
	private boolean gender;
	public void keu() {
		System.out.println("mèo méo meo mèo meo");
	}
	public Cats(String category, boolean gender) {
		super();
		this.category = category;
		this.gender = gender;
	}
	public Cats() {
		super();
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Cat [category=" + category + ", gender=" + gender + "]";
	}
}
