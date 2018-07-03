import java.util.Scanner;

/*주어진 숫자 단위 구하기
예) 345이면 3은 백의자리, 4는 십의 자리, 5는 일의 자리*/
public class problem2 {

	public static void main(String[] args) {

		//int num=345;
		int num, mok, nam;
		int mok2, mok3;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		mok = num / 100; //몫 구하기
		nam = num % 100; //나머지 구하기
		mok2 = nam / 10;
		nam = nam % 10;
		mok3 = nam / 1;
		
		System.out.println("입력받은 값은 = " + num);
		System.out.println("백의 자리는 = " + mok);
		System.out.println("십의 자리는 = " + mok2);
		System.out.println("일의 자리는 = " + mok3);
		
	}

}
