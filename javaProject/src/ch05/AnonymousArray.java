package ch05;



//무명배열 : 배열의 이름을 지정하지 않고 단순히 초기값만으로 배열을 생성 (일회성)
//무명배열은 즉시 배열을 만들어 함수의 인수(매개변수)로 전달할 때 쓰며 배열이 딱 한번만 필요하고 다시는 참조할일이 없을 때 사용할 수 있다.
public class AnonymousArray {

	public static void main(String[] args) {
		System.out.println("숫자들의 합 : "+ sum(new int[] {1,2,3,4})); //numbers[0]=1, numbers[1]=2, numbers[2]=3, numbers[3]=4
	}

	public static int sum(int[] numbers) {
		int total=0;
		for(int i=0; i<numbers.length ; i++) {
			total +=numbers[2];
			}
		return total; //함수호출 한 곳에 total값을 반환시켜줌 
	}
	
	
}
