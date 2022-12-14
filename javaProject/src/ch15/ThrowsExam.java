package ch15;

public class ThrowsExam {
	//예외처리방법
	//2) try ~ catch 직접처리
	//3) throws 예외처리를 클래스에 위임

	public static void main(String[] args) throws InterruptedException {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			Thread.sleep(1000); //Interrupt (cpu 간섭) ->출력이 1초씩 느려짐
		}
		
	}

}
