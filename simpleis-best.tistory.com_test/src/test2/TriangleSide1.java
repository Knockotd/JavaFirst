package test2;

public class TriangleSide1 {
	
private int lineNumber;
	public void drawTriangle(int lineNumber) {
		int num = lineNumber;
		int idx = 0;
		for(int i=0; i<num; i++) {
			int j;
			for(j=0; j<(num-1)-i; j++) {
			System.out.print(" ");
			}
			System.out.print(idx%10);
			idx=idx+1;
			if(i>=1 && i<=(num-2)) {
				for(j=0;j<2*i-1;j++) {
						System.out.print(" ");
				}
				System.out.print(idx%10);
				idx=idx+1;
			}
			if(i==(num-1)) {
				for(j=0;j<(num*2-2);j++) {
				System.out.print(j%10);
				}
			}
			
			System.out.println("");
		}
		
	}
}
