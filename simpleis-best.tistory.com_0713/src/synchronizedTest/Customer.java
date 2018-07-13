package synchronizedTest;

import java.util.ArrayList;

//List에서 데이터를 26번 꺼내서 출력하는 스레드
public class Customer extends Thread {
	private Share1 share;

	// 생성자
	public Customer(Share1 share) {
		//다른 클래스의 변수를 쓰고 싶으면 이렇게 메소드를 만들어 주면 됩니다.
		this.share = share;
	}
	

	// 스레드로 수행할 내용을 가지는 메소드
	public void run() {
		for(int i=0; i<26; i=i+1) {
		share.get();
		}
	}
}
