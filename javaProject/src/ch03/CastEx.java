package ch03;

public class CastEx {

	public static void main(String[] args) {
		float f = 1.6f; //4바이트로 저장 
		System.out.println(f);
		
		f = 100; //float타입으로 자동 형변환 
		System.out.println(f);
		
		f = 100.5f; 
		int i = (int)f; //강제형변환 -> 값손실때문에 형변환을 넣어줘야 한다. 
		System.out.println(f);
	}

}
