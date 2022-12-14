package ch07;

public class Auction {
	private String name; //이름
	private String id;	 //아이디
	private int price;	 //구매금액
	private String grade; 	//등급
	
	//getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getGrade() {
		if(price>=100000) {
			grade = "gold";
		}else {
			grade = "silver";
		}return grade;
	}

	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name +"\t"+ id +"\t"+ price +"\t"+ getGrade());
	}
	
	
	
}
