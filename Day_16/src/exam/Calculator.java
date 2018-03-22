package exam;

public class Calculator {
	
	private int num1;
	private int num2;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int plus() {
		return this.num1+this.num2;
	}
	public int minus() {
		return this.num1-this.num2;
	}
	public int mply() {
		return this.num1*this.num2;
	}
	public int divide() {
		return this.num1/this.num2;
	}
	
	
}
