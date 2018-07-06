package exceptionhandling;

public class Main2 {
	public static void main(String[] args) {

		// 문자열 배열 생성
		String[] ar = { "안정은", "박연주", "이자영" };

		try {
			// 배열의 데이터를 순회하면서 출력
			int size = ar.length;
			// size까지 진행해서 예외가 발생
			for (int i = 0; i < size; i = i + 1) {
				System.out.println(ar[i]);
				if(i>1) {
					throw new NumberFormatException("강제로 예외 발생");
				}
			//	System.out.println(Integer.parseInt(ar[i]));
			}
		}
		catch (Exception e) {
			// 예외 내용 출력
			System.out.println(e.getMessage());
			// 예외 내용 추적
			e.printStackTrace();
		}
	/*	catch (ArrayIndexOutOfBoundsException e) {
			// 예외 내용 출력
			System.out.println(e.getMessage());
			// 예외 내용 추적
			e.printStackTrace();
		}
*/
		/*catch (NumberFormatException e) {
			// 예외 내용 출력
			System.out.println(e.getMessage());
			// 예외 내용 추적
			e.printStackTrace();
		}*/
		
		finally {
			System.out.println("즐거운 우리들");
		}

	}
}
