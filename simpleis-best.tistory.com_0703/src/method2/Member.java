package method2;

public class Member {
	
	@Override
	public String toString() {
		return "Member [email=" + email + ", password=" + password + ", nickname=" + nickname + ", age=" + age + "]";
	}
	
	//static메소드: 클래스 이름으로 호출할 수 있는 메소드
	//매개변수에 ...이 있으면 매개변수 개수에 상관없이 대입 가능
	public static int sum(int...ar) {
		int tot = 0;
		//heep에 있는 데이터를 stack에 저장
		//자주 사용하기 때문에 heep에 있으면 효율이 떨어짐(속도)
		int len = ar.length;
		for(int i=0; i<len; i=i+1) {
			tot = tot + ar[i];
		}
		return tot;
	}

	// getter 설정
	public String getNickname() {
		return nickname;
	}

	// setter 설정
	public void setNickname(String arg) {
		nickname = arg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String email;
	private String password;
	private String nickname;
	private int age;

	// 인스턴스 변수들을 출력해주는 메소드
	// 클래스 안에서 클래스에 만들어진 변수를 사용할 때는
	// 인스턴스나 클래스 이름을 기재하지 않습니다.
	public void display() {
		System.out.println("닉네임: " + nickname + "\t" + "email: " + email + "\t" + "나이: " + age + "\t" + "비밀번호: "
				+ password + "\t");
	}

}
