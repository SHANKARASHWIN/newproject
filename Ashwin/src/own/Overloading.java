package own;

public class Overloading {

	public void course(int id) {
		System.out.println(id);
}
public void course(boolean name) {
	System.out.println(name);
}
	
public void course(float salary) {
		System.out.println(salary);
}
		public void course (String name) {
			System.out.println(name);
}

public static void main(String[] args) {
	Overloading obj = new Overloading();
    obj.course(true);
	obj.course(25);
	obj.course(30000);
	obj.course("ashwin");
	
}
}
