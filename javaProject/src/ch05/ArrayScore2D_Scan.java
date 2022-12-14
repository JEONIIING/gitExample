package ch05;

import java.util.Scanner;

public class ArrayScore2D_Scan {

	public static void main(String[] args) {
		int size, kor, eng,mat;
		int [] tot = {0,0,0};
		double []avg = {0,0,0};
		String [] grade = {"F","F","F"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력하시오 : ");
		size = sc.nextInt();
		
		int [][] student = new int [size][3];
		System.out.println("국,영,수 점수를 각각 입력하세요 : ");
		
		
		for(int i=0; i<student.length; i++) {
			System.out.printf("%d번 학생의 점수 : ",i+1);
				kor = sc.nextInt();
				student[i][0] += kor;
				eng = sc.nextInt();
				student[i][1] += eng;
				mat = sc.nextInt();
				student[i][2] += mat;
				
				for(int j=0; j<3; j++) {
				tot[i] += student[i][j]; //
				}
			}	
		for(int str=0; str<3; str++) {
			avg[str] += tot[str]/3.0;
			for(int gr=0; gr<3; gr++) {
				if(avg[gr]>=90) {
					grade[gr]= "A";
				}else if(avg[gr]>=80) {
					grade[gr]="B";
				}else if(avg[gr]>=70) {
					grade[gr]="C";
				}else if(avg[gr]>=60) {
					grade[gr]="D";
				}
			}	
		}
	
		System.out.println("--------------------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("--------------------------------------------------------");
		for(int a=0; a<student.length; a++) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%.1f\t%s%n",a+1, 
				student[a][0],student[a][1],student[a][2],tot[a],avg[a],grade[a]);
		}
		System.out.println("--------------------------------------------------------");
		sc.close();
	}

}

