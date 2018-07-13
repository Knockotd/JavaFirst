package synchronizedTest;

public class SCN1_Main {

	public static void main(String[] args) {
		SCN1 scn = new SCN1();
		//SCN 생성자를 1개 만들고 스레드(여기)에 여기 부분에 같은 생성자를 넣었기 때문에 메소드는 따로 가지지만 변수는 같은 걸 공유하게 된다.
		//scn의 idx(SCN1의 private변수)와 scn의 idx는 경로가 완전히 같지 않은가.
		//그래서 스레드로 동시 작업을 하면 변수가 공유되면서 결과값이 다르게 나올 수 있는데
		//이 문제점을 해결하기 위해서는 synchronized를 2가지 방법으로 사용해서 동기적 사용을 막을 수 있다.
		Thread th1 = new Thread(scn);
		th1.start();
		Thread th2 = new Thread(scn);
		th2.start();

		// 25초 후에 SNC의 result값 확인
		try {
			Thread.sleep(25000);
			System.out.println(scn.getResult());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
