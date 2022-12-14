package ch04;

public class Do_While_Char {

	public static void main(String[] args) {
		char c = 'a';
		do {
			System.out.print(c); //무조건 한번 실행 후 조건식으로 참이면 반복.
			c= (char)(c+1); //c= (char)(c+1) 영문의 경우 1을 더하면 다음문자의 코드 값
		}while(c <= 'z');
		
		
		
		
		
	}

}
