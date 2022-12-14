package ch13;

public class StrBuilder {

	public static void main(String[] args) {
		//과거에는 StringBuffer 썼었음 StringBuffer str = new StringBuffer
		StringBuilder str1 = new StringBuilder();
		str1.append("java"); // 문자열 내용 추가, 메모리절약
		System.out.println(str1.toString()); //문자열로 변환해서 출력
		
		str1.append(" programming");
		System.out.println(str1);
		
		str1.replace(0, 4, "jsp"); //0~3 인덱스 내용을 jsp로 변경
		//참고로 replace()메서드는 주로 String객체의 replace()를 많이 쓰는 편이다.
		System.out.println(str1);
		
		String str2 = str1.substring(3);
		System.out.println(str1);
		
		System.out.println(str2);
		
		
		//StringBuilder -> str1
		//String -> str3
		//StringBuilder를 String으로 바꿀 때는 toString()을 사용 (중요!!)
		//String str3 = str1; -> 에러
		String str3 = str1.toString();
		System.out.println("StringBuilder(str1) -> String(str3)에 저장 : " +str3);
		//str1 = str3; -> 에러
		//Stirng를 StirngBuilder에 저장할 때
		str1 = new StringBuilder(str3);
		System.out.println("String(str3) -> StringBuilder에 저장 : " +str1);
		
	}

}
