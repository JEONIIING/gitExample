package ch10;

//다형성
class Triangle extends Figure{
	@Override
	void draw() {
		System.out.println("삼각형 그리기...");
	}
}

class Rectangle extends Figure{
	@Override
	void draw() {
		System.out.println("사각형 그리기...");
	}
}

class Circle extends Figure{
	void draw() {
		System.out.println("원 그리기...");
	}
}


public class Figure {
	void draw() {
		System.out.println("도형그리기...");
	}
	
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.draw();
		
		Rectangle r = new Rectangle();
		r.draw();
		
		Circle c = new Circle();
		c.draw();
		
		System.out.println("==========다형성기법==========");
		//좌변은 부모 , 우변은 자식 =>다형성 기법
		Figure f = new Triangle(); //부모타입의 참조변수로 자식 객체를 다루는 것 
		f.draw();
		f=new Rectangle();
		f.draw();
		f=new Circle();
		f.draw();
	}

}
