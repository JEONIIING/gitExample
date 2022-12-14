package ch03;

public class CastEx2 {

	public static void main(String[] args) {
		int a = 500;
		float b = 200.2f;
		int c = 127;
		double d = a; //큰그릇에 작은건 넣을 수 있다.
		System.out.println("int a => double : " + d);
		
//		int e = b; //작은 그릇에는 큰걸 넣을 수 없다.
		int e = (int)b; //강제 형변환 (명시적 형변환)
		System.out.println("int b => int : "+ e);
		
		byte f = (byte)c; //강제 형변환
		System.out.println("int c => byte : " + f);
		
		
	}

}
