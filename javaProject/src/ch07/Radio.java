package ch07;

public class Radio {
	//iv선언 (인스턴스 변수 선언)
	double channel; //채널 
	int volume; //볼륨
	boolean power; //전원
	
	//im선언 (인스턴스 메서드 선언)
	void onOff(){ //매개변수가 없다. iv를 사용하기 때문에. 매개변수가 필요 없기도 하다.
		if(this.power==true) {
		System.out.println("라디오가 켜져있습니다.");
		}else {
			System.out.println("라디오가 꺼져있습니다.");
		}
	}
	
	void print() {
		System.out.println("현재 채널은 " + this.channel + " 입니다.");
		System.out.println("볼륨은 " + this.volume + " 입니다.");
	}
		

}
