package clone_test;

import java.io.IOException;

public class Api {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runtime r = Runtime.getRuntime();
		
	//	r.exec("chrome.exe C:\\Users\\503-26\\Desktop\\1.8 docs\\docs\\api\\index.html");
	// try catch 실행 결과는 아래와 같다.
		try {
		r.exec("notepad.exe C:\\Users\\503-26\\Documents\\안정은\\자바_C\\api해석.txt");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		

			try {
				r.exec("C:\\ProgramFiles(x86)\\Google\\Chrome\\Application\\http://naver.com");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

	}
	}

}
