//java.lang.*;
//생략 가능합니다.
import java.lang.System;

public class Hello {
//이 부분이 필드 영역입니다.
	public static void main(String[] args) {
		//public final class System extends Object
		System.out.printf("Hello world\n");
		System.out.printf("안녕하세요? ^^\n");
		System.out.printf("반갑습니다.\n");
		int hap;
		int i=10, j=50;
		hap = i + j;
		System.out.printf("결과는 = %d\n", hap);//60
		System.out.println("결과는 = " + hap);//60
/*System :클래스
*out :객체
*printf : method(메소드) :출력합니다.
*("hello world") : 문자열 "  " =>string 클래스
*; : 문장의 끝*/		
	}
}