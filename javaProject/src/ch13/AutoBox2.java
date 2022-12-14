package ch13;

//문제1]
public class AutoBox2 {
	
	public static void main(String[] args) {
		//기본자료형
		int num1, num2, num3;

		//객체자료형 (boxing 박싱)
		Integer i1 = new Integer(30);
		Integer i2 = new Integer(40);
		Integer i3 = new Integer(50);
		
		//(unboxint 언박싱)
		num1 = i1;
		num2 = i2;
		num3 = i3;
		
		System.out.println("기본자료형 : "+ num1 +", 객체자료형 : " +i1);
		System.out.println("기본자료형 : "+ num2 +", 객체자료형 : " +i2);
		System.out.println("기본자료형 : "+ num3 +", 객체자료형 : " +i3);
		
	
	
	}
	
}
