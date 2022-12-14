package ch09;

class Bank{
	//멤버 메소드
	double getInterestRate() {
		return 0.0;
	}
}

class BadBank extends Bank{
	//get +컨+스페이스 맨첫번째줄 -->오버라이딩  //@는 주석 스프링가서는 기능이 강화 됨
	@Override
	double getInterestRate() { //메서드 오버라이딩 : (부모메서드 자식클래스에서 재정의)
		return 10.0;
	}
}

class NomalBank extends Bank{
	@Override
	double getInterestRate() {
		return 5.0;
	}
}

class GoodBank extends Bank {
	@Override
	double getInterestRate() {
		return 3.0;
	}
	
}
public class BankTest {

	public static void main(String[] args) {
		BadBank b1 = new BadBank(); //객체생성, 인스턴스화
		NomalBank b2 = new NomalBank();
		GoodBank b3 = new GoodBank();
		System.out.println("BadBank의 이자율 : " + b1.getInterestRate());
		System.out.println("NomalBank의 이자율 : " + b2.getInterestRate());
		System.out.println("GoodBank의 이자율 : " + b3.getInterestRate());
	}

}
