package oop_citizen;

public class Citizen {
	private String id;
	private String name;
	private String gender;
	private String nation;
	private int year;

	public Citizen() {
		super();
		this.id = id;
		this.gender = gender;
		this.year = year;
		this.name = name;
		this.nation = nation;
	}
	
	@Override
	public String toString() {
		return "Citizen [id=" + id + ", name=" + name + ", gender= "+ gender +", nation=" + nation +", year="+ year + "]\n";
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return (int) year;
	}

	public void setYear(short year) {
		this.year = year;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
	
}
