package ch09;

public class Ball extends Circle {

	private String color; //Ball클래스의 멤버변수
	
	public Ball(String color) { //매개변수 있는 생성자.
		this.color = color;
	}
	public Ball() {
		
	}
	
	public void findColor() {
		System.out.println(color + "공이다.");
	}
	
	public void findVolume() {
		System.out.println("부피구하기");
	}
	
}
