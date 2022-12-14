package ch16;

public class MyBank {
	
	public synchronized void bankmoneyA() {
		for(int i=1; i<6 ;i++) {
		System.out.println(Thread.currentThread().getName() + "의 통장잔고는 "+ i+"0만원 입니다.");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		System.out.println();
	}
	public synchronized void bankmoneyB () {
		for(int i=2; i<7 ;i++) {
			System.out.println(Thread.currentThread().getName() + "의 통장잔고는 "+ i+"0만원 입니다.");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	public synchronized void bankmoneyC () {
		for(int i=3; i<8 ;i++) {
			System.out.println(Thread.currentThread().getName() + "의 통장잔고는 "+ i+"0만원 입니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
}
