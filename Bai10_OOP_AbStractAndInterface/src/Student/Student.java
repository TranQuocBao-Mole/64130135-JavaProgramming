package Student;

public class Student implements IStudent{
	private String fullName;
	private int id;
	private String Class1;
	private int semester;
	private float AverageMark;
	public int[] MarkList = {1,2,3,4,5};
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClass1() {
		return Class1;
	}
	public void setClass(String class1) {
		Class1 = class1;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public float getAverageMark() {
		return AverageMark;
	}
	public void aveCal() {
		this.AverageMark = (float)(MarkList[0]+MarkList[1]+MarkList[2]
				+MarkList[3]+MarkList[4])/3.0f;
	}
	@Override
	public void display() {
		System.out.println("FullName: "+this.getFullName()+"\nID: "
				+ this.getId() +"\nClass: "+this.getClass1()
				+"\nSemester: "+this.getSemester()
				+"\nAverageMark: "+ this.getAverageMark());
		
	}
	
}