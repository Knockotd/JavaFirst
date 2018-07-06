package langtest;

public class Main {

	public static void main(String[] args) {

		//datasave클래스의 인스턴스를 생성해서 데어터 저장
		DataSave datasave = new DataSave();
		datasave.setJuce("요구르트");
		datasave.setKcal(60.0);
		datasave.setPrice(600);
		
	/*	//toString을 호출해서 출력
		System.out.println(datasave.toString());
		System.out.print(datasave);*/
		
		DataSave datasave2 = new DataSave();
		datasave2.setJuce("요구르트");
		datasave2.setKcal(562.5);
		datasave2.setPrice(2500);
		
		System.out.println(datasave.toString());
		System.out.print(datasave.equals(datasave2));
		
		
	}

}
