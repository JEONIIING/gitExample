package ch07;

public class StudentUse2 {

	public static void main(String[] args) {
		Student2 s2 = new Student2(); //객체생성 
		s2.input("이순신", "컴공", 1, "202211", 3.8, 500); //데이터 입력
		s2.print(); //데이터 출력
		System.out.println(s2); //toString 개발자용 메서드를 통해 멤버변수에 뭐가 저장되어있는지 알려준다.
	}

}
