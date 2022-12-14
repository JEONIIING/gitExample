package ch07;

public class RadioTest {

	public static void main(String[] args) {
		Radio briz = new Radio(); //iv와 im을 사용하기 위해 먼저 객체 생성
		briz.power = true; 		  //객체를 생성했으므로 iv사용 가능
		briz.channel = 89.1;
		briz.volume = 12;
		
		Radio iriver = new Radio();
		iriver.power = false;
		iriver.channel = 95.1;
		iriver.volume = 9;
		
		System.out.println("[브리츠 라디오]");
		briz.onOff(); 	//객체 생성했으므로 im(인스턴스메서드)사용 가능.
		briz.print();
		System.out.println();
		System.out.println("[아이리버 라디오]");
		iriver.onOff();
		iriver.print();
		
		
	}

}
