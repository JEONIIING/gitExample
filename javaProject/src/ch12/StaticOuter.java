package ch12;

//정적중첩클래스 (내부static 중첩class)
//StaticOuter.Inner si = new StaticOuter.Inner();

public class StaticOuter {
	static int x = 10;
	static class Inner{ //static inner class
		int getX() {
			return x;
		}
	}
	
	public static void main(String[] args) {
		//new 외부클래스.내부클래스생성자
		StaticOuter.Inner in = new StaticOuter.Inner(); //내부 static 클래스생성 
		System.out.println(in.getX());
	}
}
