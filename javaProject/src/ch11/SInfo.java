package ch11;

public class SInfo implements Student {
	String name;
	String adr;
	String email;
	
	int kor, eng, mat, tot;
	double avg;
	
	public SInfo() { //기본생성자 
		this("홍길동","서울 강남구","hong@gmail.com", 90, 85, 70);
	}
	
	public SInfo(String name, String adr, String email, int kor, int eng, int mat) { //매개변수 있는 생성자
		this.name = name;
		this.adr = adr;
		this.email = email;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	@Override
	public void address() {
		System.out.println("=================================================");
		System.out.println("이름\t주소\t\t이메일");
		System.out.println(name +"\t"+ adr +"\t"+"\t"+ email);
		System.out.println("-------------------------------------------------");
	}

	@Override
	public void point() {
		tot = kor + eng + mat;
		avg = tot/3.0;
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name +"\t"+ kor +"\t"+ eng +"\t"+ mat +"\t"+ tot +"\t"+
							String.format("%.1f", avg));
		System.out.println("=================================================");
	}

}
