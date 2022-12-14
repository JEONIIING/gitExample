package ch08;
//복습 이해하기 
//싱글톤 -> 생성자의 접근제어자가 private일때
public class MyManager {
	private int score;
	
	
	private MyManager(int score) { //생성자의 접근제어자가private이기 때문에 다른 클레스에서 객체를 초기화를 못해줌. 외부접근 차단
		this.score = score;		  //생성자를 private로 선언(싱글톤)-->하나의 인스턴스만 활용하려고 할 때 
	}
	
	private static MyManager mgr ; //private static 참조형변수 선언 
	
	//싱글톤 처리 메서드
	public static MyManager getInstance() { //static 참조형반환타입의 메서드 선언 -->static메서드는 객체생성 없이 사용가능.
		if(mgr==null) {						//처음 MyManager가 객체화 될 때
			mgr= new MyManager(10); 		//public 메서드로 객체초기화 할수있도록 접근함.
		}
		return mgr; //한번이상 객체 생성되었더라면 (즉, 주소값을 가지고 있으면) 그 값을 리턴
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
