package map_test;

import java.util.ArrayList;
import java.util.Random;

public class etc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("!");
		list.add("@");
		list.add("#");
		list.add("$");
		list.add("%");
		list.add("^");
		list.add("&");
		list.add("*");
		
		String slot = "";
		Random r = new Random();
		//list에 있는 모양 3개를 랜덤하게 추출해서 slot에 추가
		for(int i=0; i<3; i=i+1) {
			slot = slot +list.get(r.nextInt(list.size()));
			
			//r.nextIn에서 나오는 수를 ()의 수로 나누어서 숫자가 리턴된다.

		}
		System.out.println(slot);
		//3개의 문자가 동일한지 확인
		if(slot.charAt(0)==slot.charAt(1) &&
				slot.charAt(1)==slot.charAt(2)) {
			System.out.println(slot.charAt(0)+"이 3개");
		}
		//앞의 두개 문자만 동일한지 확인
		else if(slot.charAt(0)==slot.charAt(1)){
			System.out.println(slot.charAt(0)+"이 앞에 2개");
		}
		//그 이외의 경우
		else {
			System.out.println("꽝 다음 기회에!!!!");
		}
	}

}
