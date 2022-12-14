package ch05;

import java.util.Scanner;

public class EqualsEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열을 입력해주세요 : ");
			String str = sc.nextLine(); //문자열을 입력받게 하는 함수
			if(str.equals("exit")) {//문자형 참조변수.equals("비교할문자") : equals는 String 클래스 안에 있는 메소드 문자열 내용을 읽음 
				break; //참고 : 값을 비교할때는 "a==b"  문자를 비교할때는 equals를 쓴다
			}else {
			System.out.println(str.length() +  "글자 입니다.");
			//length() : 문자열의 대한 글자 수 반환하는 메소드(배열의 길이값)
			}
		
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
