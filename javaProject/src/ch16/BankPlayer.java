package ch16;

public class BankPlayer extends Thread {
	int type;
	MyBank mybank;
	
	public BankPlayer() {
	}
	
	public BankPlayer(int type, MyBank mybank) {
		this.type = type;
		this.mybank = mybank;
	}
	
	@Override
	public void run() {
		switch (type) {
		case 1: mybank.bankmoneyA(); break;
		case 2: mybank.bankmoneyB(); break;
		case 3: mybank.bankmoneyC(); break;
		}
	}
	
	
}
