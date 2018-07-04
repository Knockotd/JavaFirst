package isa;

public class Main {

	public static void main(String[] args) {
		Isa emp1 = new Isa(1);
		//객체의 내용을 확인하고자 하면 System.out.println 메소드에 객체의 이름만 대입.
		System.out.println(emp1); 
		
		Isa emp2 = new Isa(2);
		System.out.println(emp2);
		 
		Manager man1 = new Manager();
		System.out.println(man1);
	}

}
