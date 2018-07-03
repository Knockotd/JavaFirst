import java.util.Random;
import java.util.Scanner;

/*
가위, 바위, 보 게임을 합니다.
조건] 난수를 발생하여 처리합니다.
Random()메소드 사용
사용법: Random()메소드에서 객체를 생성하여 사용합니다.*/
public class Problem16 {

	public static void main(String[] args) {
		
		while(true) {
int a = 0;
String b;
		Random rd = new Random();
		int com = rd.nextInt(3); //0~2까지의 숫자를 생성.
		//computer = rd.nextInt(3) + 1; 1~3까지의 숫자를 생성.
		
		Scanner You = new Scanner(System.in);
		
		System.out.printf("\n 가위, 바위, 보 중에 하나를 입력하세요.");
		String you = You.next();
		
		switch(you) {
		case "가위" : 
			a = 0;
			break;
		case "바위" :
			a = 1;
			break;
		case "보" :
			a = 2;
			break;
			default : 
				System.out.printf("잘 못 입력하셨습니다.");
				System.out.printf("'가위', '바위', '보' 중에서 하나를 정확하게 입력해주세요.");
				continue;
		}
		
		if(com == a) {
			switch(com) {
			case 0 : 
				b = "가위";
				break;
			case 1 :
				b = "바위";
				break;
			default :
				b = "보";
				break;
			}
			System.out.printf("나: %s, 컴퓨터: %s, 비겼습니다.",you,b);}
		if(com==0 && a == 1) {
			switch(com) {
			case 0 : 
				b = "가위";
				break;
			case 1 :
				b = "바위";
				break;
			default :
				b = "보";
				break;
			}
			System.out.printf("나: %s, 컴퓨터: %s, 내가 이겼습니다.",you,b);
		}
		if(com==0 && a == 2) {
			switch(com) {
			case 0 : 
				b = "가위";
				break;
			case 1 :
				b = "바위";
				break;
			default :
				b = "보";
				break;
			}
			System.out.printf("나: %s, 컴퓨터: %s, 컴퓨터가 이겼습니다.",you,b);
		}
		if(com==1 && a == 0) {
			switch(com) {
			case 0 : 
				b = "가위";
				break;
			case 1 :
				b = "바위";
				break;
			default :
				b = "보";
				break;
			}
			System.out.printf("나: %s, 컴퓨터: %s, 컴퓨터가 이겼습니다.",you,b);
		}
		if(com==1 && a == 2) {
			switch(com) {
			case 0 : 
				b = "가위";
				break;
			case 1 :
				b = "바위";
				break;
			default :
				b = "보";
				break;
			}
			System.out.printf("나: %s, 컴퓨터: %s, 내가 이겼습니다.",you,b);
		}
		if(com==2 && a == 0) {
			switch(com) {
			case 0 : 
				b = "가위";
				break;
			case 1 :
				b = "바위";
				break;
			default :
				b = "보";
				break;
			}
			System.out.printf("나: %s, 컴퓨터: %s, 내가 이겼습니다.",you,b);
		}
		if(com==2 && a == 1) {
			switch(com) {
			case 0 : 
				b = "가위";
				break;
			case 1 :
				b = "바위";
				break;
			default :
				b = "보";
				break;
			}
			System.out.printf("나: %s, 컴퓨터: %s, 컴퓨터가 이겼습니다.",you,b);
		}
		
		}

	}

}
