package ch11;

public class Test2 extends Test {
	@Override
	public void print() { //추상메서드를 자식클래스가 상속받아서 구체화
		System.out.println("추상클래스 구현");
	}
	
	public static void main(String[] args) {
		Test t = new Test2();
		t.print();
	}

}
