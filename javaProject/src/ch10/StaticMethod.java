package ch10;

public class StaticMethod {
	static int a =10; //cv
	int b = 20;		  //iv
	
	public static void printA() {//static member method 클래스메서드
		System.out.println(a);
		StaticMethod s = new StaticMethod();
		System.out.println(s.b);
	}
	
	public void printB() { //im
		System.out.println(a); //cv
		System.out.println(b); //iv
	}
	
	public static void main(String[] args) {
		printA();
		StaticMethod a = new StaticMethod();
		a.printB();
		//printB(); //main 바깥에 있는 멤버형 nonstatic메서드이기 때문에
		//반드시 객체생성 이후에 사용할 수 있다.
	}
}
