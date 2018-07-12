package map_test;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1993년 9월 17일 Calendar 객체로 만들기
		Calendar birthDay = Calendar.getInstance();
		birthDay.set(Calendar.YEAR, 1993);
		birthDay.set(Calendar.MONTH, 8);
		birthDay.set(Calendar.DAY_OF_MONTH, 17);
		//System.out.println(birthDay);
		//Date date = new Date(birthDay.getTimeInMillis());
		//System.out.println(date);
		
		Calendar toDay = Calendar.getInstance();
		long gap =
				toDay.getTimeInMillis() - birthDay.getTimeInMillis();
		System.out.println("저는 태어난지" +  (gap/24/60/60/1000)  + "일째 되는 날입니다.");
		
		
		
		
		Date date = new Date();
		int money = 4546000;
		//0000년 00월 00일 요일 00시00분00초 형식으로 출력
		//제어판 설정에 따라 언어나 약자가 정해져서 나옴. 인터넷으로 가면 임의로 정해 줄 수 있습니다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 EEEE a hh시mm분ss초");
		String msg = sdf.format(date);
		System.out.println(msg);
		
		//\4,546,000로 출력
		DecimalFormat df = new DecimalFormat("\u00A4 #,##0");
		msg = df.format(money);
		System.out.println(msg);
	
		
	}
	}
	
	


