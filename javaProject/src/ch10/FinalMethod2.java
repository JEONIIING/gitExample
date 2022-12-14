package ch10;

class T {
	private int num = 10;
	public final void print(){//오버라이딩이 안된다. 출력결과가 10이 나오는 이유: 자식클래스엔 print()가 없어서 부모껄 가져옴 
		System.out.println(num); //num => this.num
	}
}

public class FinalMethod2 extends T{
	//멤버변수 
	int num=100;
	
	public static void main(String[] args) {
		//상속관계가 만들어 졌을 때는 자식클래스를 객체생성하면 부모클래스는 자동 생성된다.
		FinalMethod2 f = new FinalMethod2();
		f.print(); //상속받은 객체의 final print()를 호출한다. print()는 T클래스의 멤버기 때문에
		System.out.println(f.num);
	}
}
