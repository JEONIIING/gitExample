package ch05;

import java.util.Scanner;

public class ArrayScanScore {

	public static void main(String[] args) {
		int size;
		int a;
		int tot =0;
		Scanner sc = new Scanner(System.in);
		System.out.print("성적처리할 학생수를 입력하세요 >> ");
		size = sc.nextInt();
		int [] score = new int[size];
		
		for(int i=0; i<score.length; i++) {
			System.out.print("성적을 입력하세요 : ");
			a = sc.nextInt();
			score[i] += a; 
			tot += score[i];
		}
		sc.close();
		System.out.println("===================");
		System.out.println("총점은 "+tot+ "점 입니다.");
		System.out.println("평균은 "+(double)tot/score.length+ "점 입니다.");
	}

}
