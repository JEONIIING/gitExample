package ch11;

public class Car implements Vehicle {
	//인터페이스를 받으려면 implements 키워드 사용.
	//인터페이스를 이용하여 다중 상속이 가능.
	
	@Override
	public void speedUp() {
		System.out.println("Car SpeedUp");
	}

	@Override
	public void speedDown() {
		System.out.println("Car SpeedDown");
	}

	@Override
	public void handle() {
		System.out.println("Car Handling");
	}

}
