
public class ThreadEx1 extends Thread {
	// 스레드로 동작할 메소드
	public void run() {
		//1초마다 스레드라는 글자를 10번 출력하는 메소드
		int i= 0;
		while(i<10) {
			
			System.out.println("Thread");
			//1초씩 대기 : thread 클래스의 static 메소드인 sleep(시간)을 이용하면 됩니다.
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage()); //오류 메세지를 출력해주는 메소드 e.getMessage()
				e.printStackTrace();
			}
			i++;
			
		}
	}

}
