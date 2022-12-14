package ch16;

public class Priority extends Thread {
	//Priority
	public static void main(String[] args) {
		Priority e1 = new Priority();
		Priority e2 = new Priority();
		
		//스레드의 이름 설정 : setName()
		e1.setName("thread1");
		e2.setName("thread2");
		System.out.println("e1의 기본 우선순위 : " + e1.getPriority()); //순위를 가지고옴
		System.out.println("e2의 기본 우선순위 : " + e2.getPriority());
		
		e1.setPriority(Thread.MAX_PRIORITY); //최대 우선순위(10)
		e2.setPriority(Thread.MAX_PRIORITY); //최소 우선순위(1)
		
		e1.start();
		e2.start();
 	}
	@Override
	public void run() {
		for(int i =1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName()+ "==> "+ i);
		}
	}
}
