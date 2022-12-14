package ch16;

public class JoinExam {

	public static void main(String[] args) {
		MyThread3 thread = new MyThread3();
		thread.start(); //스레드 시작 run()호출
		System.out.println("Thread가 종료될때까지 기다립니다.");
		try {
			thread.join(); // main쓰레드가 우선순위를 갖기때문에 main을 잠시 멈추고 thread가 가리키는 해당 스레드가 종료될때까지 main스레드가 기다림
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thrad가 종료되었습니다.");
	}

}
