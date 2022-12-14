package ch16;

//Single Thread : 작업단위가 1개(main 스레드만 존재)
public class SingleThread {
	void pirnt() {
		//현재 실행중인 스레드(currentThread)의 이름
		System.out.println(Thread.currentThread().getName());
		for(int i=1; i<=5 ; i++) {
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) { //main메서드도 스레드였다.(싱글 스레드)
		SingleThread t = new SingleThread();
		t.pirnt();
		t.pirnt();
		
		
	}

}
