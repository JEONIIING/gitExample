package ch11;

public class MyCalculatorExam {

	public static void main(String[] args) {
		Calculator c = new MyCalculator();
		int value1 = c.multiple(5, 10);
		int value2 = c.Plus(3, 10);
		int value3 = c.exec(5, 10);
	
	
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
