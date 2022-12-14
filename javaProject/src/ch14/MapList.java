package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
	static void print(Map<String, Object> map) {
		ArrayList<Student> list2 = (ArrayList<Student>)map.get("list"); //map에서는 key로 데이터를 불러옴 (중요!)
		for(Student s : list2) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+
							s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
	}
	
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>(); //맵 인스턴스 생성
		List<Student> list = new ArrayList<>(); //리스트 인스턴스 생성
		list.add(new Student("201701", "kim", "전산", 3, "park")); //리스트에 Student 객체 추가
		list.add(new Student("201801", "song", "컴공", 1, "lee"));
		list.add(new Student("201901", "hyun", "사회", 2, "han"));
		map.put("list", list); //맵에 리스트 추가 
		
		print(map); //압축파일처럼 list안의 3개의 객체가 map에 담겨져 print쪽의 매개변수화 되어 넘김
		
		
	}

}
