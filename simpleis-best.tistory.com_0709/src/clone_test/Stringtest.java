package clone_test;

public class Stringtest {

	public static void main(String[] args) {

	String str = "Hello";
	int size = str.length();
	String result = "";
	
	for(int i=0; i<size; i=i+1) {
		char ch = str.charAt(i);
		System.out.println(ch);
		//Hello를 모두 대문자로 출력

		//대문자로 바꾸려면 일단, 소문자인지 확인해야 합니다.
		if(ch >='a' && ch <= 'z') {
			// + , - , * , / , % 의 결과는 최소 int 작은거에서 큰쪽으로 넘어갈 수 있지만 반대는 못한다.
			//ch = ch - 32; //따라서 이것은 안 됨
			ch = (char)(ch-32); //강제 형변환)
			System.out.println(ch);
		}
	}
	//역순으로 출력
	//		char ch = str.charAt(size-(i+1));
	

	}

}
