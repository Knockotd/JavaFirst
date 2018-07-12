package map_test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class LogTest {

	public static void main(String[] args) {
		// log파일 내용을 읽을 수 있는 Scanner 만들기

		File f = new File("C:\\Users\\503-26\\Desktop\\log.txt");
		HashSet<String> set = new HashSet<String>();
		try {
			Scanner sc = new Scanner(f);
			int sum = 0;
			while (sc.hasNextLine()) {
				// System.out.println(sc.nextLine());
				// 한 줄 읽기

				// 공백으로 분할하기
				String temp = sc.nextLine();
				String[] ar = temp.split(" ");
				//System.out.println(temp);
				//System.out.println(ar[9]);

				// 중복 제거하기
				//set.add(ar[0]);
		
				//트레픽 합계 구하기
				//sum = sum + Integer.parseInt(ar[9]);

				//ip별로 트레픽 합계 구하기

				
			}
		
			//System.out.println(set);
			System.out.println(sum);
			sc.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
