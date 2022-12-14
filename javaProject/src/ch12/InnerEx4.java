package ch12;

class Outer{
	class InstanceInner{ //내부클래스
		int a = 100; //iv
	}
	static class StaticInner{//내부 static 클래스 : 정적중첩클래스
		int a = 200; //iv
		static int b = 300; //cv
	}
	
	void myMethod() {//멤버메서드
		class LocalInner{ //지역중첩클래스
			int a=400;
		}//end inner class
		LocalInner i = new LocalInner();
		System.out.println("i.a : " + i.a);
	}//end method
}

public class InnerEx4 {
	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.InstanceInner i = oc.new InstanceInner(); //Outer클래스 안 내부클래스 객체생성
		System.out.println("i.a : " + i.a); //100

		//내부클래스가 static이고 멤버변수도 static이여서 바로 호출가능
		System.out.println("Outer.StaticInner.b : " + Outer.StaticInner.b);  //300
		
		//iv멤버는 static클래스 안에 있더라도 반드시 new를 통해 객체생성한 후 사용해야 한다.
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.a : " + si.a); //200
		
		//Outer 멤버메서드 호출
		oc.myMethod(); //400
	}
}
