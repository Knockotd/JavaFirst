import java.io.*;
import java.util.Scanner;

//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.BufferedReader;
public class Suinput {

	private static String name;

	public static void main(String[] args) {

		int a, b, c; // 0~9 사이의 숫자만 입력하세요.(문자로 인식하기 때문)

		/*
		 * System.out.print("a=?"); a = System.in.read() - 48; System.in.read();
		 * System.in.read();
		 * 
		 * System.out.print("b=?"); b = System.in.read() - 48; System.in.read();
		 * System.in.read();
		 * 
		 * System.out.print("c=?"); c = System.in.read() - 48; System.in.read();
		 * System.in.read();
		 */

		//BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); // 키보드에서 입력받는다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("세 과목의 점수를 입력해주세요..\n");
//		a = Integer.parseInt(input.readLine());// int형으로 변형을 하기 때문에 하나 이상이 숫자를 받을 수 있음.
//		b = Integer.parseInt(input.readLine());
//		c = Integer.parseInt(input.readLine());
		// 숫자 하나 이상을 받을 수 있음
		name = sc.next();//문자열 입력 방법
		a = (sc.nextInt());// 숫자 입력 방법 //Integer.parseInt는 nextint 때문에 생략가능
		b = (sc.nextInt());
		c = (sc.nextInt());

		System.out.print("당신이 입력한 수는" + a + "," + b + "," + c + "입니다\n");
		System.out.print("당신이 입력한 수의 합는 = " + (a + b + c) + "입니다\n");
	}
}
