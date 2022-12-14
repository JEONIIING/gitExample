package ch16;

public class MusicBox { //공유객체
	//가요 음악
	//메소드 이름 앞에 synchronized를 붙이면 해당 메서드는 객체 사용권(Monitoring Lock)을 얻는다. (권장사항)
	public synchronized void playMusicA() { // 해당 메서드가 실행될때 다른 메서드는 블럭 처리를 한다.
		for(int i=0; i<10; i++) { // 1초 이하로 쉬면서 10번 반복
			System.out.println("가요음악 !!! ");
			try {
				Thread.sleep((int)Math.random()*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//end for
	}//playMusicA
	
	//팝송 음악
	public synchronized void playMusicB() {
		for(int i=0; i<10; i++) { // 1초 이하로 쉬면서 10번 반복
			System.out.println("팝송음악 !!! ");
			try {
				Thread.sleep((int)Math.random()*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	//클래식 음악
	//synchronized를 붙히지 않은 메서드는 다른 스레드들이 모니터링 락을 획득했어도, 그것과 상관없이 중간에도 실행된다.
	public void playMusicC() {
		for(int i=0; i<10; i++) { // 1초 이하로 쉬면서 10번 반복
			//전체 메서드에 적용 안하고 특정 부분만 synchronized 블럭처리를 할 수 있다.
			synchronized(this) {//this는 MusiccBox객체 자신을 가리킴
				System.out.println("클래식 음악 !!! ");
			}
			try {
				Thread.sleep((int)Math.random()*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}	