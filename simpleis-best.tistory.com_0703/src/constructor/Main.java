package constructor;

public class Main {

	public static void main(String[] args) {
		
		//Practice 클래스의 인스턴스 생성
		Practice practice1 = new Practice();
		//practice1.setNickname("No Name");
		System.out.println(practice1.getNickname());
		Practice practice2 = new Practice();
		//practice2.setNickname("No Name");
		System.out.println(practice2.getNickname());
		
		Practice practice3 = new Practice("park");
		System.out.println(practice3.getNickname());
		
		String A = "안녕하세요";
		int a = A.length();
		System.out.println(a);
		
		a = A.lastIndexOf("녕");
		System.out.println(a);

		practice3.display();
		System.out.println("추가 작업");
		
	}

}
