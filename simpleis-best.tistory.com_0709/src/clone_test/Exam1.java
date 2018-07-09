package clone_test;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// 금액을 입력받아서 오만원, 만원 짜리를 몇 장 주어야 하는지 계산하는 프로그램을 작성
		//ex. 금액 : 260000 -> 입력
		//		결과 : 5만원 5장, 만원 1장 -> 출력
		
		Scanner sc1 = new Scanner(System.in);
		while(true) {
		System.out.println("금액 : ");
		String scget1 = sc1.nextLine();
		int money = Integer.parseInt(scget1);
		
		if(money % 10000 != 0) {
			System.out.println("10000원 단위로 입력해주세요.");
			continue;
		}else {
		int five = money / 50000;
		int one = (money % 50000) / 10000;
			System.out.println("5만원 "+five+"장, 만원 : "+one+"장");
			break;
		}
		}
		
		
		// 아래와 같은 모양을 출력하세요.
		//***
		//**
		//*
		//**
		//***
		//0		2	-i+2
		//1		1	-i+2
		//2		0	-i+2
		//3		1	i-2
		//4		2	i-2
		
		//----------------------------------
		//*********	0	9	9-2i
		//*******		1	7	9-2i
		//*****		2	5	9-2i
		//***			3	3	9-2i
		//*				4	1	9-2i
		int i, j;
		for(i=0; i<5 ; i=i+1) {
			if(i < 3) {
				for(j=0; j<=-i+2; j=j+1) {
					System.out.printf("*");
				}
			}else {
				for(j=0; j<=i-2; j=j+1) {
					System.out.printf("*");
				}
			}
			System.out.println("");
		}
		for(i=0; i<5; i=i+1) {
		for(j=0; j<9-2*i; j=j+1) {
			System.out.printf("*");
		}
		System.out.println("");
		}
		
		// 다음과 같이 출력하시오.
		//	0	      0				0 -0		1		6
		//	1  	     1 2			1 -1,2		3		5,7
		//	2  	    3   4			3 -3,4		5		4,8
		//	3 	  5       6		5 -5,6		7		3,9
		//	4 	7           8		7 -7,8		9		2,10
		//	5	90123456789	9 -9,9		11		1,11
		//=한글과 컴퓨터 시험 문제
		
		
		int [] ar = new int[11];
		int arsize = ar.length;
		int hfsize = ar.length/2+1;
		for(i=0; i<hfsize; i=i+1) {
			ar[hfsize-i] = i;
			if((hfsize+i)-(hfsize-i) != 10) {
			ar[hfsize+i] = (hfsize+i)-(hfsize-i);
			}else {
				for(j=0; j<=arsize; j=j+1) {
					//마지막 5행 1열부터 어떻게 넣어야 하는지 생각하기.
					ar[j+1] = 0;
				}
			}
		}
		
		
		
		
		
		
		//문자열을 입력받아서 모두 소문자로 변환해서 출력하시오 - 공백은 모두 제거되어야 함.
		//ex) 입력 - "HeL lo"  출력 - "hello"
		
		

		System.out.println("영어를 입력해주세요 : ");
		try{String scget2 = sc1.nextLine();
		int size = scget2.length();
		for(i=0; i<size; i=i+1) {
		char hello = scget2.charAt(i);
		if(hello == ' ') {
			hello = (char)(hello + 95);
		}else if(hello >= 'A' && hello <= 'Z') {
			hello = (char)(hello + 32);
			System.out.print(hello);
		}else if(hello < 'A' && hello >'z') {
			System.out.println("영어로 입력해주세요.");
			break;
		}else {
			System.out.print(hello);
		}
		}
		sc1.close();
		}
		catch(java.util.NoSuchElementException e) {
		System.out.println("알 수 없는 오류입니다.");
		}
		
	}

}
