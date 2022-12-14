package ch05;

public class CharArray {

	public static void main(String[] args) {
	
		//String[] str = {"Java", "DB", "JSP", "HTML"};
		//정식문법
		String [] str;
		str = new String [4]; 
		
		for(int i =0; i<str.length ; i++) {
			System.out.println(str[i]);
		}
		
		System.out.println();
		
		//확장 for문(향상된 for문, for~each문) => jdk1.5이상부터 사용가능
		//for(개별값 저장 변수 : 집합변수) { } //++기능 자체가 내장 되어 있음.
		for(String a: str) {
			System.out.println(a);
		}
		
	
	}

}
