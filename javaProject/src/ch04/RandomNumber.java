package ch04;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {

		Random rd = new Random(); //난수를 발생시키는 랜덤함수이다.
		Scanner sc = new Scanner(System.in);
		System.out.print("난수의 갯수 : ");
		int count = sc.nextInt();
		int sum = 0;
		sc.close();
		
		for(int i =0; i<count;i++) {
			int number = sc.nextInt(100); //0~99사이의 난수발생
			System.out.println("생성된 난수 : " + number);
			sum += number; 
	
		}
		System.out.print("난수 " + count + "개의 합은 "+sum);
		
	}

}
