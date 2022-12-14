package ch04;

import java.util.Scanner;

public class While_Gugu {

	public static void main(String[] args) {
		int dan;
		int n=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 중에서 출력하고자 하는 단을 입력하세요 : ");
		dan = sc.nextInt();
		while(dan > 0 && dan < 9) {
			if(n>=10) break; {
			System.out.println(dan + " x " + n +" = "+ dan*n);
			}
			n++;
		}
	
	}

}
