package test2;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInstance test = new TestInstance();
		Scanner sc = new Scanner(System.in);
		System.out.println("기반이 되는 코드를 입력해주세요.");
		String acgtSequence = sc.nextLine();
		System.out.println("찾아야 하는 코드를 입력해주세요.");
		String codon = sc.nextLine();
		
		test.findcodon(acgtSequence, codon);
		//ACCGGCCGAGACAGCGAGCATATGCCGCCGAGACAGGCCGGACCGGCCGAGA
		//GCCG
	}

}
