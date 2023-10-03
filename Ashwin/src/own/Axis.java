																																										package own;

public class Axis extends Abstract{
	
	public void business() {
		System.out.println("own business");
	}
public void vehicle() {
	System.out.println("car");
}
public void subject() {
	System.out.println("java");
}
public void ph_no() {
	System.out.println(98401235);
}
public void salary() {
	System.out.println("5000");
}
public void name() {
	System.out.println("ashwin");
}
public void father() {
	System.out.println("aaaaa");
}
public static void main(String[] args) {
	Axis obj = new Axis();
	obj.business();
	obj.vehicle();
	obj.father();
	obj.name();
	obj.ph_no();
	obj.salary();
	obj.subject();
			
}

}
