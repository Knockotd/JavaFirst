import java.util.Scanner;

/* 3개의 숫자를 입력받아서 가장큰수, 중간수, 가장작은수를
 * 찾아서 출력하는 프로그램을 작성하세요.
 * 
 *  
 *  
 *  */
public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("서로 다른 수 3개를 입력하세요.");

		Scanner sc = new Scanner(System.in);
		System.out.printf("첫번째 수 입력: ");
		int a = sc.nextInt();
		System.out.printf("두번째 수 입력: ");
		int b = sc.nextInt();
		System.out.printf("세번째 수 입력: ");
		int c = sc.nextInt();

		int aa = a - b;
		int cc = c - b;
		int bb = b - b;
		
		if(aa<0 && cc>0) {
			System.out.println(c+","+b+","+a);
		}
		if(aa<0 && cc<0) {
			if((-aa)>(-cc)) {
				System.out.println(b+","+c+","+a);
			}else {
				System.out.println(b+","+a+","+c);
			}
		}else if(aa>0 && cc>0) {
			if(aa>cc) {
				System.out.println(a+","+c+","+b);
			}else {
				System.out.println(c+","+a+","+b);
			}
		}
		
		
		
		}

	}


