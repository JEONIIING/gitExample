package ch06;

public class OverloadEx1 {
	public static void main(String[] args) {
		print(10.5);
		print("hello");
		print(100);
		print("Hi","Java");
	}
	//오버로딩
	public static void print(double a) {
		System.out.println(a);
	}
	public static void print(String b) {
		System.out.println(b);
	}

	public static void print(int c) {
		System.out.println(c);
	}
	
//	public static String print(int c) { //리턴타입과 오버로딩은 무관하다.
//		System.out.println(c);
//	}
	
	public static void print(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}


	
	
	
}
