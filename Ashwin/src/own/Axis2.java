package own;

public class Axis2 implements Impelements {

		public void business() {
		System.out.println("own business");
	}
public void vehicle() {
	System.out.println("bike");
}
public void subject() {
	System.out.println("python");
}
public void ph_no() {
	System.out.println(558401235);
}
public void salary() {
	System.out.println("2000");
}
public static void main(String[] args) {
	Axis2 obj = new Axis2();
	obj.business();
	obj.ph_no();
	obj.salary();
	obj.subject();
	obj.ph_no();
}

}
