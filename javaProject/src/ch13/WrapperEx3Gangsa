package test;

public class WrapperEx3 {
	public static void main(String[] args) {
		String str = "Hello 1234";
		String str2 = str.substring(6);
		String hyphen="-----------------------------------";

		System.out.println(hyphen+"\n(Character 사용)");
		for(int i=0; i<str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				if(Character.isUpperCase(str.charAt(i))) {
					System.out.println(str.charAt(i)+"는 대문자입니다.");
				}else if(Character.isLowerCase(str.charAt(i))) {
					System.out.println(str.charAt(i)+"는 소문자입니다.");
				}
			}else if (Character.isDigit(str.charAt(i))) {
				System.out.println(str.charAt(i)+"는 숫자입니다.");
			}
		}
		System.out.println(hyphen+"\n(Integer 사용)");
		System.out.println("문자 "+str2+"입니다.");
		System.out.println("숫자 "+Integer.parseInt(str2)+"입니다. ");
		System.out.println("숫자 1234 + 2 = "+(Integer.parseInt(str2)+2)+" 입니다.");
	}
}
