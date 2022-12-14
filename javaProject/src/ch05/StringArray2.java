package ch05;

import java.util.Arrays;

public class StringArray2 {

	public static void main(String[] args) {
		String[] str= {"Java","DB","JSP","Spring"};
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println();
		//향상된 for문으로 처리하기
		//for(데이터타입 개별변수 : 집합변수) {}
		for (String ss : str) { //내부적으로 카운팅, 배열길이값을 계산하는 기능이 있다.
			System.out.println(ss);
		}
		
		System.out.println(Arrays.toString(str));
		
	}

}
