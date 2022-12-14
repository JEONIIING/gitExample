package ch14;

import java.util.Vector;

//컬렉션(Collection) - 배열의 단점을 보완한 클래스들
//배열의 단점 - 사이즈 조절이 안됨. 삽입, 삭제가 어려움, 다양한 자료형을 저장할 수 없음
//Map계열 - 순서는 제공되지 않지만 키가 제공됨(인덱스가 없고 키로 조회)
//List계열 - 순서대로 저장, 키가 없음(인덱스로 조회)
//Vector 대신 요즘은 ArrayList를 많이 쓴다
public class VectorExam {
	public static void main(String[] args) {
		//Vector v = new Vector(); ->에러는 아니지만 아래처럼 처리하는게 좋다.
		Vector<Object> v =new Vector();
		//모든 자료형 처리 가능 , 사이즈 자동으로 늘어남
		System.out.println("초기 사이즈 : " + v.capacity()); //Vector의 사이즈를 확인할 수 있음. 기본으로 10개의 사이즈값을 갖는다.
		v.add("first"); //add("추가할 자료")
		v.add(2);
		v.add(3.5);
		v.add(true);
		v.add('a');
		v.add(100);
		v.add(101);
		v.add(103);
		v.add(104);
		v.add(105);
		v.add(106);
		
		System.out.println("중간 사이즈 : " +v.capacity()); //입력된 데이터가 벡터가 만들어 놓은 
		//초기 10개의 사이즈가 넘어가면 또 10개의 사이즈를 추가로 만든다.
		
		System.out.println("데이터의 갯수 : "+ v.size()); //벡터.size()
		//참고로 배열은 length를 쓴다.
		
		System.out.println("초기 데이터");
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i) + "\t"); //주의점: 배열[i]처럼 쓰면 안된다. get()사용
		}
		
		System.out.println();
		v.add(7, 102); //벡터의 인덱스 7번에 데이터 추가
		v.remove(0); //벡터의 인덱스 0번 요소 삭제
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i) + "\t"); 
		}
		
		
		
		
		
		
		
		
	}
}
