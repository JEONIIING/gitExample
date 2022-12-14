package ch04;

public class Matrix {

	public static void main(String[] args) {
		//중첩 for문은 행열할때 유리함
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.printf("[%d,%d]",i,j);
			}
			System.out.println();
		}
		
		
	}

}
