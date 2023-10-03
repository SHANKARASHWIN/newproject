package own;
import java.util.ArrayList;
public class Test {
public static void main(String[] args) {
	
	ArrayList<String> colour = new ArrayList<String> ();
	
	colour.add("yellow");
	colour.add("green");
	colour.add("violet");
	colour.add("red");
	colour.add("black");
	colour.remove(2);
	
	System.out.println(colour.get(3));
	
	
}
}
