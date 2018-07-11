package arrayList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ApplicationMain2 {

	public static void main(String[] args) {
		// 인스턴스 배열 만들기 - 5개 저장할 수 있는 배열 생성
		//아직은 모두 null
	Application [] apps = new Application[5];
			//인스턴스 생성
	apps[0] = new Application();
	//값 대입
	apps[0].setAptype("캐주얼게임");
	apps[0].setApname("파티세리스토리");
	apps[0].setDown(500000);
	apps[0].setGrade(4.4);
	
	//인스턴스 생성
	apps[1] = new Application();
	//값 대입
	apps[1].setAptype("뉴스");
	apps[1].setApname("썰리");
	apps[1].setDown(5000);
	apps[1].setGrade(4.8);
	
	//인스턴스 생성
	apps[2] = new Application();
	//값 대입
	apps[2].setAptype("롤플레잉");
	apps[2].setApname("포켓몬퀘스트");
	apps[2].setDown(1000000);
	apps[2].setGrade(4.4);
	
	//인스턴스 생성
	apps[3] = new Application();
	//값 대입
	apps[3].setAptype("퍼즐");
	apps[3].setApname("Rikudo");
	apps[3].setDown(100000);
	apps[3].setGrade(4.7);
	
	//인스턴스 생성
	apps[4] = new Application();
	//값 대입
	apps[4].setAptype("엔터테인먼트");
	apps[4].setApname("BuzzVideo버즈비디오");
	apps[4].setDown(5000000);
	apps[4].setGrade(4.7);
	
	//배열의 데이터를 정렬
	//기본적으로 정렬을 하려면 각 데이터의 크기를 비교할 수 있어야 합니다.
	//java에서 크기 비교를 하는 메소드는
	//Comparable 인터페이스의 compare 메소드입니다.
	//직접 만든 클래스의 경우에는 클래스에 Comparable 인터페이스를 implements 하던가
	//Comparator 인터페이스를 implements한 인스턴스를 같이 대입해야 합니다.
	
	
	
/*	//Comparator 인터페이스를 implements 한 인스턴스 만들기
	Comparator <Application> comp = new Comparator() {
//<>Object값에다가 Application을 넣을 거다라는 것. 비교할 대상을 여기다가 넣는 거다.
		@Override
		public int compare(Object o1, Object o2) { //o1, o2를 변경해도 되지만 그러면 아래도 o1과 o2도 바꾸어 주어야 한다.
			// 데이터 형 변환
			Application first = (Application)o1; // ()o1형변환 하는 것이다. //down값은 Application에 있기 때문이다.
			Application second = (Application)o2;
			return first.getDown() - second.getDown();
			
		}
		
	};
	Arrays.sort(apps, comp);*/
	
/*	//<> : 자료형
	Comparator <Application> comparator = new Comparator() {

		//재정의
		@Override
		public int compare(Object o1, Object o2) {
			Application a = (Application)o1;
			Application b = (Application)o2;
			//down을 이용한 크기 비교 - 크기 비교는 compareTo()로 한다.
			return a.getDown().compareTo(b.getDown());
		}

		
	};
	Arrays.sort(apps, comparator);*/
	

	Scanner sc = new Scanner(System.in);
	while(true) {
		//선언만 여기서 하고,
		Comparator <Application> comparator = null;
	System.out.print("0:종료 1:제목오름차순 2.제목내림차순");
	//배열의 데이터 전부 출력
	int menu = sc.nextInt();
	if(menu == 0) {break;}
	else if(menu ==1) {
		comparator = new Comparator<Application>() {

			@Override
			public int compare(Application o1, Application o2) {
				Application app1 = (Application)o1;
				Application app2 = (Application)o2;
				return app1.getApname().compareTo(app2.getApname());
			}
			
		};
	}
	else if(menu ==2 ) {
		comparator = new Comparator<Application>() {

			@Override
			public int compare(Application o1, Application o2) {
				Application app1 = (Application)o1;
				Application app2 = (Application)o2;
				return app2.getApname().compareTo(app1.getApname());
			}
			
		};
	}
	Arrays.sort(apps, comparator);
	for(Application app : apps) {System.out.println(app);}
	System.out.println("=================");
	}
	sc.close();
	}

}
