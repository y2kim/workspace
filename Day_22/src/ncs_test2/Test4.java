package ncs_test2;

import java.util.HashMap;

public class Test4 {

	public static void main(String[] args) {
		 HashMap<String, Book> map = new HashMap<>();
		 Book bookArray [] = new Book[5];
		 
		 bookArray[0] = new Book("IT", "SQL Plus", 50000, 5);
		 bookArray[1] = new Book("IT", "Java 2.0", 40000, 3);
		 bookArray[2] = new Book("IT", "JSP Servlet", 60000, 6);
		 bookArray[3] = new Book("Nobel", "davincicode", 30000, 10);
		 bookArray[4] = new Book("Nobel", "cloven hoof", 50000, 15);
		 
		 map.put("go", bookArray[0]);
		 map.put("shit", bookArray[1]);
		 map.put("hole", bookArray[2]);
		 map.put("split", bookArray[3]);
		 map.put("park", bookArray[4]);
		 
		 for(String key : map.keySet()) {
			 System.out.println(key+" = " + map.get(key));
		 }
		 
		 
	}

}
