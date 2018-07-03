package method2;

import java.util.Scanner;

//실행 클래스 - main메소드
public class Main {

	public static void main(String[] args) {
		// Member클래스의 인스턴스를 생성
		Member member1 = new Member();
		// 인스턴스 변수를 호출해서 데이터 저장
		Scanner sc = new Scanner(System.in);
		System.out.println("이메일: ");
		String email = sc.nextLine();
		member1.setEmail(email);
		System.out.println("비밀번호: ");
		String password = sc.nextLine();
		member1.setPassword(password);
		System.out.println("닉네임: ");
		String nickname = sc.nextLine();
		member1.setNickname(nickname);
		System.out.println("나이: ");
		int age = sc.nextInt();
		member1.setAge(age);
		sc.close();
		
		System.out.println("닉네임: " + member1.getNickname() + "\t" + "email: " + member1.getEmail() + "\t" + "나이: "
				+ member1.getAge() + "\t" + "비밀번호: " + member1.getPassword() + "\t");

		member1.display();

		System.out.println(member1);
		
		System.out.println(Member.sum(1,3));
		System.out.println(Member.sum(1,2,3));
		System.out.println(Member.sum(1));
	}

}
