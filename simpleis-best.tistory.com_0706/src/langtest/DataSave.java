package langtest;

public class DataSave {
	//음료수명, 칼로리, 가격을 저장할 변수
	private String juce;
	private double kcal;
	private int price;
	
	//인스턴스 변수를 사용하기 위한 접근자 메소드 - getter & setter
	public String getJuce() {
		return juce;
	}
	public void setJuce(String juce) {
		this.juce = juce;
	}
	public double getKcal() {
		return kcal;
	}
	public void setKcal(double kcal) {
		this.kcal = kcal;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//2개의 내용이 같은지 비교하는 메소드
	//이름은 이퀄스 사용
	public boolean equals (DataSave other) {
		boolean result = false;
		//호출하는 인스턴스의 모델네임과 매개변수의 모델네임이 같으면 츄루를 리턴. 그렇지 않으면 펄스를 리턴.
		if(juce.equals(other.juce)) {
			result = true;
		}
		return result;
	}
	
	//외부 데이터의 값을 빠르게 확인하기 위한 용도로 사용합니다.
	@Override
	public String toString() {
		return "DataSave [juce=" + juce + ", kcal=" + kcal + ", price=" + price + "]";
	}
	

	
}
