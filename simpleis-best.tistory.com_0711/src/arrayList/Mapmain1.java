package arrayList;

import java.util.HashMap;
import java.util.Set;

public class Mapmain1 {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "댕댕이");
		map.put("age", 1);
		map.put("species", "강아지");
		//동일한 키로 다시 저장하면 업데이트 됩니다.
		map.put("age", 2);

		//company 키의 값을 출력하기
		System.out.println(map.get("age"));
		//없는 키의 이름을 사용하면 null을 리턴
		System.out.println(map.get("position"));
		
		//모든 데이터 조회 - 저장할 때 사용한 Key를 몰라도 조회가능
		//모든 키를 Set으로 저장
		Set<String> alldisplay = map.keySet();
		
		for(String allDisplay : alldisplay) {
			System.out.println(allDisplay + ":" + map.get(allDisplay));
		}
		
	}

}
