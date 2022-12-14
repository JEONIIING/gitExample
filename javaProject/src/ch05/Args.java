package ch05;

public class Args {

	
	//입력한 매개변수들은 배열로 저장됨, args 변수는 참조변수
	//이클립스 실행 : Run- Run Configurations - Arguments 탭 - 입력 - Apply - Run
	public static void main(String[] args) { //명령형 매개변수
		
		for(int i=0; i<args.length; i++) {
			System.out.println(i+ "번째 매개변수 : "+ args[i]);
			
		}
		
	}

}
