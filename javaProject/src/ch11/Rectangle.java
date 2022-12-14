package ch11;

public class Rectangle extends Shape {

	@Override
	public void draw() { //추상메서드 구현 : {} 만 있어도 구현했다고 본다.
		System.out.println("사각형 그리기 시작 x 좌표값 : "+x);
		System.out.println("사각형 그리기 시작 y 좌표값 : "+y);
	}

}
