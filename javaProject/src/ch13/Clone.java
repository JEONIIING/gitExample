package ch13;

//인스턴스를 복제하려면 Cloneable 인터페이스를 구현해야함
public class Clone implements Cloneable {
	int num = 10;
	void print() {
		System.out.println(num);

	}
	public static void main(String[] args) {
		Clone c1 = new Clone();
		Clone c2 = null;
		try {//예외(에러)가 발생할 가능성의 코드 처리
			c2 = (Clone)c1.clone(); //인스턴스를 복제함, Object의 메서드이기 때문에 좌변과 맞추기 위해 (Clone)형변환해야 한다. ->참조변수형 변환
		} catch (CloneNotSupportedException e) {//예외가 발생한 시점에서 실행 될 코드
			e.printStackTrace(); //개발자를 위한 디버깅 정보 제공 용도의 메서드
		}
		
		System.out.println(c1);
		System.out.println(c2);
		c1.print();
		c2.print(); //c2주소가 없어서 NullPointerException 에러 발생
	}
}

