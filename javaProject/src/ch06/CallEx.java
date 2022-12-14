package ch06;

public class CallEx {

	public static void main(String[] args) {
		System.out.println("시작");
		int a=10;
		test(a); //a는 call by value형식으로 호출, 메서드 호출
		
		test2(a); 
		System.out.println("끝");
	}//프로그램 끝
	//매개변수 개수와 타입이 중요, 메서드의 위치는 상관없음.
	public static void test2(int c) {
		System.out.println(c);
		
	}
	//void는 리턴받을게 없을때 (리턴할 자료타입이 없을때)
	public static void test(int b) {
		System.out.println("test method 호출");
		System.out.println(b);
	}

}
