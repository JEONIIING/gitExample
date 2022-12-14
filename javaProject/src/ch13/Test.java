package ch13;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		System.out.println(Math.ceil(10.1)); //올림
		System.out.println(Math.round(10.5));//반올림
		System.out.println(Math.floor(10.9));//버림
		System.out.println(Math.pow(10, 3)); //지수
		System.out.println(Math.pow(2, 3));
		Random r = new Random();
		System.out.println("정수값 : " + r.nextInt(100)); //100이하의 랜덤정수 발생
		System.out.println("실수값 : " + r.nextDouble()); //1이하의 랜덤실수 발생
		
		int a = 10; //기본자료형
		
		Integer b = 20; //객체자료형(Wrapper클래스: 기본자료형으로 쓸 수 있다.), 옛버전에서는 에러, intValue()가 작동
		Integer c = new Integer(30); //정식 문법
		System.out.println(a);
		System.out.println(b);
		System.out.println(c.intValue());
		
		
	}

}
