package ch06;

public class VariantParam {
	
//	static void print(String a) {
//		System.out.println(a);
//	}
//	static void print(String a, String b) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	static void print(String a, String b, String c) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	static void print(String a, String b, String c, String d) {
//		// TODO Auto-generated method stub
//		
//	}
	
	static void print(String ...n) { //n이 가변형 매개변수 n배열
		for(int i=0; i<n.length; i++) {
			System.out.println(n[i]);
		}
	}
	public static void main(String[] args) {
		print("java");
		print("java","program");
		print("java","program", "jsp");
		print("java","program", "jsp", "data");
		
	}






	
	
}
