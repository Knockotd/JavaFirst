import java.io.IOException;


/*입력된 문자가 대문자이면
 * 소문자로 변경하는 프로그램을 작성하세요.
  */



//65~90AZ /97~122az
public class Problem12 {

	public static void main(String[] args) throws IOException {

		int A=0;
		System.out.printf("영어로 입력하세요.\n");
		A = System.in.read(); //한 자리만 받을 수 있는 것.
		if(A>='A' & A<='Z') { //최종적으로 이진수로 바뀌어 나타나므로 &&도 되고 &도 된다.
			A+=32;
			System.out.printf("%c \n",A);
		}
		
		else if(A >= 'a' & A <= 'z'){
			A -= 32;
			System.out.println((char)(A));
		}
	}
}
