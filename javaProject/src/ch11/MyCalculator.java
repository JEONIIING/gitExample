package ch11;

public class MyCalculator implements Calculator {

	@Override
	public int Plus(int i, int j) {
		return i + j;
	}

	@Override
	public int multiple(int i, int j) {
		return i * j;
	}

}
