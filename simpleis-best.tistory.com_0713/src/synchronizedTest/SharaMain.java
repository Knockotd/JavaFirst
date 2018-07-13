package synchronizedTest;

public class SharaMain {

	public static void main(String[] args) {
		
		Share1 share = new Share1();
		
		Produce p =new Produce(share);
		Customer c =new Customer(share);
		
		p.start();
		c.start();
		


	}

}
