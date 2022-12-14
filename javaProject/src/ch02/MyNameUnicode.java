package ch02;

public class MyNameUnicode {
	//문제3] 유니코드를 활용해서 내 이름 출력하기
	public static void main(String[] args) {

		char value1 = '\uC11C';
		char value2 = '\uC9C0';
		char value3 = '\uD604';
		
		
		System.out.println("=======================");
		System.out.println("서 지 현");
		System.out.println("char형('\\uC11C') : " + value1);
		System.out.println("char형('\\uC9C0') : " + value2);
		System.out.println("char형('\\uD604') : " + value3);
		System.out.println("=======================");
		
		
		
	}

}
