package ch07;

//한개의 파일에 2개이상의 class 파일을 작성시에는 public class의 클래스이름으로 저앙, public처리
//나머지 클래스는 default로 처리 
class Phone {
	String model;
	int value;
	void print() {
		System.out.println(value + "만원 짜리 "+ model+ "스마트폰");
	}
	
}

public class PhoneDemo {

	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.model = "아이폰 14 pro";
		myPhone.value = 170;
		myPhone.print();
		
		Phone yourPhone = new Phone();
		yourPhone.model = "아이폰 13 mini";
		yourPhone.value = 110;
		yourPhone.print();
		
		
		
		
	}

}
