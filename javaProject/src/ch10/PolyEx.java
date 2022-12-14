package ch10;

//다형성
public class PolyEx {

	public static void main(String[] args) {
		int a = 10;
		double b =20.1;
		char c ='A';
		String d= "hello";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		System.out.println("=====================");
		//최상위 클래스 Object는 모든 타입을 다 다룰 수 있다.
		//만약 모든 코드를 Object로만 쓰면 프로그램이 무거워지며 속도 저하.
		//즉, 한개의 자료형타입으로 다양한 형태의 자료형을 처리할 수 있는 능력을 다형성이라 한다.
		Object o = "Java"; 
		//o=22.5;
		//o=10;
		System.out.println(o);
	
	}

}
