package isa;

//Isa 클래스를 상속받은 Manager 클래스
public class Manager extends Isa {
	
	
	
	//이렇게 생성자를 직접 만들어서 상위 클래스의 생성자를 부르는 경우는 안드로이드에서 많이 발생합니다.
	public Manager() {
		super(10);
	}
private String task;
 
public String getTask() {
	return task;
}
//메소드의 원형 : setTask(String)
public void setTask(String task) {
	this.task = task;
}

@Override
public String toString() {
	//super.toString()은 상위 클래스 인 Isa의 toString을 호출합니다.
	return super.toString() + "Manager [task=" + task + "]";
}



}
