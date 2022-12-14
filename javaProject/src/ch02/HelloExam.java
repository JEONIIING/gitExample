package ch02;

// 클래스 이름은 대문자로 시작
public class HelloExam {
	//메소드 이름은 소문자로 시작
	
	//전역변수(멤버변수) :클레스와 메소드 사이에 선언된 변수
	int a,b;
	
	
	public static int sum(int n, int m) { //n=20, m=10
		return n + m; //30을 반환한다.
		
	}
	public static int sum2(int n, int m) { //n=20, m=10
		return n / m; //30을 반환한다.
		
	}
	//실행되는 메인 메소드(=함수)
	public static void main(String [] args) {
		int i = 20; //지역변수 초기화 (값을 저장, 변수에 할당한다.) = 는 같다라는 의미가 아니라 오른쪽값을 좌변에 저장한다.
		int s; 		//지역변수 선언 : 메소드 안에 있는 변수 (반드시 초기값을 할당해야 함)
		char a; 	//지역변수 선언
		
		s = sum(i, 10); //s=30
		double s2 = sum2(30,10); 
		a = '?'; 		//단문자는 작음따옴표, 단어문자는 ""를 쓴다.
	
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		System.out.println(s2);
		
	}

}
