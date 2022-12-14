package ch07;

public class Person2 {
	
	private String name;
	private int age;
	private String email;
	private String adress;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age <0 || age > 130) {
			System.out.println("나이를 다시 입력해주세요.");
		}else {
		this.age = age;
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public void print() {
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
		System.out.println("이메일 : " + email);
		System.out.println("주소 : " + adress);
	}
	
}
