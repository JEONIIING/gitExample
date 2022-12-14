package ch10;

//개별적인 값을 사용할 때 => nonstatic iv ex)학생들 
//공통적인 값을 사용할 때 => static cv ex)학점 4.0이상

public class StaticExam {

	public static void main(String[] args) {
		int a = 40; int b = 30;
		int result;
		//대표적으로 자주 사용하고 고정된값등, Math클래스 등은 static, final을 거의 사용한다.
		result = Math.max(a, b);
		System.out.println(result);
		
		result = Math.min(a, b); 
		System.out.println(result);
		System.out.println(Math.sqrt(1000));
		
		double r = 15.3;
		System.out.println("원의 둘레 : " +2*Math.PI*r);
		System.out.println("원의 넓이 : " + Math.PI*r*r);
		
	}

}
