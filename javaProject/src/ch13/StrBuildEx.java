package ch13;

//문제3]
public class StrBuildEx {
	
	public static void main(String[] args) {
		String str1 = "I am a ";
		String str2 = "Java Programmer";
		
		StringBuilder sb = new StringBuilder(str1);
		
		System.out.println("append()메소드를 활용 : \""+sb.append(str2)+"\"");
		System.out.println("replace()메소드를 활용 : \"" +sb.replace(7, 11, "JSP")+"\"");
		System.out.println("substring()메소드를 활용 : \""+sb.substring(7)+"\"");
	}

}
