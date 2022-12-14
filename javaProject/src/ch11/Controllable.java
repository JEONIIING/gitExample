package ch11;

public interface Controllable {
	//인터페이스에서 명시적 default 메서드로의 구현은 jdk8부터 가능
	default void repair() {
		System.out.println("장비를 수리한다.");
	}
	static void reset() {//static 메소드 구현도 jdk8붙 가능
		System.out.println("장비를 초기화 한다.");
	}
	//참고 : private 메서드 구현은 jdk9부터 사용가능
	void turOn();
	void turnOff();
}
