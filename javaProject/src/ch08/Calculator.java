package ch08;
//생성자 (Constructor) 코딩특징:
//개발자가 생성자를 만드는것에 개입을 안하면 컴파일러는 자동으로 기본생성자를 만들지만
//매개변수가 있는 생성자를 단 하나라도 만든다면 컴파일러는 더 이상 기본생성자를 만들지 않는다.
public class Calculator {
	//멤버변수 선언 iv
	private int left;
	private int right;
	
	//기본생성자 :JVM 보이지않게 만들어줬었음
	public Calculator() { //기본생성자는 명시적으로 개발자가 처리안하면 JVM이 눈에 안보이게 자동으로 만들어준다.
		System.out.println("기본생성자 호출...");
	}

	//매개변수가 있는 생성자 소스- 제너레이트 컨스트럭트 유징 필드
	public Calculator(int left, int right) {
		System.out.println("매개변수가 있는 생성자 호출...");
		this.left = left;
		this.right = right;
	}

	//getter ,setter
	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}
	
	public void sum() {
		System.out.println(left+right);
	}
	
	public void avg() {
		System.out.println((left+right)/2);
	}
	
}
