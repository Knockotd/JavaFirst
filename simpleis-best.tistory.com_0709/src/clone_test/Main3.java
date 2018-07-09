package clone_test;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		Integer i = new Integer(10);
		System.out.println(i);
		i = 20;
		System.out.println(i);
		i = Integer.parseInt("700");
		System.out.println(i);
		
		//i = Integer.parseInt("80 0");
		//System.out.println(i);
		//NumberFormatException
		
		int x = -1;
		Scanner sc = new Scanner(System.in);
		while(true) {
			//기본적으로 문자열로 받아서 바꾸는 작업을 시행한다.
			//항상 가이드 문구를 적어주는 게 좋다.
			System.out.println("정수를 입력해주세요 : ");
			String temp = sc.nextLine();
			try {
			x = Integer.parseInt(temp);
			//정수가 아닌 값을 넣으면 튕길 수도 있습니다. 이럴 경우 try로 감싸주는 게 좋습니다.
			break; //오류 없이 정상 실행되면 break;를 만나서 빠져나갈 수 있습니다.
			}
			catch(Exception e) {
				System.out.println("정수를 입력하세요.");
			}
		}
		System.out.println(x);
		sc.close();

	}

}
