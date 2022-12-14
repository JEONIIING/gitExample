package ch07;

public class TelevisionTest2 {

	public static void main(String[] args) {
		Television myTv = new Television(); //객체생성 =>메모리에 로딩
		System.out.println(myTv); //메모리의 주소값 출력 (헤쉬코드)
		myTv.channel = 7;
		myTv.volume = 10;
		myTv.onOff = true;
		
		System.out.println("나의 텔레비젼의 채널은 " + myTv.channel+ "이고 볼륨은 "+myTv.volume+ "입니다.");
		System.out.println();
		
		
		Television yourTv = new Television(); //같은 객체생성시 참조변수 이름은 달라야 한다.
		System.out.println(yourTv); //객체생성마다 다른 메모리 주소값을 가지고 있다.
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = false;
		System.out.println("너의 텔레비젼의 채널은 " + yourTv.channel+ "이고 볼륨은 "+yourTv.volume+ "입니다.");
		
		
		
		
	}

}
