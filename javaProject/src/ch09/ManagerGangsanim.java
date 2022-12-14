package ch09;

public class ManagerGangsanim extends EmployeeGangsanim {
	private double bonus; //보너스
	
	//매개변수 있는 생성자
	public ManagerGangsanim(int num, String name, String address, String email, 
								int salary, String rnn, double bonus) {
		super(num, name, address, email, salary, rnn);
		this.bonus = bonus;
	}
	
	void test() {
		System.out.println("사원번호 : "+getNum());
		System.out.println("이름 : "+ name );
		System.out.println("주소 : " + address);
		System.out.println("이메일 : "+ email );
		System.out.println("연봉 : " +salary);
		System.out.println("주민번호 : " + getRnn() );
		System.out.println("보너스 : " +(bonus*salary));
		
	}
}
