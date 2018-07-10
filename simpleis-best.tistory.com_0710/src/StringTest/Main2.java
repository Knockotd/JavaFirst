package StringTest;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열 배열 생성
		String [] station = {"광화문", "종로3가", "을지로4가"};
		for(int i=0; i<station.length; i=i+1) {
			System.out.println(station[i]);
		}
		
		for(String temp : station) {
			System.out.println(temp);
		}
	}

}
