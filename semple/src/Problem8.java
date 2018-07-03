import java.io.*;


/*이름과 나이를 입력하여 그대로 출력하는 프로그램을 작성하세요.
예시] 입력 : 홍길동 300
출력 : 홍길동님의 나이는 300세입니다.*/

public class Problem8 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader Name = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.printf("이름을 입력하세요 : ");
		String name = Name.readLine();
		
		System.out.printf("나이를 입력하세요 : ");
		int age = Integer.parseInt(Name.readLine());
		int nae = age +100;
		
		
		System.out.println(name+"님의 나이는"+age+"세입니다.");

	}

}
