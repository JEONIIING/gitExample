package ch09;

public class EmployeeGangsanim {
	private int num;
	public String name;
	String address;
	String email;
	protected int salary;
	private String rnn;
	
	
	public int getNum() {
		return num;
	}
	public String getRnn() {
		return rnn;
	}
	
	//생성자
	public EmployeeGangsanim() {
	}
	
	//매개변수있는 생성자
	public EmployeeGangsanim(int num, String name, String address, String email, int salary, String rnn) {
		this.num = num;
		this.name = name;
		this.address = address;
		this.email = email;
		this.salary = salary;
		this.rnn = rnn;
	}
	//toString : 개발자를 위한 디버깅용 메서드
	@Override
	public String toString() {
		return "EmployeeGangsanim [num=" + num + ", name=" + name + ", address=" + address + ", email=" + email
				+ ", salary=" + salary + ", rnn=" + rnn + "]";
	}
	
	
	
	
	
}
