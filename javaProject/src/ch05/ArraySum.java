package ch05;

public class ArraySum {

	public static void main(String[] args) {
		int[] num;  //선언 
		num = new int[5]; //생성
		num[0]=10; //저장
		num[0]=20;
		num[0]=30;
		num[0]=40;
		num[0]=50;
		
//		int[] num = {10,20,30,40,50};
		int sum = 0; //배열의 합계를 저장할 변수
		
		for(int i =0; i<num.length ; i++) { //참조변수.length는 배열의 갯수값을 가져온다.
			sum += num[i]; //sum= sum + num[i]
			
		}
		System.out.println("합계 : "+ sum);
		
	}

}
