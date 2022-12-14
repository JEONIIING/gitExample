package ch07;

public class Television {
	//iv 멤버변수(전역변수)
	int channel; //채널
	int volume; //볼륨
	boolean onOff; //전원 상태
	
	void print() {
		System.out.println("채널은 "+ channel + "이고 볼륨은 " + volume + "입니다.");
	}
	
	int getChannel() {
		return channel;
	}
	
	void setChannel(int channel) {
/*멤버변수*/ this.channel = channel; /*지역변수*/ 
	}
	
}
