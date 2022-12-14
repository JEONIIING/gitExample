package ch12;

public class OuterClass {
	private static int x = 10;
	class Inner {
		int getX() {
			return x; //외부클래스의 private변수를 마음대로 사용가능
		}
	}
	
	public static void main(String[] args) {
		System.out.println(x); //OuterClass클래스의 cv 변수 x 를 불러옴
		OuterClass e =new OuterClass();
		OuterClass.Inner in = e.new Inner();
		System.out.println(in.getX());
	}
}
