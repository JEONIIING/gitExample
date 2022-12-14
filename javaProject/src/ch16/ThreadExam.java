package ch16;

//멀티스레드 : 작업단위가 2개 이상
//멀티스레드를 구현하는 방법
//1) Thread 상속
//2) Runnable을 구현

public class ThreadExam extends Thread {
	public ThreadExam(String name) {
		super(name); //부모생성자 호출, 타이틀 처리 
	}
	
	//스레드 실행 메서드
	@Override
	public void run() {//반드시 오버라이딩 함
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName()); //현재 실행중인 스레드 이름 출력
		}
		try {
			Thread.sleep(1000); //cpu의 실행을 1초간 멈춤 (필수에외처리)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		ThreadExam t1 = new ThreadExam("thread1");
		ThreadExam t2 = new ThreadExam("thread2");
		ThreadExam t3 = new ThreadExam("thread3");
		
		t1.start(); //스레드객체참조변수.start() ==> run()이 자동 호출됨
		t2.start(); //위와 동시에 호출
		t3.start(); //위와 동시에 호출, 즉, 여기선 3개가 동시에 run()호출함.
//		t1.run(); //run()을 호출하면 메인스레드가 실행되기 때문에 주의해야 한다.
		//실행순서는 그때그때마다 다르다(JVM이 임의로 우선순위를 정해준다.)
	}

}
