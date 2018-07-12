package map_test;

import java.util.HashMap;
import java.util.Set;

public class Mapmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//이름과 나이 및 소속 회사를 저장하는 멥을 생성
		//HashMap은 key의 순서를 알 수 없음
		HashMap<String, Object> map = new HashMap<>();
		
		//LinkedHashMap<String, Object> map = new LinkedHashMap<>(); - 입력순
		//TreeMap<String, Object> map = new TreeMap<>(); - 키의순
		map.put("name", "안정은");
		map.put("age", 26);
		map.put("company", "Google");
		//set.put으로 코드를 사용할 수 있는데 맵은 그게 안되고 일일히 다 써야 해서 오타 가능성이 있다.
		
		//전체를 한꺼번에 출력 - toString이 재정의 되어 있음
		System.out.println(map);
		//순서에 상관없이 항목별로 출력
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key+":"+map.get(key));
		}
	}

}
