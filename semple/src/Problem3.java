import java.util.Scanner;

/*세 과목의 성적을 입력하여 합계와 평균을 구하는 프로그램을 작성하세요.*/
public class Problem3 {

	public static void main(String[] args) {
		
		int kor,eng,mat,sum;
		float aver;
		System.out.println("각 과목의 성적을 입력하세요");
		
		//sc는 오브젝트(object)=reference=참조 변수=인스턴트(instance).
		Scanner sc = new Scanner(System.in);
		System.out.println("국어: ");
		kor = sc.nextInt();
		
		System.out.println("영어: ");
		eng = sc.nextInt();
		
		System.out.println("수학: ");
		mat = sc.nextInt();

		sum = kor + eng + mat;
		aver = sum / 3f;
		//3f: 결과가 같다.
		//3: 결과가 다르다.
		//f를 안쓰면 자동으로 더블형으로 바뀌면서 값이 이상해진다. 그럴거면 차라리 방을 더블로 잡으면 값은 똑같다.
		
		System.out.println("입력 받은 성적: " + kor + "," + eng + "," + mat);
		System.out.println("세 과목의 합: " + sum);
		System.out.println("평균은: " +  aver);
		System.out.printf("평균은: %6.3f", aver);
		

	}

}
