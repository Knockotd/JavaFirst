package Arrays;
//public class Application implements Comparable{ //크기비교를 하는 메소드 사용할 때.
public class Application {
	
	//인터페이스의 메소드는 모두 추상 메소드이기 때문에 재정의, 오버라이딩을 해야합니다.
	
	
	//Main2
	//저장하고자 하는 항목
	private String aptype;
	private String apname;
	private int down;
	private double grade;
	
	//접근자 메소드
	public String getAptype() {
		return aptype;
	}
	public void setAptype(String aptype) {
		this.aptype = aptype;
	}
	public String getApname() {
		return apname;
	}
	public void setApname(String apname) {
		this.apname = apname;
	}
	public int getDown() {
		return down;
	}
	public void setDown(int down) {
		this.down = down;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double d) {
		this.grade = d;
	}
	@Override
	public String toString() {
		return "Application [aptype=" + aptype + ", apname=" + apname + ", down=" + down + ", grade=" + grade + "]";
	}
	
	
/*	//크기비교를 하는 메소드
	@Override
	public int compareTo(Object o) {
		Application other = (Application)o;

		
		if(this.down > other.down) {return 1;
		//오름차순
		}
		else if(this.down == other.down) {return 0;}
		else {return -1;}
		
		//return this.down - other.down;
		//결과가 양수, 0 , 음수면 되기 때문에 if문 대신에 이렇게 한 줄로 줄여서 써도 된다.
		//내림차순으로 바꾸려면
		//return other.down - this.down;
		//return (this.down - other.down) * -1;//문자는 뺄셈이 안된다. ( 숫자만 가능 )
		return this.apname.compareTo(other.apname); //문자는 이렇게 비교 가능 ( 문자만 가능 )
	}*/

}
