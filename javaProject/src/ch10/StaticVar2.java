package ch10;

public class StaticVar2 {
	static int total; //static메모리 영역에 바로 로딩
	String model; //heap영역에 생성 됨(nonstatic, new)
	
	public StaticVar2(String model) {//매개변수있는 생성자
		this.model = model;
		total++;
	}
}
