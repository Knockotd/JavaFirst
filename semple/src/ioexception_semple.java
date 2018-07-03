//클래스 이름과 파일의 이름은 같습니다.
//IOException은 예약어이므로 메소드이름이나 변수이름, 클래스이름으로 사용하시면 안됩니다.

import java.io.*;

class ioexception_semple {

	public static void main(String[] args) throws IOException {

		int ken;
		System.out.print("키보드로 문자 입력 요망:");
		ken = System.in.read();
		System.out.println("입력한 문자의 10진수:" + ken);

	}

}
