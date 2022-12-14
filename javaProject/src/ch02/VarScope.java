package ch02;

public class VarScope {

	static int x; //전역변수(멤버변수) : 초기화 하지 않아도 기본값이 세팅된다.  클레스 안 모든 함수에서 사용 가능
	
	
	public static void main(String[] args) {
		
		int y = 0; //지역변수 :기본값을 할당해야 된다. 메서드 안에서만 값이 유효함.
		
		System.out.println("x = " + x); // 안의 +기호는 연결연산자로서 문자열과 변수등을 연결하는 역할을 한다.
		System.out.println("y = " + y);
 		
		
		
	}
	
	
}
