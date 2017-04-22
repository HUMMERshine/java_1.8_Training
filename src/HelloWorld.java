import java.util.*;
import java.util.List;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("helloworld");
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
		list.sort((a, b) -> b.compareTo(a));
		
		System.out.println(list);
	}
	
	
}
