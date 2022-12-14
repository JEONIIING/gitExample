package ch07;

public class TelevisionTest3 {

	public static void main(String[] args) {
		Television myTv = new Television();
		System.out.println(myTv);
		myTv.channel = 7;
		myTv.volume = 11;
		myTv.onOff = true;
		myTv.print();
		
		
		System.out.println();
		Television yourTv = new Television(); //다른 메모리번지수에 객체생성
		System.out.println(yourTv);
		yourTv.channel = 9;
		yourTv.volume = 13;
		yourTv.onOff = false;
		yourTv.print();
	}

}
