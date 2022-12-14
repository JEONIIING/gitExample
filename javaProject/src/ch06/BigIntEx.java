package ch06;

import java.math.BigInteger;

public class BigIntEx {
	
	static BigInteger factorial(int n) {
		BigInteger fac = BigInteger.ONE; //1
		for(int i=1; i<n; i++) {
			fac = fac.multiply(BigInteger.valueOf(i)); //객체로 바꿔주는 방법
					
		
		}
		return fac;
	}
	
	
	public static void main(String[] args) {
		for(int j=1; j<=100; j++) {
			System.out.println(j + " 팩토리얼=" + factorial(j));
			System.out.println(); //줄바꿈 
		}
	}
}