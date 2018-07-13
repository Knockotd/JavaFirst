package synchronizedTest;

import java.util.ArrayList;

public class Produce extends Thread {
	private Share1 share;
	
	//같은 이름을 가진 퍼블릭 클래스를 나중에 사용시 중복을 방지하기 위해
	//private로 하나의 이름을 가진 퍼블릭 클래스는 1개로 만들어 줍니다.

	// 생성자
	public Produce(Share1 share) {
		//다른 클래스의 변수를 쓰고 싶으면 이렇게 메소드를 만들어 주면 됩니다.
		this.share = share;
	}
	

	//스레드로 동작할 메소드
	public void run() {
		for(int i=0; i<26; i=i+1) {
			share.save((char)(65+i));
			//65에 i를 더해서 문자로 변경한 후 save 메소드에게 전달
		
	}
}
	}
