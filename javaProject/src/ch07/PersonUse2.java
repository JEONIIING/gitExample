package ch07;

public class PersonUse2 {

	public static void main(String[] args) {
		Person2 pp1 = new Person2();
		pp1.setName("홍길동");
		pp1.setAge(30);
		pp1.setEmail("hong@naver.com");
		pp1.setAdress("서울 강남구 역삼동");
		pp1.print();
		
		System.out.println();
		
		Person2 pp2 = new Person2();
		pp2.setName("사임당");
		pp2.setAge(25);
		pp2.setEmail("saimdang@gmail.com");
		pp2.setAdress("서울 강남구 서초동");
		pp2.print();
	}

}
