package abstraction_Example;

abstract class bike{
	abstract void run();
}


class honda extends bike{
	void run() {
		System.out.print("this is the sub class");
	}
}

public class susobhan {
	public static void main(String args[]) {
		
		bike b = new honda();
		b.run();
	}
	

}
