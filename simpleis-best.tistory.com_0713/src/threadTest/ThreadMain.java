package threadTest;

public class ThreadMain {

	public static void main(String[] args) {
		// 앞에서 만든 클래스의 인스턴스를 만들고 run메소드 호출
		/*ThreadTest1 thr1 = new ThreadTest1();
		thr1.run();
		ThreadTest1 thr2 = new ThreadTest1();
		thr2.run();*/
		
		
		//스레드로 실행
		ThreadTest1 thr1 = new ThreadTest1();
		thr1.start();
		ThreadTest1 thr2 = new ThreadTest1();
		thr2.start();
	}

}
