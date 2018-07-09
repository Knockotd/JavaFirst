package clone_test;

import java.util.Arrays;

public class Semple1 {

	private int num;
	private String name;
	private String [] hobbies;
	
	//인스턴스 변수를 사용하기 위한 접근자 메소드
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	
	//현재 인스턴스를 이용해서 새로운 인스턴스를 만들어주는 메소드
	public Semple1 clone() {
		Semple1 semple = new Semple1();
		semple.num = this.num;
		semple.name = this.name;
		//semple.hobbies = this.hobbies;
		//참조형은 다시 복제를 해 주어야 합니다.
		semple.hobbies = new String [this.hobbies.length];
		for(int i = 0 ; i < this.hobbies.length ; i = i+1) {
			semple.hobbies[i] = this.hobbies[i];
		}
		return semple;
	}
	
	
	
	//인스턴스 변수의 값을 빠르게 확인하기 위한(디버깅) 메소드
	@Override
	public String toString() {
		return "Semple1 [num=" + num + ", name=" + name + ", hobbies=" + Arrays.toString(hobbies) + "]";
	}
	
	
}
