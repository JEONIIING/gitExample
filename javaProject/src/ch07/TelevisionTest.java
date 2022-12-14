package ch07;

public class TelevisionTest {

	public static void main(String[] args) {
		Television tv = new Television(); //객체생성(인스턴스화) //참조변수 tv는 객체를 가르키고 있는 주소값을 가지고있음
		tv.channel = 7; //tv참조변수가 가르키고 있는 channel 값에 7 할당.
		// tv. ==>인스턴스화된 Television 메모리의 주소값으로 접근
		tv.volume = 9;
		tv.onOff = true;
		
		System.out.println("텔레비전의 채널은 " + tv.channel + "이고 볼륨은 "
				 			+tv.volume + "입니다.");
		
	}

}
