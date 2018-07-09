package clone_test;

public class Main2 {

	public static void main(String[] args) {

		Semple1 semple1 = new Semple1();
		semple1.setNum(1);
		semple1.setName("박보검");
		String [] hobbies = {"피아노", "노래", "연기", "먹방"};
		semple1.setHobbies(hobbies);
		//toString을 호출해서 내부 내용 확인
		System.out.println(semple1);
		
		//semple1의 데이터가 저장된 곳의 주소를 semple2에 복사
		Semple1 semple2 = semple1;
		semple2.setNum(2);
		System.out.println(semple1);
		
		Semple1 semple3 = semple1.clone();
		semple3.setNum(3);
		semple3.setName("양요섭");
		semple3.getHobbies()[0] = "노래 잘 하기";
		System.out.println(semple1);
		System.out.println(semple3);
		
	}

}
