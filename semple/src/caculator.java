import java.util.Scanner;

public class caculator {

	private static int add;
	private static int gam;
	private static int gop;
	private static int mok;
	private static int nam;
	
	private int Add(int x, int y) {
		add = x + y;
		System.out.println("덧셈: "+add);
		return 0;
	}
	private int Gam(int x, int y) {
		gam = x-y;
		System.out.println("뺄셈: "+gam);
		return 0;
	}
	private int Gop(int x, int y) {
	gop = x*y;
	System.out.println("곱셈: "+gop);
	return 0;
	}
	private int Mok(int x, int y) {
		mok = x/y;
		System.out.println("나눗셈: "+mok);
		return 0;
	}
	private int Nam(int x, int y) {
		nam=x%y;
		System.out.println("나머지: "+nam);
		return 0;
	}
	
	
	public static void TitleDraw(boolean title) {
		if(title == true) {
			System.out.println("=====가감승제산 프로그램=====");
			System.out.println("| 두 개의 정수를 입력해 주세요. ^^ |");
			System.out.println("");
			System.out.println("=======================");
		}
		System.out.println("========================");
		}
	
	
	public static void main(String[] args) {

TitleDraw(true);
		
		
caculator cac = new caculator();

int a, b;
String c;

Scanner input = new Scanner(System.in);
System.out.printf("연산 인자를 입력");
a=input.nextInt();
Scanner input2 = new Scanner(System.in);
System.out.printf("연산 인자2를 입력");
b=input2.nextInt();


cac.Add(a,b);

cac.Gam(a,b);

cac.Gop(a,b);

cac.Mok(a,b);

cac.Nam(a,b);


TitleDraw(false);

	}



}
