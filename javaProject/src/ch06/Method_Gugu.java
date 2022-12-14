package ch06;

import java.util.Scanner;

public class Method_Gugu {

	public static void main(String[] args) {
		int dan;
		System.out.print("단을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		dan = sc.nextInt();
		gugu(dan);
		sc.close();
	}
	//void는 리턴타입이 없다는것을 의미하는 키워드
	public static void gugu(int dan) {
		for(int i=1; i<=9; i++) {
			System.out.println(dan +" x " +i+ " = "+ dan*i );
		}
	}

}
