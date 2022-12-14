package ch12;

interface RemoteControl{ //객체생성 불가 
	//추상메서드 
	void turnOn();
	void turnOff();
}

//무명클래스
public class AnonymousClassTest {
	public static void main(String[] args) {
		//자주쓰이는 기법 : 무명내부클래스가 interface를 상속받아서 오버라이딩 함. 
		RemoteControl ac = new RemoteControl() { //무명내부클래스를 통해서 상속관계를 만듦 //이름없는 클래스 생성
			//추상클래스나 interface는 new해서 객체생성을 못한다. 하지만 무명클래스 처리하면 
			//자동적으로 interface은 RemoteControl을 무명클래스가 상속받아 오버라이딩 할 수 있다.
			@Override
			public void turnOn() {
				System.out.println("TV turnOn()");
			}

			@Override
			public void turnOff() {
				System.out.println("TV turnOff()");
			}
		};//무명내부클래스
		ac.turnOn();
		ac.turnOff();
		
	}
}
