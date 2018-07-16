
public class ThreadEx1Main {

	public static void main(String[] args) {
			//클래스의 런 메소드 이용
		//어떤 클래스를 사용을 하고자 할 때, 메소드에 스테틱이 없다면 항상 1번은 인스턴스를 만드는 것입니다.
		//인스턴스를 만들 때 생성자를 생각해야 합니다.
		//생성자는 클래스의 이름과 똑같은 이름을 가졌습니다.
		//클래스 안에 그런 이름이 없다면 기본 생성자를 가집니다.
		ThreadEx1 th1 = new ThreadEx1();
		//스레드 시작
		th1.start();

	}

}
