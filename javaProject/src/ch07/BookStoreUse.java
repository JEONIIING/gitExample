package ch07;

public class BookStoreUse {

	public static void main(String[] args) {
		//객체생성
		//참조변수 데이터 타입 참조변수 = new 생성자;  클래스이름뒤에 ();가 붙으면 생성자 ->생성자는 메서드이다.
		BookStore bs = new BookStore(); //객체생성시 기본생성자 호출함. 
		//데이터 입력
		bs.setBookName("Java");
		bs.setAuthor("남궁성");
		bs.setPress("영진출판");
		bs.setYear(2022);
		bs.setAmount(7);
		bs.setPrice(25800);
		//출력
		bs.print();
	}

}
