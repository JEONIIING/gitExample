package ch10;

public class StaticVar {
	 static int a =10; //cv :어디서든 쓸수있다. im ,cm 이든 사용시 클래스이름.변수이름
	 int b= 20; //iv : cm안에서 쓰려면 객채 생성 후 사용가능
	 
	 public static void main(String[] args) {
		System.out.println(StaticVar.a); //클래스이름.static 멤버변수로도 접근 가능.
//		System.out.println(b);
		
		StaticVar s = new StaticVar();  //iv 사용하려고 객체 생성
		System.out.println(s.b); 
 	}
}
