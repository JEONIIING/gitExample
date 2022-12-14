package ch12;

public class StaticOuter2 {
	static int data = 30; //cv
	int data2 = 50; //iv
	static class StaticInner2{ //정적중첩클래스 
		void mst() {
			System.out.println("data is "+ data);
//			System.out.println("data2 is "+ data2); //iv 멤버는 사용 불가능
			//static 내부클래스 안에서 iv사용 불가
		}
	}
	public static void main(String[] args) {
		StaticOuter2.StaticInner2 in = new StaticOuter2.StaticInner2(); //내부static클래스 생성
		in.mst();
		
		StaticOuter2 out = new StaticOuter2();
		System.out.println(out.data2);
	}
	
}
