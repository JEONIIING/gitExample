package ch10;

class Sub {
	public int num = 10; //super.num
	public void print(){//오버라이딩이 안된다.
		System.out.println(num);
	}
}

public class FinalMethodEx extends Sub{
	//멤버변수 
	int num=100; //this.num
	@Override
	public void print() {
		System.out.println(num);
	}
	public static void main(String[] args) {
		//상속관계가 만들어 졌을 때는 자식클래스를 객체생성하면 부모클래스는 자동 생성된다.
		Sub f = new FinalMethodEx();
		f.print();
	}
}
