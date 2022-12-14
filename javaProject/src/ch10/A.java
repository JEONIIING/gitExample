package ch10;


//static => 메모리에 바로 로딩
//nonstatic => 객체생성 후에 로딩
public class A {
	//멤버변수 :자동초기화
	String name = "kim"; //iv - nonstatic member
	static int n =20; 	 //cv - static member
	
	//멤버메서드
	public void print() { //iv메서드
		System.out.println(name);
		System.out.println(n);
	}
	
	public static void main(String[] args) { //main : static mamber ,클래스메서드
		//지역변수 :반드시 직접 초기화 
		int a =10;
		double b = 20.5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(n);
		
		A a1 = new A();
		System.out.println(a1.name); //nonstatic member는 반드시 객체생성이후에 사용가능하다.
		
	}

}
