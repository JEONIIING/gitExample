package ch04;

public class Do_While_Ex2 {

	public static void main(String[] args) {
		int n=1; //초기식
		do {
			System.out.println( n + " Hello World"); //반드시 한번수행
			n++; //증감식
		}while(n<=10);
		System.out.println("while문 빠져나옴");
	}

}
