
public class ThreadEx1Main {

	public static void main(String[] args) {
		// 클래스의 런 메소드 이용
		// 어떤 클래스를 사용을 하고자 할 때, 메소드에 스테틱이 없다면 항상 1번은 인스턴스를 만드는 것입니다.
		// 인스턴스를 만들 때 생성자를 생각해야 합니다.
		// 생성자는 클래스의 이름과 똑같은 이름을 가졌습니다.
		// 클래스 안에 그런 이름이 없다면 기본 생성자를 가집니다.
		ThreadEx1 th1 = new ThreadEx1();
		// 데몬 스레드로 설정
		// 다른 스레드가 작업 중이 아니면 자동 종료
		// 아래 3초 종료 코드는 꼭 정의를 해주어야 적용이 됩니다.
		th1.setDaemon(true);
		// 스레드 시작
		th1.start();

		// 3초 후에 스레드를 종료하고 싶다면 데몬을 이용합니다.
		// 다른 클래스로 옮겨도 되지만 현재로서는 연습이라서 코드가 복잡하지 않기 때문에
		// 메인에 정의 하는 것이 편해서 이렇게 한 것 입니다.
		try {
			Thread.sleep(2000);
			// 위의 코드 한 줄을 추가하면, InterrupteException을 발생시킵니다.
			th1.interrupt();
			// ThreadEx1.java 코드에 예외처리에 return; 을 해 놓아서 위에서 InterrupteException가 발생하면 프로그램을
			// 종료합니다.
			// 이 작업을 하지 않으면, 예외가 발생해도 프로그램이 계속 진행됩니다.
			// 이런 경우 예를 들어 게임 중에 전화가 왔는데도 자기 혼자 실행 되고 있는 상태가 발생하는 것입니다.
			Thread.sleep(3000);
			System.out.println("메인 종료");
			// 프로그램 종료하는 코드
			// System.exit(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
