import java.util.ArrayList;

class A{
	public void func() {
		
	}
	
	public String toString() {
		return "Hello";
	}
	
}

class B {
	
}

public class Exam {
//0 -> defalut ->  inicialrize-> construc - >  set
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test aaa = new Test();
		
		System.out.println(aaa.getId());
		aaa.setId(40);
		System.out.println(aaa.getId());
		
		A a = new A();
		B b = new B();
		ArrayList<String> test = new ArrayList<>();
		test.add("hello");
		test.add("World");
		System.out.println(test);
		String s = new String("Hello"); 
		System.out.println(a);
		System.out.println(a.toString());
		a.func();// <-
		System.out.println(b);
		//Object : 근원지 
		//b.toString();
		System.out.println(s);
		
		//s.toString() ;  
		//toString()  = 암묵적으로 붙여진다.
		/*toString() = object  상속을 받았다    물려받을걸 overriding 해서 
		 * 
		 * */
	}

}
