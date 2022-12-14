package ch04;

import java.util.Scanner;

public class Ecost {
 //전자상거래
	public static void main(String[] args) {
		//변수선언
		String name =""; //이름
 		int price = 0;   //가격
		int point = 0;   //포인트
		int point_use = 0; //포인트 사용액
		int fee = 0;    //배송료
		int pay;     //실제 결제금액
		
		//데이터 자료입력
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		System.out.print("구매금액 : ");
		price =sc.nextInt();
		System.out.print("보유포인트 : ");
		point = sc.nextInt();
		sc.close();
		
		//계산
		if(price < 20000) {//구매금액이 2만원 미만이면
			fee = 2500;
		}
		if(point >= 10000) {//포인트 금액이 1만원 이상이면 
			point_use = point;
			pay = price + fee - point;
		}else {
			pay = price + fee;
		}
		//출력
		System.out.println("이름\t구매금액\t배송료\t포인트사용\t결제금액");
		System.out.println(name+"\t"+price+"\t"+fee+"\t"+point_use+"\t"+pay);
		
	}

}
