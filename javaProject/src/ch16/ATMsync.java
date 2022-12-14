package ch16;

public class ATMsync {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mom = new Thread(atm, "mom");
		Thread son = new Thread(atm, "son");
		
		mom.start();
		son.start();
		
	}
}

class ATM implements Runnable{
	private long accBalance = 10000; //통장잔고
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0; i<10 ; i++) {
				notify(); //wait()하고 있는 스레드를 깨움
				try {
					wait(); //현재 실행 스레드를 일시정지상태로 만들면서 다른 스레드가 실행되도록 허용
					Thread.sleep(1000); //실행속도 조절
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(getAccount() <= 0) { //통장잔액이 없으면
					break; //for문을 빠져나감
				}
				withDraw(1000); //1000원
			}//end for
		}
		
	}//end run()

	private long getAccount() {
		return accBalance;
	}

	public void withDraw(long cash) {//출금관련 메서드
		if(getAccount() > 0) {
			accBalance -= cash; //통장잔고가 0보다 크면 잔액에서 1000원씩 인출
			System.out.print(Thread.currentThread().getName() + " , ");
			System.out.printf("잔액 : %,d 원 %n", getAccount()); // %,d는 3자리수 컴마처리 하는거
		}else {
			System.out.print(Thread.currentThread().getName() + " , ");
			System.out.println("잔액이 부족합니다.");
		}
		
	}
	
}
