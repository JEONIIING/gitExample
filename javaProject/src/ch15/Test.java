package ch15;

public class Test {

	public static void main(String[] args) {
		int a = 500;
		String str = "JAVA";
		
		//try ~ catch문으로 예외처리해보세요.
		try {
			System.out.println(a);   // 정상 - 출력
			int num = Integer.parseInt("ABC");
			System.out.println(num); // 비정장 예외발생 첫번째 캐치문으로 감.
			System.out.println(str); // 위에 코드에서 에러 발생으로 실행안됨.
		} catch (ArithmeticException e) { //해당 예외 catch문이 아니여서 두번쨰 캐치문으로 감.
			System.out.println("0으로 나뉘어졌습니다.");
		}	
//		} catch (NumberFormatException e) {
//			System.out.println("숫자를 입력해주세요.");
//			e.printStackTrace();
		 catch (Exception e) {
			System.out.println("Exception 예외처리");
		}
	}

}
