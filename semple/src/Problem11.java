import java.util.Scanner;

/*  
 * 2차원 공간상의 좌표값을 입력하여 몇사분면인지 확인하세요.
  */
public class Problem11 {

	public static void main(String[] args) {

		int x, y;

		System.out.println("좌표값(x, y)을 입력하세요");
		Scanner sc = new Scanner(System.in);
		System.out.printf("x : ");
		x = sc.nextInt();
		System.out.printf("y : ");
		y = sc.nextInt();

		
		// if(x>0 && y>0){1사분면} / else if(x>0 && y<0){4사분면} / else if(x<0 && y>0){2사분면} / else if(x<0 && y<0{3사분면}
		// else if(x==0 && y!=0){y축} / else if(y==0 && x!=0){x축} / else (x=0 && y=0){중심} 
		if (x > 0) {
			if (y > 0) {
				System.out.println("입력한 좌표 (" + x + ", " + y + ")는 1사분면 입니다.");
			} else if (y < 0) {
				System.out.println("입력한 좌표 (" + x + ", " + y + ")는 4사분면 입니다.");
			}
		} else if (x < 0) {
			if (y > 0) {
				System.out.println("입력한 좌표 (" + x + ", " + y + ")는 2사분면 입니다.");
			} else if (y < 0) {
				System.out.println("입력한 좌표 (" + x + ", " + y + ")는 3사분면 입니다.");
			}
		}

		if (x == 0) {
			if (y != 0) {
				System.out.println("입력한 좌표 (" + x + ", " + y + ")는 y축에 있습니다.");
			} else {
				System.out.println("입력한 좌표 (" + x + ", " + y + ")는 중심축 입니다.");
			}
		}

		if (y == 0 && x != 0) {
			System.out.println("입력한 좌표 (" + x + ", " + y + ")는 x축에 있습니다.");
		}

	}

}
