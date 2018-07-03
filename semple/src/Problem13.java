/*은행에 500만원이 저축되어 있습니다.
 * 50만원이면 백화점에가서 곰인형을 구입합니다.
 * 80만원이면, 아울렛에 가서 원피스를 구입합니다. 
 * 아니면, 20만원이면 이마트에 가서 런닝화를 구입합니다.
 * 그것도 아니라 10만원이면 술집(막걸리)으로 가서 술+안주 등을 먹습니다.
 * 아니면, 잔돈에서 10%를 과자값으로 사용합니다.(라면, 떡볶이, 맛동산, 오잉 등)
 * 잔돈은 다시 저축합니다.
 * 스위치 케이스를 써서 프로그래밍을 하세요
 */
public class Problem13 {

	public static void main(String[] args) {

		
		int a = 5000000;
		int one=800000, bear=500000,run=200000,beer=300000,rameun=5000,mat=50000;
		

			
			switch(a) {
			case 50:	System.out.printf("백화점에서 곰인형을 구매합니다.");
			bear *= 1;
			case 80:	System.out.printf("아울렛에서 원피스를 구입합니다.");
			one *= 3;
			case 20:	System.out.printf("이마트에서 런닝화를 구입합니다.");
			run *= 2;
			case 10:	System.out.printf("비어에서 주전부리를 구입합니다.");
			beer *= 1;
			default: System.out.printf("나머지의 10%에서 라면과 맛동산을 구입합니다.");
			int sum = one + beer + run + bear;
			int nam = (a-sum);
			System.out.printf("나머지 %d원입니다.",nam);
			
			int vat = (int) (nam*0.1);
			int nanam = nam-vat;
			
			rameun *= 3;
			mat *= 3;
			
			vat = (rameun+mat);
			nanam += vat;
			
			break;
		}
		

	}

}
