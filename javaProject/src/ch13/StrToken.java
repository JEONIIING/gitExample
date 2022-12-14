package ch13;

import java.util.StringTokenizer;

public class StrToken {
	// 1) String 클래스의 split()사용하기
	// 2) StringTokenizer클래스 사용하기

	public static void main(String[] args) {
		String str = "kim,20,180,55,서울,학생";
		String[] items = str.split(","); // 콤마기준으로 데이터를 분리
		for(String s : items) { //향상된 for문
			System.out.println(s);
		}
		
		StringTokenizer st = new StringTokenizer(str,",");
		int cnt = st.countTokens(); //토큰의 갯수
		System.out.println("토큰의 갯수 : " + cnt);
	
		while(st.hasMoreElements()) { //다음 토큰이 있을때까지 반복
			System.out.println(st.nextToken()); //토큰하나를 가져와 리턴
		}
	}

}
