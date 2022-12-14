package ch14;

public class Type3<T> { //자료형이 미정인 상태<아무문자나>
	T t; //변수도 자료형 미정
	public void setT(T t) { //메서드도 자료형 미정
		this.t = t;
	}
	public T getT() {
		return t;
	}
	
	public static void main(String[] args) {
		Type3<String> t = new Type3<String>(); //객체 생성할때 미정의 자료형을 결정한다
		t.setT("Hello");
		System.out.println(t.getT());
		
		Type3<Integer> t2 = new Type3<Integer>();
		t2.setT(100);
		System.out.println(t2.getT());
		
		Type3<Double> t3 = new Type3<>(); //new 뒤에 <>는 생략가능.
		t3.setT(36.5);
		System.out.println(t3.getT());
	}
}
