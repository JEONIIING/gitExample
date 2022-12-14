package ch09;

//자식클래스
public class SportsCar extends Car {
	boolean turbo;
	
	public void setTurbo(boolean flag) {
		turbo = flag;
		System.out.println(turbo);
	}
	
}
