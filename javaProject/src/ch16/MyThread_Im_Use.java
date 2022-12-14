package ch16;

public class MyThread_Im_Use {

	public static void main(String[] args) {
		MyThread_Im m1 = new MyThread_Im();
		MyThread_Im m2 = new MyThread_Im();
		
		Thread t1 = new Thread(m1, "스레드1");
		Thread t2 = new Thread(m2, "스레드2");
		
		t2.setPriority(Thread.MAX_PRIORITY); //우선순위
		t1.setPriority(Thread.MIN_PRIORITY);
//		System.out.println("스레드2 우선순위 : " +t2.getPriority());
//		System.out.println("스레드1 우선순위 : " +t1.getPriority());
		
		t1.start();
		t2.start();
		
	}

}
