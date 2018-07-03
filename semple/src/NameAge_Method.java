import java.io.*;

/*이름과 나이를 입력하여 그대로 출력하는 프로그램을 작성하세요.
예시] 입력 : 홍길동 300
출력 : 홍길동님의 나이는 300세입니다.*/

public class NameAge_Method {
	// 필드영역(전역변수 영역)
	private String name; // 클래스의 멤버 변수(C의 전역변수 같은 것)
	private int age; // 멤버 변수

	private String name_method() throws IOException { // 멤버함수
		BufferedReader Name = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("이름을 입력하세요 : ");
		name = Name.readLine();

		return name;
	}

	private int age_method() throws NumberFormatException, IOException {

		BufferedReader Name = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("나이를 입력하세요 : ");
		age = Integer.parseInt(Name.readLine());
		int nae = age + 100;

		return nae;
	}

	private void display_method() throws IOException {

		System.out.println(name + "님의 나이는" + age + "세입니다.");
		
	}

	public static void main(String[] args) throws IOException {
		NameAge_Method agm = new NameAge_Method();
		agm.name_method(); // 호출부
		agm.age_method();
		agm.display_method();

	}
}
//상속 : public class A extends(상속) B(클래스는 하나만) implements C,E,D,F...(인터페이스는 여러개 가능){
//인터페이스만 상속: public class F implements G, H...{