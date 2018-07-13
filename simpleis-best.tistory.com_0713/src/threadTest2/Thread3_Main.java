package threadTest2;

public class Thread3_Main {

	public static void main(String[] args) {
		//Runnable 인터페이스를 implements 한 클래스의 인스턴스
		Thread3 obj1 = new Thread3("스레드1");
		Thread3 obj2 = new Thread3("스레드2");
		
		//스레드 생성
		Thread th1 = new Thread(obj1);
		Thread th2 = new Thread(obj2);

		//스레드의 우선순위 변경
		//가장 낮은 우선수위로 설정
		th1.setPriority(Thread.MIN_PRIORITY);
		//가장 높은 우선 순위로 결정
		th2.setPriority(Thread.MAX_PRIORITY);
		
		//스레드 시작
		th1.start();
		th2.start();
		
		try {
			Thread.sleep(3000);
			th1.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
