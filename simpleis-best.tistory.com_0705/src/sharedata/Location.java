package sharedata;

//위치 정보를 가져오는 클래스(가정)
public class Location {

	public double latitude;
	public double longitude;

	public void getLocation() {
		//생성자를 이용한 데이터 전달
		//Map map = new Map(latitude, longitude);
		
		Map map = new Map();
		map.setLatitude(latitude);
		map.setLongitude(longitude);
		
		
		map.showMap();
	}
}
