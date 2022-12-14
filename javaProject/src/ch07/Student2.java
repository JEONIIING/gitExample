package ch07;


//getter,setter 를 안만들고 접근하는 기법 
public class Student2 {
	//멤버변수 iv
	private String name;
	private String major; //전공
	private int year; //학년
	private String num; //학번
	private double point; //평균 학점
	private int money; //등록금
	private int save; //장학금
	
	public void input(String name, String major , int year, String num , double point ,int money) {
		this.name = name;
		this.major = major;
		this.year = year;
		this.num = num;
		this.point = point;
		this.money = money;
		//장학금계산 
		if(point >=4.3) {
			save = money; //장학금 = 등록금
		}else if(point >= 4.0) {
			save = 250;
		}else if(point >= 3.5) {
			save = 100;
		}
		
	}
	public void print() {
		System.out.println("이름\t전공\t학년\t학번\t평점평균\t등록금\t장학금");
		System.out.println(name +"\t"+ major +"\t"+ year +"\t"+ num +"\t"+ point +"\t"+ money +"\t"+ save);
	}
	
	//개발자용 메서드
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", major=" + major + ", year=" + year + ", num=" + num + ", point=" + point
				+ ", money=" + money + ", save=" + save + "]";
	}
	
}