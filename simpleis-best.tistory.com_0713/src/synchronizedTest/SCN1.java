package synchronizedTest;

public class SCN1 implements Runnable {

	private int result;
	private int idx;
	
	//synchronized가 붙은 메소드는 여러 개의 스레드를 동시에 호출하더라도
	//하나의 수행이 종료된 후에 메소드가 호출됩니다.
	private synchronized void sum() {
		for(int i=0; i<10000; i++) {
			idx= idx +1;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			result = result+idx;
			// 메인에서 해당 클래스의 인스턴스를 1개 만들어
			// 2개의 서로 다른 스레드에 매개변수로 위에서 만든 인스턴스를 주면
			// 메소드는 따로 가지지만 해당 인스턴스의 변수는 1개로 공유되므로
			// idx 변수를 공유하게 되면서 결과가 달라질 수 있다.
		}
	}
	@Override
	public void run() {
		// 
		sum();
	}
//result값을 리턴해주는 메소드
	public int getResult() {
		return result;
	}
}
