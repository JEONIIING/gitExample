package ch14;

import java.util.Scanner;

//Scanner,getter,setter 사용 
public class Product {
	private String num; //제품번호
	private String name; //제품명
	private String from; //제조사
	private int price; //단가
	private int amount; //수량
	private int money; //판매금액

	//메서드 
	public void input() {//스케너 메서드
		Scanner sc = new Scanner(System.in);
		System.out.print("제품번호 : ");
		num = sc.next();
		System.out.print("제품명 : ");
		name = sc.next();
		System.out.print("제조사 : ");
		from = sc.next();
		System.out.print("단가 : ");
		price = sc.nextInt();
		System.out.print("수량 : ");
		amount = sc.nextInt();
	}
	

	//매개변수 있는 생성자
	public Product(String num, String name, String from, int price, int amount) {
		super();
		this.num = num;
		this.name = name;
		this.from = from;
		this.price = price;
		this.amount = amount;
	}

	//생성자
	public Product() {
	}

	//getter,setter
	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public int getMoney() {
		return price*amount;
	}


	public void setMoney(int money) {
		this.money = money;
	}




}
