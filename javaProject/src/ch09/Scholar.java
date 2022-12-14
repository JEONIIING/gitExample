package ch09;

public class Scholar extends Student{
	private String category; //장학금 종류
	private int money; //장학금액
	
	//메서드
	public void input(String name, String num, String major, int year,  
						String category, int money) {
//		setName(name);
//		setNum(num);
//		setMajor(major);
//		setYear(year);
		super.intput(name, num, major, year); //부모클래스 참조변수 super -->부모클래스에 있는 input()호출
		this.category = category; //자녀쪽
		this.money = money;
	}
	public void print() {
		System.out.println("이름\t학번\t전공\t학년\t구분\t장학금액");
		System.out.println(getName() +"\t"+ getNum() +"\t"+ getMajor() 
							+"\t"+ getYear() +"\t"+ category +"\t"+ money);
	}
	
	public void print2() {
		System.out.println("이름\t학번\t전공\t학년");
		System.out.println(getName() +"\t"+ getNum() +"\t"+ getNum() +"\t"+ getYear());
	}
}
