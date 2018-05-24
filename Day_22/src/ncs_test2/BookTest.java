package ncs_test2;

public class BookTest {
	public static void main(String[] args) {
		 Book bookArray [] = new Book[5];
		 double pricesum = 0;
		 
		 bookArray[0] = new Book("IT", "SQL Plus", 50000, 5);
		 bookArray[1] = new Book("IT", "Java 2.0", 40000, 3);
		 bookArray[2] = new Book("IT", "JSP Servlet", 60000, 6);
		 bookArray[3] = new Book("Nobel", "davincicode", 30000, 10);
		 bookArray[4] = new Book("Nobel", "cloven hoof", 50000, 15);
		
		 for(int i=0;i<bookArray.length;i++) {
			 System.out.println(bookArray[i].getCategoty()+" "+bookArray[i].getBookName()
					 +" "+bookArray[i].getBookPrice()+"원 "+bookArray[i].getBookDiscountRate()+"%");
			 pricesum = pricesum + bookArray[i].getBookPrice();
		 }
		 System.out.println("책 가격의 합:"+pricesum+"원");
	}

}
