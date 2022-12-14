package ch02;

public class MyVar {
	//문제 2]
	
	public static void main(String[] args) {
		int a = 30;
		int b = 50;
		
		System.out.println("===================");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("a + b = " + sum(a,b));
		System.out.println("===================");
	}

	static int sum(int x, int y) {
		return x + y;
	}
}
