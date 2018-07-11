package arrayList;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setmain {

	public static void main(String[] args) {
		HashSet<String> song = new HashSet<>();
		song.add("24K Magic");
		song.add("견딜만해");
		song.add("공감");
		song.add("I Miss you");
		song.add("공감");
		song.add("Hello");
		for(String temp : song) {
			System.out.println(temp);
		}
		System.out.println("--------------HashSet : 순서를 전혀 예측할 수 없음-------------------");
		TreeSet<String> song1 = new TreeSet<>();
		song1.add("24K Magic");
		song1.add("견딜만해");
		song1.add("공감");
		song1.add("I Miss you");
		song1.add("공감");
		song1.add("Hello");
		for(String temp : song1) {
			System.out.println(temp);
		}
		System.out.println("----------------TreeSet : 정렬된 순서대로 보관하며 정렬 방법을 지정할 수 있음-----------------");
		LinkedHashSet<String> song2 = new LinkedHashSet<>();
		song2.add("24K Magic");
		song2.add("견딜만해");
		song2.add("공감");
		song2.add("I Miss you");
		song2.add("공감");
		song2.add("Hello");
		for(String temp : song2) {
			System.out.println(temp);
		}
		System.out.println("--------------LinkedHashSet : 추가된 순서, 또는 가장 최근에 접근한 순서대로 접근 가능-------------------");
	}

}
