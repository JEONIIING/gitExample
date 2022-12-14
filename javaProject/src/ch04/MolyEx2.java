package ch04;

import java.util.Scanner;

public class MolyEx2 {

	public static void main(String[] args) {
		int kor = 0; //국어
		int eng = 0; //영어
		int mat = 0; //수학
		String grade = ""; //등급
		
		Scanner sc = new Scanner(System.in);
		for(int i =1; i <=3; i++) {
			System.out.print("국어 점수 : ");
			kor = sc.nextInt();
			System.out.print("영어 점수 : ");
			eng = sc.nextInt();
			System.out.print("수학 점수 : ");
			mat = sc.nextInt();
		} 
		sc.close();
		
		System.out.println("=============================================");
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		
		int tot = kor + eng + mat;
		double avg = tot/3.0;
		
		for(int j =1 ; j<=3 ; j++) {
			if((int)avg>=90) {
				grade = "수";
			}else if((int)avg>=80) {
				grade = "우";
			}else if((int)avg>=70) {
				grade = "미";
			}else if((int)avg>=60) {
				grade = "양";
			}else {
				grade = "가";
			}
			System.out.println(kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+Math.round(avg*10)/10.0+"\t"+grade);
		}	
		System.out.println("=============================================");
		
	}

}
