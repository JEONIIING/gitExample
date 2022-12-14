package ch13;

//Wrapper class : 기본자료형을 포장(박싱)하는 클래스
//기본 자료형에 대한 다양한 method를 지원
//byte		Byte
//short		Short	
//int 		Integer
//float 	Float
//double	Double
//char 		Character
//boolean	Boolean

public class WrapperEx {
	public static void main(String[] args) {
		Integer i1 = 10; //i1는 주소값을 저장하는 참조변순데 Wrapper클래스 Integer에는 값이 저장됨.
		Integer i2 = new Integer(20); //auto boxing
		int num1 = i1.intValue(); //언박싱
		int num2 = i2; //auto unboxing(객체로 포장된 value를 꺼내서 작업됨)
		int sum = num1 + num2;
		System.out.println(sum);
		
		//2진수 문자열로
		System.out.println(Integer.toBinaryString(sum));
		
		//8진수 문자열로
		System.out.println(Integer.toOctalString(sum));
		
		//16진수 문자열로
		System.out.println(Integer.toHexString(sum));
		
		System.out.println(Integer.MAX_VALUE); //정수의 최대값
		System.out.println(Integer.MIN_VALUE); //정수의 최소값
		System.out.println(Integer.parseInt("100"));
		
		//정수를 문자열로
		System.out.println(Integer.toString(100));
		System.out.println(100+"");
	}
	
	
}
