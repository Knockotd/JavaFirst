package test2;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하고 Enter : ");
		int num = Integer.parseInt(sc.nextLine());
		sc.close();
		TriangleSide1 t1 = new TriangleSide1();
		t1.drawTriangle(num);
	}

}
