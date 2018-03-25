package exam;

import java.util.ArrayList;

class AB{
	public boolean equals(Object obj) {
		Object obj2 ;
		if(obj instanceof String) {
			return true;
		}
		return false;
	}
	public void Aequals() {
		
	}
}

public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB ab = new AB();
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		list.add("Java");
		boolean yoso = ab.equals(list.get(0));
		System.out.println(yoso);
		
		System.out.println(list.contains("World"));
		
		if(list.contains("World")) { // <- for문 안써도 찾음  각각 == 해주는 거임  // equals 은 주소  // String은 예외  그래서 contains 먹힘 
			//overriding 으로도 찾을수 있음   contains: 포함하다
			System.out.println("find ");
		}
		
		for (int i = 0 ;i<list.size();i++) {
			if(list.get(i).equals("World")) {
				System.out.println("월드찾음" + i);
			}
		}
		
		for(String tmp:list) {
			if(tmp.equals("World")) {
				System.out.println("find");
			}
		}
		
	}

}
