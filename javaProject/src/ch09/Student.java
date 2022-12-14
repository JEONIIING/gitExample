package ch09;

public class Student {
	private String name;
	private String num; //학번
	private String major; //전공
	private int year; //학년

	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	//생성자
	public Student() {
	
	}
	
	//메서드
	//상속관계의 클래스들에서는 생성자보다는 메서드를 활용하는 편이다.
	public void intput(String name, String num, String major, int year) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}
	
	
	
}
