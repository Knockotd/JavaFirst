package lasttimetest;

public class Main {

	public static void main(String[] args) {

		int [] ar = {10, 30, 70, 40, 15};
		
		//가장 큰 수의 위치
		int m = 0;
		for(int j=0; j<5;j=j+1) {
			for(int i=0; i<5; i=i+1) {
		if(ar[i] > ar[m]) {
			m = i;
		}else {
			m=m;
		}
		}
		
		if(ar[j] == ar[m]) {
			System.out.println("최대 값 = "+ar[j]+"최대 값의 위치 = "+m);
		}
	}
	}

}
