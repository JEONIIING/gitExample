package ch04;

import java.util.Scanner;

public class BreakAVG {

	public static void main(String[] args) {

		int total = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while(true) { //무한반복
			System.out.print("점수를 입력하세요 : ");
			int num = sc.nextInt();
			if(num < 0) //-값을 입력해야 종료 
				break;
			total += num; //num을 읽어서 total에 계속 더해줌.
			count++;
			
			
			
		}
		System.out.println("평균은 "+ total/count);
		sc.close();
		
	}

}
