package ch13;

public class Adress {

	public static void main(String[] args) {
//		Adress a = new Adress();
//		System.out.println(a);
		
		
		Integer i = new Integer(30);
		System.out.println(i); //내용 출력
		
		String s = new String("java");
		System.out.println(s);//내용출력
		System.out.println(System.identityHashCode(s));//객체주소 출력
	}

}
