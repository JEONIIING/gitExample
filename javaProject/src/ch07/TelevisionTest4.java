package ch07;

public class TelevisionTest4 {

	public static void main(String[] args) {
		Television myTv = new Television(); //객체생성
		myTv.channel = 5;
		myTv.volume = 8;
		myTv.onOff = true;
		int ch = myTv.getChannel(); //기억된 채널값을 반환시켜줌
		
		System.out.println("현재 채널은 "+ ch + "입니다.");
		
	}

}
