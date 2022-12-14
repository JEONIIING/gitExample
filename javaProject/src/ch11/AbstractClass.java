package ch11;

public abstract class AbstractClass { //하나라도 (abstract)추상메서드가 있다면 클래스도 abstract해야 된다.
	//추상 클래스는 객체를 생성할 수 없다.
	
	abstract void method1(); //추상메서드
	void method2() {//일반메서드
		System.out.println("완성된 method");
	}
	
	
}
