package ch02;

public class PrintfEx {

	public static void main(String[] args) {
		
		int i = 97;
		int d = 3000;
		String s = "java";
		double f = 3.14;
		
		//포맷
		System.out.printf("%d\n", i );
		System.out.printf("%o\n", i );
		System.out.printf("%x\n", i );
		System.out.printf("%c\n", i );
		System.out.printf("%5d\n", d );
		System.out.printf("%-5d\n", i );
		System.out.printf("%05d\n", i );
		System.out.printf("%,d\n", d ); //3자리마다 콤마처리
		System.out.printf("%s\n", s );
		System.out.printf("%5s\n", s );
		System.out.printf("%-5s\n", s );
		System.out.printf("%f\n", f );
		System.out.printf("%e\n", f );
		System.out.printf("%4.1f\n", f );
		System.out.println(String.format("%4.1f", f));
		System.out.printf("%.1f\n", f ); //전체자리수는 정하지 않고 소수점 1째자리까지만 지정
		System.out.printf("%04.1f\n", f );
		System.out.printf("%-4.1f\n", f );
		
		int a= 3, b=5;
		//%를 표현하고자 할때는 a%%b처럼 2개를 씀
		System.out.printf("a%%b=%d\n", a%b);
		
	}

}
