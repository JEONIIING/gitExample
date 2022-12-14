package ch12;

public class LocalOuter {
	private int data=30;
	void display() { //LocalOuter클래스의 멤버메서드
		class LocalInner{ //지역내부클래스(메서드 안에서 선언)
			void msg() { //LocalInner클래스의 멤버메서드
				System.out.println(data);
			}
			
		}//innerclass
	
		LocalInner li = new LocalInner(); //지역내부클래스 객체성성
		li.msg();
	
	}//end method
	
	public static void main(String[] args) {
		LocalOuter lo = new LocalOuter();
		lo.display();
	}
	
}
