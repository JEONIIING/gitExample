package ch07;

public class Car {
	
	//속성 (멤버변수) : 멤버변수는 기본적으로 int는 0으로 초기화. 하지만 지역변수는 무조건 초기화 시켜줘야됨.
	String color;
	int speed; 
	int gear;
	
	
	@Override
	public String toString() { //개발자용 코드 ->마우스 오른쪽 클릭 ->소스 -> 제너레이트 투스트링
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	void changeGear(int g) {
		gear = g;
	}
	
	void speedUp() {
		speed += 10; //speed = speed+10
	}
	
	void speedDown() {
		speed -= 10; //speed = speed-10
	}
}
