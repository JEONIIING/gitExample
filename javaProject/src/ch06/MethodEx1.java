package ch06;

public class MethodEx1 {

	public static void main(String[] args) {
		//메소드를 사용하지 않은 경우
		int sum =0;
		for(int i=0;i<=10;i++) {
			sum += i;
		}
		System.out.println("합(1~10) : "+ sum);
		
		sum=0; //sum값 다시 초기화
		for(int i=10;i<=100; i++) {
			sum += i ;
			
		}
		System.out.println("합(10~100) : "+sum);
		
		sum=0; //sum값 다시 초기화
		for(int i=100; i<=1000; i++) {
			sum+= i;
		}
		System.out.println("합(100~1000) : "+sum);
	}

}
