package ch09;

public class ShapeMain {

	public static void main(String[] args) {
		CircleShape c = new CircleShape(5); //객체생성 겸 매개변수가 있는 생성자 호출
		TriangleShape t = new TriangleShape(4, 6);
		RectangleShape r = new RectangleShape(5, 8);
		
		System.out.println(c.getName());
		c.draw();
		System.out.println("원의 면적은 " + c.calculateArea() + "입니다.");
		System.out.println();
		
		System.out.println(t.getName());
		t.draw();
		System.out.println("삼각형의 면적은 " + t.calculateArea() + "입니다.");
		System.out.println();
		
		System.out.println(r.getName());
		r.draw();
		System.out.println("사각형의 면적은 " + r.calculateArea() + "입니다.");
	}

}
