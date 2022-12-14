package ch13;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하세요 : ");
		int year = sc.nextInt();
		GregorianCalendar cal = new GregorianCalendar();
//		if(cal.isLeapYear(year)) { //윤년계산 메서드: isLeapYear 첫번째 방법
//			System.out.println("윤년입니다.");
		if((year%4 == 0 && year%100 !=0) || year%400 == 0) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("평년입니다.");
		}
	}

}
