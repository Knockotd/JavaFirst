package abstracttest;

public class Android extends Smartphone {
	
	public void call() {
		
		
		double x = 10.75;
		//소수 첫째자리 반올림해서 출력하기
		System.out.println("x: " + (int)(x+0.5));
		//소수 둘째자리 반올림해서 출력하기
		System.out.println("x: " + ((int)(x*10+0.5))/10.0);

		
		
	}
	
	public void array() {
int [] y = new int [10];
		
		for(int i=0; i<10; i=i+1) {
			y[i] = i+1;
		}
		for(int i=0; i<10; i=i+1) {
			y[i] = i+1;
			System.out.printf("y: %d\n", y[i]);
		}
	}

}
