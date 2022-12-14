package ch06;

public class ReturnEx {
	//리턴값이 있는 메소드
	public static int sum(int x) {//메서드, 변수는 소문자로 시작 :프로그램 관례 (사용자가 정의한 메소드)
		int result = 0;
		for(int i=1; i<=x; i++) {
			result += i;
		}
		return result; //메소드를 호출한 곳을 값을 반환함
		
	}
	public static void main(String[] args) {
		int n = sum(50); //sum메서드 호출한 후 리턴값을 변수 n에다가 저장함
		System.out.println("1~50까지의 합 : "+ n);
		n=sum(100); //메서드 재사용
		System.out.println("1~100까지의 합: "+n);
		
	}
}
