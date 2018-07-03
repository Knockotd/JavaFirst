package constructor;

public class Practice {
	//가장 처음 한 번만 수행됩니다.
	static {
		System.out.println("안정은 천재");
		
	}
	//new Practice할 때마다 수행됩니다.
	{
		System.out.println("안정은 처언재");
		
	}
	
	
	//생성자
	public Practice() {
		nickname = "No Name";
	}
	
	//생성자 오버로딩(동일한 이름의 메소드가 2개 이상 있는 경우)
	public Practice(String arg) {
		nickname = arg;
	}
	
	// 이름을 저장하기 위한 인스턴스 변수를 선언
	private String nickname;
	
	
	// name의 접근자 메소드
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public void display() {
		String nickname = "지역변수";
		System.out.println(nickname);
		//this를 붙이면 지역변수에서는 찾지 않고 인스턴스 변수에서 찾아옵니다.
		System.out.println(this.nickname);
	}
	
}
