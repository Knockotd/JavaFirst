package polymorphism;

//Super  클래스를 상속받은 Sub 클래스
public class Sub extends Super {
	//아래 어노테이션이 에러가 발생하지 않으면 제대로 오버라이딩 한 것입니다.
	@Override
	public void display() {
		System.out.println("Helllo, Nice meet you");
	}
	
	public void noknok() {
		System.out.println("오버라이딩을 하지 않을 메소드");
	}
}
 