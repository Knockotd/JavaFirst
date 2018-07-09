package clone_test;

public class Main5 {

	public static void main(String[] args) {
		//=>hello world를 100만번 출력하는데 걸리는 시간을 측정해서 출력
		long a = System.currentTimeMillis();
		for(int i=0; i<1000000; i=i+1) {
			System.out.println("Hello World ! ");
		}
		long b = System.currentTimeMillis();
		System.out.println("Hello World ! 를 출력하는 데 걸린 시간 = "+(b-a));
		//=>자신의 자바 버전을 출력
		System.out.println(System.getProperty("java.version"));
			
		//=>path 환경변수의 값을 출력

		System.out.println(System.getenv("path"));
		
		long st = System.currentTimeMillis();
		for(int i=0; i<1000000000; i=i+1) {
			i++;
		}
		long ed = System.currentTimeMillis();
		System.out.println("i++ = "+(ed-st));
		
		long sat = System.currentTimeMillis();
		for(int i=0; i<1000000000; i=i+1) {
			i=i+1;
		}
		long eed = System.currentTimeMillis();
		System.out.println("i++ = "+(eed-sat));
		
		
	}

}
