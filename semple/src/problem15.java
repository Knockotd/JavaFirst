import java.util.Scanner;

/*
이름, 미술, 음악, 체육 점수를 입력 받아서, 총점, 평균, 학점, 가산점, 합격/불합격
가산점 조건: 평균이 60점 이상 10%의 가산점을 주고
감산점 조건: 평균이 60점 이하이면 10%의 감산점을 준다.
그리고 합격인지 불합격인지를 판정합니다.
합격인 경우에는 평균이 60점 이상.
60점 이하는 불합격입니다.
*/
public class problem15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("이름: ");
		String name = sc.next();
		System.out.printf("미술: ");
		int art = sc.nextInt();
		System.out.printf("음악: ");
		int muc = sc.nextInt();
		System.out.printf("체육: ");
		int phy = sc.nextInt();

		int sum;
		float aver1, aver2 = 0, adp;
		char crd;
		String pass;

		sum = art + muc + phy;
		aver1 = sum / 3.0f;

		if (aver1 >= 60) {
			adp = aver1 * 0.1f;
			aver2 = aver1 + adp;
		} else {
			adp = aver1 * 0.1f;
			aver2 = aver1 + adp;
		}
		//double aver2 = (aver>=60) ? (aver*1.1) : (aver*0.9);
		
		switch ((int) aver2 / 10) {

		case 10:
		case 9:
			crd = 'A';
			break;
		case 8:
			crd = 'B';
			break;
		case 7:
			crd = 'C';
			break;
		case 6:
			crd = 'D';
			break;
		default:
			crd = 'F';
			break;

		}

		System.out.println(name+"님의 점수는 아래와 같습니다.");
		System.out.println("미술: "+ art + ", 음악: " + muc + ", 체육: " + phy);
		System.out.println("총점: " + sum + ", 평균: " + aver1 + ", 가산점: "+adp+", 학점: " + crd);
		
		if(aver2>=60) {
			pass = "합격";
		}else {
			pass = "불합격";
		}
		//String pass = (aver2>=60) ? "합격" : "불합격";
		
		System.out.println(name + "님의 가산점 포함 평균은 " +aver2+ "이므로 " + pass + "입니다.");
	}

}
