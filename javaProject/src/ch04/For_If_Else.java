package ch04;

public class For_If_Else {

	public static void main(String[] args) {

		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum+=i; // sum = sum+i
			System.out.print(i);
			if(i<=9) {
				System.out.print("+");
			}else {
				System.out.print("=");
				System.out.print(sum);
			}
		
		}

	}
	
}