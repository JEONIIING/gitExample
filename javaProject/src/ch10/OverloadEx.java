package ch10;

public class OverloadEx {
	public void putData(String a) {
		System.out.println(a);
	}
	private void putData(int a) { //매개변수타입이 다른 메서드 오버로딩
		System.out.println(a);
	}
	private void putData(double a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		OverloadEx o = new OverloadEx();
		o.putData("hello");
		o.putData("5");
		o.putData("3.5");
	}
}
