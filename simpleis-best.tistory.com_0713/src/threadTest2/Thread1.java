package threadTest2;

import java.util.Random;

public class Thread1 implements Runnable {
	Thread inter = new Thread();
	private static int rank;

	@Override
	public void run() {

		// 스레드 이름 출력
		System.out.println(inter.getName() + "출발");
		// 현재 위치를 저장할 변수
		int pos = 0;
		// 랜덤한 값을 가져오기 위한 변수
		Random r = new Random();
		while (true) {
			try {
				Thread.sleep(100); 
				pos = pos + r.nextInt(10);
				if (pos > 1000)
					break;
				System.out.println(inter.getName() + ":" + pos);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
		rank = rank + 1;

		System.out.println(inter.getName() + " " + rank + " 골인");

	}

}
