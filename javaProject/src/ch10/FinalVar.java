package ch10;


//final 변수 => 상수
//대문자로 작성, 2단어 이상일 경우 _로 연결
//초기값이 반드시 필요함
//값을 변경할 수 없음
//상속 안됨
//오버라이딩 안됨
public class FinalVar {
	//멤버변수
	final static int MAX_NUM = 500;
	//final static int MAX_NUM;
	//상수는 멤버변수(전역)일때 선언만하면 에러
	
	public static void main(String[] args) {
		int max = 100;
		System.out.println(max);
		System.out.println(MAX_NUM);
		//MAX_NAM =200; //final 처리한 상수 변수는 값을 수정할 수 없음
		
	}
}
