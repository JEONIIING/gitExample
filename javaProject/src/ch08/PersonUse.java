package ch08;

public class PersonUse {

	public static void main(String[] args) {
		Person p = new Person(); //객체 생성 시 기본생성자 호출
		p.showInfo();
		
		Person p2 = new Person("추신수"); //Person(String name)형태의 생성자 호출 
 		p2.showInfo();
 		
 		Person p3 = new Person("박찬호", 185); //Person(String name, int height)형태의 생성자 호출
 		p3.showInfo();
 		
 		Person p4 = new Person("구자욱", 175,72); //Person(String name, int height, int weight)형태의 생성자 호출 
 		p4.showInfo();
	
	}

}
