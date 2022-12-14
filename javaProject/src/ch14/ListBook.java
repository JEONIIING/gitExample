package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListBook {

	public static void main(String[] args) {
		List<Book> l = new ArrayList<>();
		System.out.println("3건의 도서 자료를 입력하세요!");
		Book b = new Book();
		b.input();
		Book b2 = new Book();
		b2.input();
		Book b3 = new Book();
		b3.input();
		
		//리스트에 Book인스턴스 추가
		l.add(b);
		l.add(b2);
		l.add(b3);
		
		System.out.println("도서명\t출판사\t단가\t수량\t판매금액");
		for(int i=0; i<l.size() ; i++){
			Book q = l.get(i);
			System.out.println(q.getBookName()+"\t"+ q.getPress()+"\t"+q.getPrice()+"\t"+q.getAmount()
									+"\t"+q.getMoney());
		}
//		for(Book q : l) {
//			System.out.println(q.getBookName()+"\t"+ q.getPress()+"\t"+q.getPrice()+"\t"+q.getAmount()
//									+"\t"+q.getMoney());
//		}
	
	}

}
