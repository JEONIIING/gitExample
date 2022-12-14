package ch03;

import java.util.Scanner;

//국어 , 영어, 수학 점수를 입력받아서 총점, 평균 출력
public class Point {
	
	public static void main(String[] args) {
		//변수 선언
		String name;
		int kor, eng, mat, tot;
		double avg;
		
		//입력객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		name = sc.next(); // 문자열 입력
		System.out.print("국어 점수 : ");
		kor = sc.nextInt(); //정수값 입력
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		mat = sc.nextInt();
		sc.close(); //스캐너 객체가 사용중인 메모리 정리
		
		//계산
		tot = kor + eng + mat; //총점
		avg = tot / 3; //평균
		
		//결과출력
		System.out.println("=================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------");
		System.out.println(name +"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg);
		
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f",name,kor,eng,mat,tot,avg);
		System.out.println();
		System.out.println(String.format("%s\t%d\t%d\t%d\t%d\t%.1f",
				name,kor,eng,mat,tot,avg));
		
	}

}
