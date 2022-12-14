package ch11;

public class AbstractExtends extends AbstractClass {
	//abstract클래스를 상속받으면 반드시 추상화메서드를 구체화 시켜 선언해줘야 한다.
	//오버라이딩은 부모쪽에 있는 미완성된 메소드를 구현한다는 의미도 포함
	@Override
	void method1() { //중괄호만 있어도 구현한 걸로 본다.
		System.out.println("추상 method를 완성한 method");
	}
	
	public static void main(String[] args) {
//		AbstractClass a = new AbstractClass(); 
//		추상화클래스는 객체 생성할 수 없다 = 추상화 클래스는 메모리에 올릴 수 없다.
//		주의점 : 추상메서드가 있는 추상클래스, 인터페이스이건 new를 통해서 인스턴스화할 수 없다. 즉, 스스로 객체생성이 안된다.
		AbstractExtends ex = new AbstractExtends();
		ex.method1();
		ex.method2();
		
	}
	
}
