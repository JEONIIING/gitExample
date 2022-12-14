package ch06;

public class ReturnEx2 {
	public static void main(String[] args) {
		pintScore(10);
	}

	public static void pintScore(int score) { //score에는 99가 들어옴
		if(score <= 0 || score >=100) {
			System.out.println("잘못된 점수 : " + score);
			return; //메서드 종료
		}
		System.out.println("점수 : "+score);
	}

}
