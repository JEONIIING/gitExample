package ch05;

public class AnonymouseArray2 {

	public static void main(String[] args) {
		System.out.println("숫자들의 합 : "+ sum(new int [] {10,20,30,40}));
	}

	private static int sum(int[] is) {
		int add=0;
		for(int i=0; i<is.length; i++) {
			add += is[i];
		}
		return add;
	}

}
