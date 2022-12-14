package ch09;

public class CircleShape extends Shape {
	private int radius;

	//getter, setter
	public int getRedius() {
		return radius;
	}

	public void setRedius(int radius) {
		this.radius = radius;
	}
	
	//매개변수가 있는 생성자
	public CircleShape(int redius) {
		super("Circle"); //부모생성자(매개변수가 있는) 호출
		this.radius = redius;
	}
	
	//부모클래스의 멤버메서드 오버라이딩
	@Override
	public double calculateArea() {
		return radius * radius* Math.PI;
	}
	
	@Override
	public void draw() {
		System.out.print("반지름이 " + radius + "인 원");
		super.draw(); //부모클래스 draw() 호출
	}
}
