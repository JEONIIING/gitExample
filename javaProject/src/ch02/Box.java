package ch02;

public class Box {
	//문제1]사각형의 넓이, 둘레를 구하는 프로그램 작성
	public static void main(String[] args) {

		double width = 10.0; //세로
		double height = 5.0; //가로
		double area = width * height; //넓이
		double s = 2.0*(width + height); //둘레
		
		System.out.println("===================");
		System.out.println("사각형의 넓이 : " + area);
		System.out.println("사각형의 둘레 : " + s);
		System.out.println("===================");
		
		
	}

}
