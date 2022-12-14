package ch02;

import java.util.Scanner;

public class RectangleTest {
	//문제4] 직사각형의 가로, 세로값으로 넓이를 구하는 프로그램 작성 (Scanner사용)
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		System.out.print("직사각형의 가로 길이를 입력하세요. : ");
		int w = sc.nextInt();
		System.out.print("직사각형의 세로 길이를 입력하세요. : ");
		int h = sc.nextInt();
		System.out.println("직사각형의 넓이는 " + (float)(w*h) + " 입니다.");
		System.out.println("================================");
		sc.close();
		
		
		
		
		
	}

}
