package ch06;

public class VoidExam {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		hello();
		System.out.println("프로그램 끝");
	}

	public static void hello() { //void 리턴값이 없음을 의미 그럼에도도 return쓸 수 있음. 반환타입x
		System.out.println("안녕하세요?");
		return; //명시적으로 메서드를 종료한다라는 의미, 생략가능.
	}

}
