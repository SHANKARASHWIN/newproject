package own;

public class Overriding {

	public static void main(String[]args) {
		Overloading obj = new Overloading();
		obj.course(false);
		obj.course(50.5555f);
		obj.course(5);
		obj.course("ashwin");
	}
}
