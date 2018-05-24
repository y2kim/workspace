package ncs_test2;

public class Book {
	private String categoty;
	private String bookName;
	private double bookPrice;
	private double bookDiscountRate;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.categoty +" "+ this.bookName +" "+ this.bookPrice +" "+ this.bookDiscountRate ;
	}
	
	public Book(String categoty, String bookName, double bookPrice, double bookDiscountRate) {
		
		this.categoty = categoty;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	
	public String getCategoty() {
		return categoty;
	}
	public void setCategoty(String categoty) {
		this.categoty = categoty;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public double getBookDiscountRate() {
		return bookDiscountRate;
	}
	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	
	
}
