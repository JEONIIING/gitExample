package ch13;

public class WrapperEx3 {
	
	public static void main(String[] args) {
		System.out.println("(Character 사용)");
		char[] ch = {'H','e','l','l','o',' ','1','2','3','4'};

		for(int i=0; i<ch.length ;i++) {
			if(Character.isUpperCase(ch[i])) {
				System.out.println(ch[i] + "는 대문자입니다.");
			}else if(Character.isLowerCase(ch[i])) {
				System.out.println(ch[i] + "는 소문자입니다.");
			}else if(Character.isDigit(ch[i])) {
				System.out.println(ch[i]+ "는 숫자입니다.");
			}else {
				System.out.println(ch[i]+ "는 기타문자입니다.");
			}
		}
		
		String str = "1234";
		int a = Integer.parseInt(str);
		System.out.println();
		System.out.println("(Integer 사용)");
		System.out.println("문자 " + Integer.toString(a) + "입니다.");
		System.out.println("숫자 " + Integer.parseInt(str) + "입니다." );
		System.out.println("숫자 "+ (Integer.parseInt(str)) +" + 2 = " + (Integer.parseInt(str)+2) +"입니다.");
			
		
		
	}
}
