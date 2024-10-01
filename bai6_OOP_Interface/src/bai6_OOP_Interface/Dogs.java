package bai6_OOP_Interface;

public class Dogs implements IAnimal {

	private String category;
	private boolean gender;
	@Override
	public void keu() {
		System.out.println("Gâu Gâu");
		
	}
	
	public Dogs() {
		super();
	}

	public Dogs(String category, boolean gender) {
		super();
		this.category = category;
		this.gender = gender;
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
		return "Dog [category=" + category + ", gender=" + gender + "]";
	}
	
}
