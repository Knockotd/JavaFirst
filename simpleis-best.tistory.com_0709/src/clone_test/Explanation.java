package clone_test;

public class Explanation {

	public static void main(String[] args) {
		
			int[][] ar = new int [5][5];
			int cnt =1;
			
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					ar[i][j] = cnt;
					cnt=cnt+1;
				}
			}

			/*for(int i=0; i<5; i++) {
				for(int j=0; j<5;j++) {
					System.out.pritnf("%3d",ar[i][j]);
				}
				System.out.printf("\n");
			}*/
			
			//출력문 for문 1번만 돌리는 방법
			for(int i=0; i<25; i++) {
				System.out.printf("%3d", ar[i/5][i/5]);
				if(i%5 == 4)
					System.out.printf("\n");
			}
	}

}