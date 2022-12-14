package ch09;
//Ball의 부모클래스
public class Circle {
	//멤버 메서드
	private void secret() {//private는 상속이 안된다.
		System.out.println("비밀이다.");
		
	}
	protected void findRadius() { //protected는 다른패키지의 상속받은 자식클래스까지 사용 가능
		System.out.println("반지름 구하기");
	}
	
	public void findArea() {
		System.out.println("넓이 구하기");
	}
	public Circle() { //기본생성자는 쓰던 안쓰던 습관적으로 코딩 해주는게 좋다.
		
	}
	public Circle(int r) {//생성자는 상속의 대상이 아니다.
		System.out.println("반지름 : " + r);
	}
}
