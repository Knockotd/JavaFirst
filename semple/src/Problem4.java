import java.util.Scanner;

/*물건을 삽니다. 커피 가격은 개당 4000원 이었을 때
n개의 커피를 구입합니다.
이 때 부가세는 10%를 부과합니다. (VAT별도)
거스름돈은 얼마인가요?*/
public class Problem4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, money;
		float nam,buga, ga;
		System.out.println("커피값은 부가세(10%) 별도 4000원 입니다. ");
		System.out.println("구입할 커피의 개수를 적으세요: ");
		n = sc.nextInt();
		System.out.println("지불할 금액을 적으세요: ");
		money = sc.nextInt();
		
		int coffee = 4000;
		buga = coffee * 0.1f; //부가세
		ga = coffee + buga; //부가세 포함 한 잔 가격
		nam = money - ga * n; //거스름돈
		
		System.out.println("커피 가격은 총: " + (4000*n) + "원, 부가세는: " + (buga*n) + "원 입니다.");
		System.out.println("부가세 포함 총 가격은: " + ga*n +"원 이고,");
		if(nam>=0) {
			System.out.println("거스름돈: " + nam+"원을 받으세요.");
		}else {
			System.out.println("금액이 부족합니다." + (-nam) + "원을 더 지불하세요.");
		}
		

	}

}
