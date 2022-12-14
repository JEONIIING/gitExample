package ch11;

public class ControllableDemo {

	public static void main(String[] args) {
		Tv t = new Tv();
		t.turOn();
		t.turnOff();
		t.remoteOn();
		t.remoteOff();
		t.repair();
		Controllable.reset(); //static멤버일때는 클래스이름.메서드이름 으로 접근해야함.
		
		Computer c = new Computer();
		c.turOn();
		c.turnOff();
		c.repair();
		Controllable.reset();
	}

}
