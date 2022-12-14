package ch05;


//3차원 배열 : 배열 = new 자료형[면][행][열]
public class Array3Dim {

	public static void main(String[] args) {
		//2면 3행 4열
		String[][][] subject = {//1며
								{{"JS01","AL02","PY03","DS04"},   //과목코드
								{"JSP","알고리즘","파이썬","자료구조"},//과목명
								{"홍길동","김강찬","이영구","장필수"}},  //지도교수
								
								//2면	
								{{"CS01","CS02","CS03","CS04"},
								 {"생활영어","경제학","생활체육","음악"},
								 {"김영철","정경제","최배달","조수미"}}};
		//subject[0][0][0] =JS01, subject[0][0][1]= AL02....
		
		for(int i=0; i<subject.length; i++) {
			for(int j=0; j<subject[i].length; j++) {
				for(int k=0; k<subject[i][j].length; k++) {
					System.out.println("["+i+"]["+j+"]["+k+"] : " +subject[i][j][k]);
				}
			}
			System.out.println("===============================================");
		}
	}

}
