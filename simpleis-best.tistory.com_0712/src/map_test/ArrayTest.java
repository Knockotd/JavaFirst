package map_test;

public class ArrayTest {

	public static void main(String[] args) {
		// 각 애니메이션 영화 별 등장인물 명단, 배열로 만들기
		String [] senchi = {"치히로", "검댕이", "보             ", "유바바"};
		String [] hawul = {"소피   ","하울   ","카루시파"};
		String [] totoro = {"토토로","사츠키","메이"};
		//간격을 맞추려면 \t는 글자 수에 따라 넘어가므로, 적은 글자수를 늘려주면 된다.
		
		//데이터 추가
		String [] catboeun = {"하루   ", "바론   ", "치카   ","유키   "};
		
		//String 배열의 배열 + 데이터 추가
		String [][] animationmovie = {senchi, hawul, totoro, catboeun};
		
		//출력에 영향이 감.
		//출력에 영향이 안가는 게 제일 좋은 프로그램이다.
		
		
		//이차원 배열의 데이터 출력
		//큰 배열에 포함된 작은 배열의 데이터 개수만큼 반복
		for(int i=0; i<animationmovie.length; i=i+1) {
			if(i==0) {
				System.out.print("Senchi" + "\t");
			}else if(i==1) {
				System.out.print("Hawul " + "\t");
			}else if(i==2) {
				System.out.print("Totoro" + "\t");
			}
			// 데이터 추가
			else if(i==3) {
				System.out.print("Catboeun" + "\t");
			}
			//작은 배열을 순서대로 가져오고
			String [] imsi = animationmovie[i];
			//작은 배열의 데이터 개수만큼 반복
			for(int j=0; j<imsi.length; j=j+1) {
				System.out.print(imsi[j] + "\t");
			}
			System.out.println("");
		}
		
	}

}
