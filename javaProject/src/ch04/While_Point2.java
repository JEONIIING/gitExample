package ch04;

import java.util.Scanner;

public class While_Point2 {

	public static void main(String[] args) {
		int count = 0; //증감식으로 사용할 변수
		int sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학, 점수를 각각 입력하고 마지막에 -1를 입력하세요.");
		int n = sc.nextInt();
		while(n != -1) { //-1이 입력이 되면 while문 벗어남
			sum += n;
			count++;
			n = sc.nextInt(); //-1입력용도
		}
		if(count == 0) {
			System.out.println("입력된 수가 없습니다.");
		}else {
			System.out.printf("총점은 %d이고 평균은 %4.1f 입니다" , sum, (double)sum/count);
		}
		sc.close();
		
	}

}
