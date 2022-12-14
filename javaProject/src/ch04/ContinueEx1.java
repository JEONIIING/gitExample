package ch04;

public class ContinueEx1 {

	public static void main(String[] args) {
		for(int i =1; i<=10; i++) {
			if(i % 5 ==0) { //5의 배수를 만나면 
				continue;  //이하 코드를 무시(skip)하고, 다음 단계로
			}
			System.out.println(i);
		}
		
	}

}
