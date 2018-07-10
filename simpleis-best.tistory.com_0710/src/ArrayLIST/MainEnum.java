package ArrayLIST;	

//final 묶기
enum GENDER{MAN, WOMAN;}


public class MainEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GENDER gender = GENDER.MAN;
		//enum 으로 final함수를 묶을 때는 변수 자료형도 enum으로 묶어준 걸로 변형 시켜야 한다.
		//값이 2가지 밖에 없어야 하는데 자료형이 int이면 여러개 가질 수도 있으니까.

		final int MAN = 0;
		final int WOMAN = 1;

		if (gender == GENDER.MAN) {
		} else {
		}
		
		if (gender == GENDER.MAN) {
		} else {
		}

		
	}

}
