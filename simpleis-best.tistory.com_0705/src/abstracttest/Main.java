package abstracttest;

public class Main {

	public static void main(String[] args) {
		System.out.println("==============아이폰==============");
		Smartphone smartphone = new Iphone();
		smartphone.call();
		smartphone.array();
		
		System.out.println("==============안드로이드==============");
		
		smartphone = new Android();
		smartphone.call();
		smartphone.array();
	
		
		//Smartphone의 인스턴스생성
		//smartphone = new Smartphone();
		
		smartphone = new Winphone();
		smartphone.call();
		
		//final 변수 - 값을 변경할 수 없습니다.(읽기 전용)
		//지역변수지만 전역변수처럼 메모리에서 소멸되지 않습니다.
		final int ZERO = 0;
		//ZERO = 1; - 안됨
		
		//switch 써서 숫자로 표시하는 것보다 보기가 좋다. 개발자들 사이에서는 이렇게 알아보기 쉽게 쓰는 걸 더 잘 쳐준다.
		int command = 1;
		final int LBUTTONDOWN = 1;
		final int RBUTTONDOWN = 2;
		if(command == LBUTTONDOWN) {
			
		}else if(command == RBUTTONDOWN){
			
		}

	}

}
