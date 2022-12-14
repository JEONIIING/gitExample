package ch08;

//싱글톤 , 메서드를 통해 인스턴스화 하기.
public class MyManagerUse {
//클래스메서드 불러오기, 참조형반환타입 복습하기.
	
	public static void main(String[] args) {
//		MyManager m = new MyManager(); //에러발생 MyManager() 생성자를 정의 할 수 없다. 확실하지 않다.
		
		//MyManager클래스의 static메서드 getInstance() 호출 후 객체 반환된 객체 주소값을 객체타입 참조변수 mgrobj에 할당함.
		MyManager mgrobj = MyManager.getInstance(); 
		System.out.println(mgrobj); //->객체 주소값이 출력
		System.out.println("mgrobj.getScore() : " + mgrobj.getScore()); //->mgrobj가 가리키고 있는 getScore()메서드 호출
		mgrobj.setScore(100); //->mgrobj가 가리키고 있는 객체 setScore()메소드에 iv값 score변수에 100을 할당.
		System.out.println("mgrogj.setScore() : " + mgrobj.getScore());
		
		
		//2)두번째 생성 및 호출
		MyManager newobj = MyManager.getInstance(); //메서드 안에 있는 mgr의 주소가 있기때문에 mgr의 주소값이 반환됨
		System.out.println(newobj); //위 참조변수 mgrobj의 주소값과 같음
		System.out.println("newobj.getScore : "+ newobj.getScore());
	}

}
