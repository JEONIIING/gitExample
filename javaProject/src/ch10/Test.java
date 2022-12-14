package ch10;

public class Test {
	static int a; //static membr : cv
	int b; //nonstatic member : iv
	
	void print() {//nonstatic member : im
		System.out.println(a); //cv => 이미 메모리에 올라와 있기 때문에 문제없다.
		System.out.println(b); //iv
	}
	public static void main(String[] args) {
		System.out.println(a);
		
		Test t = new Test(); //인스턴스 메서드 사용위해 객체생성
		System.out.println(t.b);
		t.print();
//		t = null; //객체의 주소값을 초기화(주소값을 잃어버린다.)
//		System.out.println(t.b);
	}
}
