package ch16;

public class MyThread_Ex extends Thread {
	String str = "";
	
	public MyThread_Ex(String str) {
		this.str = str;
	}
	
	public MyThread_Ex() {
	}
	
	@Override
	public void run() {
	 for(int i =1 ; i<=5; i++) {
		 System.out.println(str + i);
	 }
	 try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
		}
	}
}
