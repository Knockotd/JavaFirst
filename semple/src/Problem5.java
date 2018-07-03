import java.util.Scanner;

/*주어진 초를 이용하여 몇시간 몇분 몇초인가를
알아보는 프로그램을 작성합니다.*/
//예시 = 10000초
public class Problem5 {

	public static void main(String[] args) {
		System.out.println("초를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int se = sc.nextInt();
int ho= se / 3600;
int hoNa= se % 3600;
int mi= hoNa / 60;
int seNa = hoNa % 60;
				
				
				System.out.println(se + "초는 " + ho + "시간 " + mi + "분 " + seNa +"초 입니다.");

		

	}

}
