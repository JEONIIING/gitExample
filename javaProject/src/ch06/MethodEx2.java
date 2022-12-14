package ch06;

//메소드 사용
public class MethodEx2 {

	//메인메소드(프로그램의 시작이자 끝)
	//메인메소드는 해당 코딩영역의 위치와 상관이 없다.
	public static void main(String[] args) {
		//프로그램 시작
		System.out.println("합(1~10) : " + sum(1,10)); //함수 호출.
		System.out.println("합(10~100) : " + sum(10,100));
		System.out.println("합(100~1000) : " +sum(100,1000) );
		//프로그램 끝
	}
	//사용자 정의 메소드
	public static int sum(int a, int b) {
		int sum=0; //리턴용도
		for(int i=a ; i<=b; i++) {
			sum += i;
		}
		return sum; //호출한곳으로 돌아가 반환.
	}

}
