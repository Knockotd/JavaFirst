package map_test;

import java.util.HashMap;

public class ArrayTest2 {

	public static void main(String[] args) {
		// ArrayTest에서 출력을 데이터와 분리
		String [] senchi = {"치히로", "검댕이", "보             ", "유바바"};
		String [] hawul = {"소피   ","하울   ","카루시파"};
		String [] totoro = {"토토로","사츠키","메이"};
		String [] catboeun = {"하루   ", "바론   ", "치카   ","유키   "};
		
		//동일한 의미를 갖는 배열들을 묶을 때 바로 배열이나 리스트로 묶는 것은
		//바람직하지 않습니다.
		//배열이나 리스트는 인덱스를 가지고 구분을 하기 때문에
		//의미를 부여하지를 못합니다.
		//그래서 배열이나 리스트를 다시 배열이나 리스트로 묶을 때는 먼저
		//Map으로 의미를 부여해서 묶은 다음, 다시 배열이나 리스트로
		//묶으라고 합니다.
		
		HashMap <String, Object> map0 = new HashMap<>();
		//의미, 데이터
		map0.put("animationName", "센과치히로의 행방불명");
		map0.put("appearRance", senchi);
		
		HashMap <String, Object> map1 = new HashMap<>();
		//의미, 데이터
		map1.put("animationName", "하울의 움직이는 성    ");
		map1.put("appearRance", hawul);
		
		HashMap <String, Object> map2 = new HashMap<>();
		//의미, 데이터
		map2.put("animationName", "이웃집 토토로           ");
		map2.put("appearRance", totoro);
		
		HashMap <String, Object> map3 = new HashMap<>();
		//의미, 데이터
		map3.put("animationName", "고양이 보은              ");
		map3.put("appearRance", catboeun);
		
		//HashMap의 배열
		HashMap [] hashmap = {map0, map1, map2, map3};
		
		for(int i=0; i<hashmap.length; i=i+1) {
			HashMap temp = hashmap[i]; // 1. HashMap에서 꺼내오는 건 형 변환을 안해도 되고
			//애니메이션 이름 출력
			System.out.print(temp.get("animationName")+"\t");
			//출연 이름 가져오기
			//출력을 할 때는 get 한 데이터를 형변환하지 않지만
			//저장을 하거나 사용을 할 때는 원래의 자료형으로 강제 형 변환을
			//해서 사용합니다.
			String [] imsi = (String [])temp.get("appearRance"); // 2. Object에 있는 걸 꺼내올 때는 형 변환을 해야 한다.
			for(int j=0; j<imsi.length; j=j+1) {
				System.out.print(imsi[j] + "\t");
			}
			System.out.println("");
		}
		
	}

}
