package ch10;
public class StaticVarUse {

	public static void main(String[] args) {
		//다른클래스의 static 변수로 접근할때는 클래스이름.static멤버변수이름 으로 불러온다.
		System.out.println(StaticVar.a);
	}

}
