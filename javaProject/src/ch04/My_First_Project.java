package ch04;

import java.util.Scanner;

public class My_First_Project {
	//스케너 사용하기
	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		int numYang = 0;
		int numJung = 0;

		Scanner sc = new Scanner(System.in);
		
		outer: //라벨
			while(true) {
				System.out.println("= = [메 뉴] = =");
				System.out.println("[1] 한식");
				System.out.println("[2] 양식");
				System.out.println("[3] 중식");
				System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0) > ");
				
				String tmp = sc.next();
				menu = Integer.parseInt(tmp);

				if(menu==0) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}else if(menu < 1 || menu > 3) {
					System.out.println("잘못 선택하셨습니다. 메뉴(1~3)을 선택하세요. > ");
					continue;
				}if(menu==1) {
				
				hansik:	
					for ( ; ; ) {
						System.out.println("(1) 김치찌깨");
						System.out.println("(2) 된장찌개");
						System.out.println("(3) 삼겹살");
						System.out.println("(3) 비빔밥");
						System.out.print("한식메뉴를 선택하세요. (한식메뉴 선택종료:0, 전체종료:99)");

						String str =sc.next();
						num = Integer.parseInt(str);

						switch(num) {
							case 0:
								System.out.println("한식메뉴 선택을 종료합니다.");
								break hansik;
							case 1:	
								System.out.println("고객님은 김치찌개를 선택하셨습니다.");
								continue;
							case 2:
								System.out.println("고객님은 된장찌개를 선택하셨습니다.");
								continue;
							case 3:
								System.out.println("고객님은 삼겹살을 선택하셨습니다.");
								continue;
							case 4:
								System.out.println("고객님은 비빔밥을 선택하셨습니다.");
								continue;
							case 99:
								System.out.println("프로그램을 모두 종료합니다.");
								break outer;
						}
					}
				}
				else if(menu==2) {
					
					yangsik:
						for( ; ; ) {
							System.out.println("(1)돈까스");
							System.out.println("(2)비프스테이크");
							System.out.println("(3)카레라이스");
							System.out.print("양식메뉴를 선택하세요.(양식메뉴선택종료:0, 전체종료:99)");
							
							String yg = sc.next();
							numYang = Integer.parseInt(yg);
							
							switch(numYang) {
								case 0:
									System.out.println("양식메뉴 선택을 종료합니다.");
									break yangsik;
								case 1:	
									System.out.println("고객님은 돈까스를 선택하셨습니다.");
									continue;
								case 2:
									System.out.println("고객님은 비프스테이크를 선택하셨습니다.");
									continue;
								case 3:
									System.out.println("고객님은 카레라이스를 선택하셨습니다.");
									continue;
								case 99:
									System.out.println("프로그램을 모두 종료합니다.");
									break outer;
							
							
							}
							
						}
					
					
					
				}else if(menu==3) {
					
					jungsik:
						for( ; ; ) {
							System.out.println("(1)짜장면");
							System.out.println("(2)짬뽕");
							System.out.println("(3)탕수육");
							System.out.print("중식메뉴를 선택하세요.(중식메뉴선택종료:0, 전체종료:99)");
							
							String js = sc.next();
							numJung = Integer.parseInt(js);
							
							switch(numJung) {
								case 0:
									System.out.println("중식메뉴 선택을 종료합니다.");
									break jungsik;
								case 1:	
									System.out.println("고객님은 짜장면을 선택하셨습니다.");
									continue;
								case 2:
									System.out.println("고객님은 짬뽕을 선택하셨습니다.");
									continue;
								case 3:
									System.out.println("고객님은 탕수육을 선택하셨습니다.");
									continue;
								case 99:
									System.out.println("프로그램을 모두 종료합니다.");
									break outer;
								
							
							}
									
									
						}
				}
				
				
			}
			
		 sc.close();

		}

	

}
