package ch11;

public class AutoCarTest {

	public static void main(String[] args) {
		OperateCar obj = new AutoCar();
		obj.start();
		obj.setSpeed(32);
		obj.turn(15);
		obj.stop();
	}

}
