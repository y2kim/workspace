package quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Z{
	
	private int a = 10;
	
	public int hashCode() {
		
		return 0;
	}
	
}

public class Quiz_01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> data = new HashSet(); 
		Z z = new Z();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<7;i++ ) { //data.size() 해결 해야함      
			//int i=0;i<7;i++   : 대신 1개 중복되면 사라짐 
			int RanNum = (int)(Math.random()*45+1);
			data.add(RanNum);
		}
		z.hashCode();
		for(int i=0;i<7;i++) {
			int RanNum = (int)(Math.random()*45+1);
			list.add(RanNum);
		}
		
		System.out.println(data);
		for(int Ii:data) {
			System.out.println(Ii);
		}
		System.out.println("-----------------");
		System.out.println(list);
		for(int Ii:list) {
			System.out.println(Ii);
		}
	}

}
