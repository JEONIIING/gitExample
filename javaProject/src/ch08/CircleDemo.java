package ch08;

class Circle {
	double radius;
	String color;
	
	//생성자
	public Circle () { //생성자는 void를 붙이지 않는다. 멤버변수iv를 초기화 시키는 메서드.
		radius = 3.5;
		color = "빨강";
	}
	public Circle(double r, String c) {
		radius = r;
		color = c;
	}
	public Circle(double r) {
		radius = r;
		color = "파랑";
	}
	public Circle(String c) {
		radius = 21.0;
		color = c;
	}
	//출력용도
	public void print() {
		System.out.println("반지름 : " + radius);
		System.out.println("색상 : " + color);
		
	}
}

public class CircleDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle(10.0 , "빨강");
		c1.print();
	
		Circle c2 = new Circle(5.0);
		c2.print();
		
		Circle c3 = new Circle("노랑");
		c3.print();
		
		Circle c4 = new Circle();
		c4.print();
	}
	

}
