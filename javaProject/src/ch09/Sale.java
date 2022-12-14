package ch09;

public class Sale extends Product {
	private int price; //금액
	private int amount; //수량
	private int money; //판매금액
	
	public void input(int code, String name, String company, String date,
						int price, int amount) {
		//부모의 private처리된 멤버변수의 값을 초기화할때는 setter를 활용
		setCode(code);
		setName(name);
		setCompany(company);
		setDate(date);
		//자녀쪽은 private처리 되었어도 같은 클래스 안에서는 얼마든 변수에 직접접근가능.
		this.price = price;
		this.amount = amount;
	}
	
	public void calc() {
		money = price * amount;
	}
	
	public void pirnt() {
		System.out.println("코드\t제품명\t제조사\t제조일자\t단가\t수량\t금액(단위:천원)");
		System.out.println(getCode() +"\t"+ getName() +"\t"+ getCompany() +"\t"+ getDate()
								+"\t"+ price +"\t"+ amount +"\t"+ money);
	}
	
	
}
