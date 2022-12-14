package ch11;

public class Notebook implements Controllable {

	@Override
	public void turOn() {
		System.out.println("노트북을 켠다");
	}

	@Override
	public void turnOff() {
		System.out.println("노트북을 끈다");
	}

	public static void main(String[] args) {
		Controllable c1 = new Notebook();
		c1.turOn();
		c1.turnOff();
		c1.repair();
		Controllable.reset();
	}
}
