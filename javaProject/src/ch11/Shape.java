package ch11;

public abstract class Shape { //추상 클래스
	int x, y;
	public void move(int x, int y) { //move메서드
		this.x = x;
		this.y = y;
	}
	
	public abstract void draw(); //바디가 없는{} 추상 메서드
	
	
}
