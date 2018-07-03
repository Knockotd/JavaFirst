import java.io.*; //패키지
public class jv_4_4 {

	public static void main(String[] args) 
		throws java.io.IOException { //입력을 받는것-입력 키보드-출력 모니터
		
			int jumsu;
			char hakjum;
			String iput; //문자열
			System.out.println("*****result*****");
			System.out.print("Input jumsu: ");
			InputStreamReader kkk = new InputStreamReader (System.in);
			//                        오브젝 / 넘김 / 메모리 할당 / 클래스 / 입력
			// 새로운 클래스를 할당 받아서 이 클래스에 의해 입력을 받아(기본적으로 1바이트씩 모은다) 오브젝에 넘긴다.
			BufferedReader bbb = new BufferedReader(kkk);
			// 모은다        /오브젝 / 할당받는다 / 모은다
			// 오브젝 kkk를 모아서 bbb오브젝에 다시 모은다.
			iput = bbb.readLine(); //불러들인다.
			//오브젝트명.메소드명
			jumsu = Integer.parseInt(iput); //숫자로 바꿈 // parse-바꿈 // int-정수형
			//클래스명.메소드명(데이타)
			//인티저가 java.io.*에 있는 거라서 굳이 길게 쓰지 않아도 쓸 수 있다.
			if(jumsu >= 90)
				hakjum = 'A';
			else if (jumsu >= 80)
				hakjum = 'B';
			else if(jumsu >=70)
				hakjum ='C';
			else if (jumsu >=60)
				hakjum = 'D';
			else
				hakjum = 'F';
			System.out.println("Hakjum: " + hakjum);
		}

	}

