package ch02;

public class ConstantEx {

	public static void main(String[] args) {
		//final을 붙여 변수의 상수처리 // 상수: 변하지 않는 값 처리, 상수의 이름은 대문자 표시를 권고
		final double KM_PER_MILE = 1.609344;
		double km;
		double mile = 60.0;
		km = KM_PER_MILE * mile;
		System.out.println("60마일은 " + km + "킬로미터 입니다.");
	}

}
