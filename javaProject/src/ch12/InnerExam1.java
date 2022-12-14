package ch12;

//내부클래스
public class InnerExam1 {
	class Cal{ //멤버(필드)변수를 선언하는 위치에 있을 경우는 인스턴스 클래스라(중첩클래스)고 한다.
		int value = 0;
		public void plus() {
			value++;
		}
		
	}//end inner class

	public static void main(String[] args) {
		InnerExam1 t = new InnerExam1(); //1.외부객체 생성
		//외부클래스이름.내부클래스이름 참조변수 = 외부참조변수.new 내부클래스생성자();
		InnerExam1.Cal cal = t.new Cal(); //2.내부객체 생성 
		cal.plus();
		System.out.println(cal.value);
	}
}

