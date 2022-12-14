package ch12;

public class LocalOuter2 {
	private int data = 20;
	void disaplay() { //LocalOuter2의 멤버메서드
		class LocalInner2{ //지역내부클래스
			int value = 50;
			void msg() {
				System.out.println(value);
				System.out.println(data);
			}
		}//end inner class
		LocalInner2 li = new LocalInner2();//3)지역내부클래스 객체생성
		li.msg(); //내부클래스 객체가 가리키고 있는 메서드 호출 
		
		
	}//end method
	public static void main(String[] args) {
	LocalOuter2 lo = new LocalOuter2(); //1)외부객체 생성
	lo.disaplay(); //2)객체가 가리키고있는 메서드 호출
	}
}
