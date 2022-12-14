package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListProdEx {

	public static void main(String[] args) {
		Map<String , Object> map = new HashMap<>();
		List<ProdEx> list = new ArrayList<>();
		list.add(new ProdEx("TV", "oled01", "LG", 300, 10));
		list.add(new ProdEx("냉장고", "s02re", "딤채", 200, 6));
		list.add(new ProdEx("에어컨", "A14Fqr", "케리어", 150, 7));
		list.add(new ProdEx("컴퓨터", "asus09", "아수스", 120, 8));
		
		map.put("list", list); //맵에 리스트 추가
		print(map);
	}

	static void print(Map<String, Object> map) {
		ArrayList<ProdEx> list2 = (ArrayList<ProdEx>)map.get("list");
		System.out.println("제품명\t제품번호\t제조사\t단가\t수량\t판매금액");
		for(ProdEx s : list2) {
			System.out.println(s.getName()+"\t"+s.getNum()+"\t"+s.getCompany()+"\t"+
									s.getPrice()+"\t"+s.getMount()+"\t"+s.getMoney());
		}
	}

}
