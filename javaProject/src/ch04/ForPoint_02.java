package ch04;

import java.util.Scanner;

public class ForPoint_02 {

	public static void main(String[] args) {

		int kor;
		int eng;
		int mat;
		int tot;
		double avg;
		String grade = "";
		String result = ""; //점수 출력용
		
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=3; i++) {
			System.out.print("국어 : ");
			kor = sc.nextInt();
			System.out.print("영어 : ");
			eng = sc.nextInt();
			System.out.print("수학 : ");
			mat = sc.nextInt();
			tot = kor+eng+mat;
			avg = tot/3.0;
			
			if(avg >=90) {
				grade="수";
			}else if(avg >=80) {
				grade="우";
			}else if(avg>=70) {
				grade="미";
			}else if(avg>=60) {
				grade="양";
			}else {
				grade ="가";
			}			
			
			result += kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"
			+String.format("%.1f", avg)+"\t"+grade+"\n"; //문자열을 누적시키는 기법
		}//for
		
		//출력
		System.out.println("=======================================================");
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("-------------------------------------------------------");
		System.out.println(result);
		System.out.println("=======================================================");
		
		sc.close();
	}

}
