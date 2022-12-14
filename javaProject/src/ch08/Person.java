package ch08;

public class Person {
	//멤버변수
	private String name;
	private int height;
	private int weight;


	public Person(){ //기본생성자 (default constructor)
		this("홍길동", 170, 60);
		
	}
	public Person(String name){
		this(name, 190,100);
		
	}
	public Person(String name, int height) {
		this(name, height,70);
	}
	public Person(String name, int height , int weight) {
	this.name = name;
	this.height = height;
	this.weight = weight;
	}
	
	//출력용도
	public void showInfo() {
		System.out.println("===신상 정보===");
		System.out.println("이름 : " +name);
		System.out.println("신장 : "+ height);
		System.out.println("체중 : "+ weight);
	}
}
