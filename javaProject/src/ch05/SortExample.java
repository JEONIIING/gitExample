package ch05;

import java.util.Arrays;
import java.util.Collections;

public class SortExample {

	public static void main(String[] args) {
		int num[] = {29,1,81,70,13,92,36};
		
		Arrays.sort(num); //기본적으로 오름차순 정렬을 해준다. 
		for(int n : num) { //확장된 for문 (객체타입 개별변수: 집합변수)
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("==============================");
		
		//내림차순은 특별히 Integer라는 Wrapper Class타입으로 데이터 처리가 되어야 하고 (객체타입 사용)
		//Collections.reverseOrder()라는 메소드를 써서 처리해야 한다.
		Integer rev[] = {29,1,81,70,13,92,36}; 
		Arrays.sort(rev, Collections.reverseOrder());  //내림차순 정렬
		for(int i : rev) {
			System.out.print(i+ " ");
		}
	}

}
