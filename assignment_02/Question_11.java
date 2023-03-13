

import java.util.Arrays;

public class Question_11 {

	public static void main(String[] args) {
		String[] names = Arrays.copyOfRange(args, 0, args.length);
		String searchName = "John";
		
		boolean found = false;
		
		for(String name : names) {
			if(name.equals(searchName)) {
				found = true;
				break;
			}
		}
		
		if(found) {
			System.out.println("Name found");
		} else {
			System.out.println("Name not found");
		}
	}

}