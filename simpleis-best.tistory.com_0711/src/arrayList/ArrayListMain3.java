package arrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class ArrayListMain3 {

	public static void main(String[] args) {
		// 정수 List와 문자열 List의 정렬
		ArrayList<Integer> alist = new ArrayList<>();
		alist.add(40);
		alist.add(30);
		alist.add(35);
		
		Comparator<Integer>comp = new Comparator() {
			//클래스 없이 인스턴스를 바로 만들 때 이러한 구조가 쓰인다.
				@Override
				public int compare(Object o1, Object o2) {
					Integer first = (Integer)o1;
					Integer second = (Integer)o2;
					return first-second;
				}
				
			};
		alist.sort(comp);
		//List는 toString 재정의 되어 있어서 인스턴스를 출력하면 데이터가 순서대로 toString을 호출합니다.
		System.out.println(alist);
		
		LinkedList <String> llist = new LinkedList<>();
		llist.add("스페인");
		llist.add("베니스");
		llist.add("제노비아");
		
		Comparator<String>comp1 = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				String first = (String)o1;
				String second = (String)o2;
				return second.compareTo(first);	// first-second; 문자열이라 빼기 안 됨. // 배열을 반대로 하고 싶다면 first와 second를 바꾸면 된다.
			}
			
		};
		
		llist.sort(comp1);
		System.out.println(llist);
		
		
		ArrayList<Application> list = new ArrayList<>();
		
		Application app = new Application();
		app.setAptype("캐주얼게임");
		app.setApname("파티세리 스토리");
		app.setDown(500000);
		app.setGrade(4.4);
		list.add(app);
		
		
		app = new Application();
		app.setAptype("뉴스");
		app.setApname("썰리");
		app.setDown(5000);
		app.setGrade(4.8);
		list.add(app);
		
		app = new Application();
		app.setAptype("롤플레잉");
		app.setApname("포켓몬퀘스트");
		app.setDown(1000000);
		app.setGrade(4.4);
		list.add(app);
		
		app = new Application();
		app.setAptype("퍼즐");
		app.setApname("Rikudo");
		app.setDown(100000);
		app.setGrade(4.7);
		list.add(app);
		
		app = new Application();
		app.setAptype("엔터테인먼트");
		app.setApname("BuzzVideo 버즈비디오");
		app.setDown(5000000);
		app.setGrade(4.7);
		list.add(app);
		
		Comparator<Application> camp = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Application first = (Application)o1;
						Application second = (Application)o2;
			return first.getApname().compareTo(second.getApname());
			}};
		
		//리스트의 모든 데이터 확인
		System.out.println(list);
		//각각의 데이터 확인
		for(Application temp : list) {
			System.out.println(temp);
		}
		
	}

}
