package ch16;

public class BankUse {

	public static void main(String[] args) {
		MyBank m = new MyBank();
		
		BankPlayer p1 = new BankPlayer(1 , m);
		BankPlayer p2 = new BankPlayer(2 , m);
		BankPlayer p3 = new BankPlayer(3 , m);
		
		p1.setName("홍길동");
		p2.setName("사임당");
		p3.setName("이몽룡");
		
		p1.start();
		p3.start();
		p2.start();
		
	}

}
