package ch05;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] list = {10,20,30,40,50};
		//배열복사방법1
		int [] numbers = list; //배열 참조변수가 가리키고 있는 주소값이 동일.
				
		for(int i=0; i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("============");
		
		//배열복사방법 2
		int [] list_copy = Arrays.copyOf(list, list.length); //새로운 저장공간에 값복사
		for(int aa : list_copy) {
			System.out.println(aa);
		}
		
		System.out.println(list);
		System.out.println(numbers);
		System.out.println(list_copy); //다른 배열임. 값만 같을뿐
	}

}
