package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListMain {

	public static void main(String[] args) {
		// 문자열을 저장할 수 있는 ArrayList 생성
		// Vector <String> vector = new Vector<>(); - 구조는 같다.
		// ArrayList<String> arrayList = new ArrayList<>(); - LinkedList와 사용방법이 똑같다.
		LinkedList<String> arrayList = new LinkedList<>();

		// 데이터 삽입
		arrayList.add("박보검");
		arrayList.add("양요섭");
		arrayList.add("류준열");
		arrayList.add("박해진");

		// 데이터 개수
		System.out.println(arrayList.size());

		// 전체 데이터 출력
		for (String temp : arrayList) {
			System.out.println(temp);
		}
		
		 //2번째 데이터 출력하기 String ar = get(arrayList[1]);
		  System.out.println(arrayList.get(1));
		 
	}

}
