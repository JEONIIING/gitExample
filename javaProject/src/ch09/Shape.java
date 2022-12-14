package ch09;

public class Shape {
	//멤버변수
	private String name;

	public Shape() {
		super(); //최고조상 Object클래스의 기본생성자 호출
	}

	public Shape(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//일반메소드
	public double calculateArea() {
		return 0;
	}
	public void draw() {
		System.out.println("도형을 그립니다.");
	}
}
