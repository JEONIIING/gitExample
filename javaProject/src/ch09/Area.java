package ch09;

public class Area {
	//멤버변수
	private int width; // int 기본 0으로 초기화
	private int length;

	//생성자
	public Area() {    }

	//매개변수 있는 생성자
	public Area(int width, int length) {
		this.width = width;
		this.length = length;
	}

	//getter, setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	//일반메서드
	public int getArea() {
		return width * length;
	}
	
}
