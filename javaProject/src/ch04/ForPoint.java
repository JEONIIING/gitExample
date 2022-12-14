package ch04;
//옵션문제]
import java.util.Scanner;

public class ForPoint {

	public static void main(String[] args) {
		int kor []= {0,0,0}; //국어
		int eng []= {0,0,0}; //영어
		int mat []= {0,0,0}; //수학
		String grade = ""; //등급
		int tot[]= new int[3];
		double avg [] = new double[3];
		
		Scanner sc = new Scanner(System.in);
		for(int i =0; i <3; i++) {
			System.out.print("국어 점수 : ");
			kor[i] = sc.nextInt();
			System.out.print("영어 점수 : ");
			eng[i] = sc.nextInt();
			System.out.print("수학 점수 : ");
			mat[i] = sc.nextInt();
			
			tot[i]=kor[i]+eng[i]+mat[i];
			avg[i]=tot[i]/3.0;
		} 
		sc.close();
		
		System.out.println("=============================================");
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		
			
		for(int j =0 ; j<3 ; j++) {
			if((int)avg[j]>=90) {
				grade = "수";
			}else if((int)avg[j]>=80) {
				grade = "우";
			}else if((int)avg[j]>=70) {
				grade = "미";
			}else if((int)avg[j]>=60) {
				grade = "양";
			}else {
				grade = "가";
			}
			System.out.println(kor[j]+"\t"+eng[j]+"\t"+mat[j]+"\t"+tot[j]+"\t"+Math.round(avg[j]*10)/10.0+"\t"+grade);
		}	
		System.out.println("=============================================");
		
	}
}