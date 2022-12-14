package ch09;

public class ScholarUse {

	public static void main(String[] args) {
		Scholar s1 = new Scholar(); //객체생성
		s1.input("김철수", "2203", "컴공", 1, "1종", 250000);
		s1.print();
		
		s1.intput("홍길동", "2001", "사회", 1);
		s1.print2();
		
		//연습
		//다형성 부모클래스 타입 참조변수로 자식객체 생성.
		System.out.println();
		Student t = new Scholar();
		t.intput("서지현", "2022", "세무회계", 2);
		System.out.println("이름\t입학연도\t전공\t학년");
		System.out.println(t.getName()+"\t"+ t.getNum()+"\t"+t.getMajor()+"\t"+t.getYear());
	}

}
