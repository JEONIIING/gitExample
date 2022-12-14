package ch13;

public class Change { //값을 교환
	public static void main(String[] args) {
		int a =10; //콜라 컵
		int b =20; //사이다 컵
		int temp; //예비용 컵
		
		temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
	}
}
