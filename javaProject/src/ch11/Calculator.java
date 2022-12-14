package ch11;

public interface Calculator {
	public int Plus(int i,int j);
	public int multiple(int i, int j);
	default int exec(int i, int j) { //jdk1.8부터 사용가능
		return i +j;
		
	}
}
