package ch10;

public class Ch3 extends Pa3{
	String hp = "010-1234-5678";
	String addr = "주소 강남구 역삼동";
	
	@Override
	public void test() {
		super.test(); //부모클래스 test()호출
		System.out.println("전화 : "+hp);
		System.out.println("주소 : "+addr);
	}

}
