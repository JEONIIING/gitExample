package ch08;

public class BookUse {

	public static void main(String[] args) {
		Book b = new Book("Java", "남궁성", "영진", 2020, 24500, 35);
		b.print();
	
		Book b2 = new Book();
		b2.print();
	}

}
