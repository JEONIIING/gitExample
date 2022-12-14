package ch06;

public class StudentPoint {
	
	static int[] ban = {1001, 1002, 1003};
	static String[] name = {"홍길동", "사임당","이순신"};
	static int [] java = {90, 95, 84};
	static int [] db = {85, 79, 92};
	static int [] html = {99, 88 ,95};
	static int [] jsp = {76, 92, 72};
	static int [] tot = { 0, 0, 0};
	static double [] avg = {0, 0, 0};
	
	//총점계산
	static void getTot() {
		for(int i=0; i<tot.length; i++) {
			tot[i] = java[i] + db[i] + html[i] + jsp[i];
		}
	}
	
	//평균계산
	static void getAvg() {
		for(int j=0; j<avg.length ; j++) {
			avg[j] = tot[j]/4.0;
		}
	}
	
	
	//출력용도
	static void print() {
		for(int i=0; i<ban.length;i++) {
			System.out.println(ban[i]+"\t"+name[i]+"\t"+java[i]+"\t"+db[i]+"\t"+html[i]+"\t"+
								jsp[i]+"\t"+tot[i]+"\t"+String.format("%.1f", avg[i]));
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("전체학생수 : " +ban.length+ "명");
		System.out.println("--------------------------------------------------------------");
		System.out.println("학번\t이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		System.out.println("--------------------------------------------------------------");
		getTot();
		getAvg();
		print();
		System.out.println("--------------------------------------------------------------");
	}	
}


