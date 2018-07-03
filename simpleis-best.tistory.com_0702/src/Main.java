//Person이라는 클래스 생성
class Person{
	//이렇게 클래스 안에 static 없이 만들어진 변수를 instance 변수라고 합니다.
	//이 변수들은 객체가 만들어질 때 각 객체마다 별도로 메모리를 할당받습니다.
	int num; //번호를 저장하기 위한 변수
	String name; //이름을 저장하기 위한 변수
	String phone; //전화번호를 저장하기 위한 변수 //숫자는 부분 검색이 안됩니다.
	//static 변수 - 공유
			static String all;
			
			//TEN이라는 변수는 10을 저장 : 변경할 수 없습니다.
			static int x = 10;
			//final 붙으면 읽기만 가능 안 붙으면 읽고 쓰기 가능. 쓰기는 동시에 하면 안됨.
			static final int TEN = 10;
			//x 값은 변경 가능하지만 TEN은 바뀌지 않음.
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person이라는 클래스의 인스턴스를 생성
		Person ins = new Person();
		
		//인스턴스 이름을 출력하면 toString()이라는 메소드의 결과가 호출.
		//보통은 클래스 이름과 해시코드가 출력.
		//실패하면 null이라고 나오던지 아니면 예외 발생
		//잘 만들어 졌는지 확인 하려면 이렇게 찍어 보는 게 중요하다.
		System.out.println(ins);
		
		
		//Hello Java를 3번 출력하는 작업
		for(int i=0;i<3;i=i+1) {
			System.out.println("Hello Java");
		}
		//i는 for(제어문) 안에서 만들었기 때문에 바깥에서는 사용할 수 없음.
		//System.out.println(i);
		
		//지역변수는 반드시 초기화 해서 사용해야 함.
		int k;
		//System.out.println(k);
		//인스턴스 2개 생성
		Person person1 = new Person();
		Person person2 = new Person();
		//각 인스턴스의 num의 값을 출력
		System.out.println("person1:"+person1.num);
		System.out.println("person2:"+person2.num);
		//person1의 num을 1로 변경
		person1.num=1;
		System.out.println("person1:"+person1.num);
		System.out.println("person2:"+person2.num);
		
		// static은 하나만 만들어서 공유하기 때문에 누군가가 변경하면
		// 다른 모두에 영향을 미칩니다.
		person1.all = "공유";
		Person.all = "공유";
		//이렇게 써도 된다.
		//
		System.out.println("person1:"+person1.all);
		System.out.println("person2:"+person2.all);
	//Person.TEN = 20;
		
		System.out.println(person1.x);
	
	
	}

}
