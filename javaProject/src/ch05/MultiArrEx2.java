package ch05;

import java.util.Scanner;

public class MultiArrEx2 {

	public static void main(String[] args) {
		String [][] quiz = {{"apple","사과"},
							{"money","돈"},
							{"star","별"},
							{"river","강"}};
		String stop = "-1";
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(true) {
			System.out.printf("문제 %d) %s의 뜻은 (종료 시: -1)? " ,i+1, quiz[i][0]);
			String tmp = sc.next();
			if(tmp.equals(quiz[i][1])) {
				System.out.println("정답입니다."+"\n");
			}else if(tmp.equals(stop)) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.printf("틀렸습니다. 정답은 %s 입니다.%n%n",quiz[i][1]);
			}i++;
			if(i == quiz.length) {
				i = 0;
			}
			
		}
		sc.close();
		
	}
	
}	
