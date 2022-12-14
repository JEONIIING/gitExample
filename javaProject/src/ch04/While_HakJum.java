package ch04;

import java.util.Scanner;

public class While_HakJum {

	public static void main(String[] args) {
		int kor = 0;
		int eng = 0;
		int mat = 0;
		int tot= 0;
		double avg = 0.0;
		String grade = "";
		String str = ""; //누적 점수
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int i =1;
		while(i<=3) {
			System.out.print("국어 : ");
			kor = sc.nextInt();
			System.out.print("영어 : ");
			eng = sc.nextInt();
			System.out.print("수학 : ");
			mat = sc.nextInt();
			
			tot = kor + eng + mat;
			avg = tot/3.0;
			
			if(avg>=90) {
				grade="수";
			}else if(avg>=80) {
				grade="우";
			}else if(avg>=70) {
				grade="미";
			}else if(avg>=60) {
				grade="양";
			}else {
				grade="가";
			}
			
			str += kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+Math.round(avg*10)/10.0+"\t"+grade+"\n";
			i++;
			
		}
		System.out.println("================================================");
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println(str);
		System.out.println("================================================");
		
		
	}

}
