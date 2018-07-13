package threadTest;

public class ThreadMain2 {

	public static void main(String[] args) {
		//스레드를 생성
		ThreadTest2 th2 = new ThreadTest2();
		//스레드로 실행
		th2.start();
		
		System.out.println("정말 스레드?");
	}

}
