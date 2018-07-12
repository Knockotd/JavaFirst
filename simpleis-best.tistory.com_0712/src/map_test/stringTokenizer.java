package map_test;

import java.util.StringTokenizer;

public class stringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String msg = "박보검이 남자친구라는 드라마를 찍는다고 합니다.";
				String data = "10,50,60,30";
				//msg를 공백단위로 분할 해서 출력
				//1.split 메소드 이용
				String [] ar = msg.split(" ");
				for(String token : ar) {
					System.out.println(token);
				}
				System.out.println("===================");
				
				StringTokenizer st = new StringTokenizer(msg, " ");
				while(st.hasMoreTokens()) {
					System.out.println(st.nextToken());
				}
				//data를 , 단위로 분할해서 합계를 구하기
				int result= 0;
				String [] br = data.split(",");
				//. 같이 특수한 기호들은 \\을 두번 붙여서 ()에 넣어야 합니다.
				for(String token : br) {
					System.out.println(token);
					result = result+Integer.parseInt(token);
				}
				System.out.println(result);
				System.out.println("===================");
				StringTokenizer bt = new StringTokenizer(data, ",");
				while(true) {
					if(bt.hasMoreTokens()) break;
					
				}
	}

}
