package ch05;

import java.util.Scanner;

public class GetMax_Scan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intArray[] = new int [5];
		int max = 0;
		
		System.out.print("양수 5개를 입력하세요 : ");
		for(int i =0; i<intArray.length; i++) {
			intArray[i]= sc.nextInt();
			//입력받은 정수를 배열에 저장
			if(intArray[i]>max) {
				max = intArray[i]; //intArray[i]를 max로 변경
			}
		}
		System.out.println("가장 큰 수는 "+max+ "입니다.");
		sc.close();
		
	}

}
