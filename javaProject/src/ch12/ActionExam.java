package ch12;

abstract class Action //추상클래스
	public abstract void exec(); //추상메서드
	
}

public class ActionExam extends Action{

	@Override
	public void exec() {
		System.out.println("I am Child");
	}
	
	public static void main(String[] args) {
		Action a = new ActionExam() {//익명 내부 클래스
			String name = "kim";
			
			@Override
			public void exec() {
				System.out.println("나는 " + name + " 이다");
			}
		}; //주의점 : 익명내부클래스의 마지막 중괄호 다음에는 세미콜론(;)이 명시되어야 한다.
		a.exec();
	}
}
