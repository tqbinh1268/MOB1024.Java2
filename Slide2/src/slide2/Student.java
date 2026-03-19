package slide2;

public class Student {
	public String fullName;
	public Double marks;
	
	public Student(String fullName, Double marks) {
		super();
		this.fullName = fullName;
		this.marks = marks;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Double getMarks() {
		return marks;
	}
	public void setMarks(Double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [fullName=" + fullName + ", marks=" + marks + "]";
	}
//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		return this.fullName.compareTo(o.fullName);
//	}
	
	
}
