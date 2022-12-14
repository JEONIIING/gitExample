package ch03;

import java.util.Scanner;

public class JumSoo {

	public static void main(String[] args) {
		String name;
		int java , db , html , jsp ,tot;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요. > ");
		name = sc.next();
		System.out.print("Java 점수를 입력하세요. > ");
		java = sc.nextInt();
		System.out.print("DB 점수를 입력하세요. > ");
		db = sc.nextInt();
		System.out.print("HTML 점수를 입력하세요. > ");
		html = sc.nextInt();
		System.out.print("JSP 점수를 입력하세요. > ");
		jsp = sc.nextInt();
		sc.close();
		
		tot = java + db + html + jsp;
		avg = tot / 4.0;
		
		System.out.println("=====================================================");
		System.out.println("이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.1f", name, java, db, html, jsp, tot, avg);
		System.out.println();
		System.out.println("=====================================================");
		
		
		
		
		
	}

}
