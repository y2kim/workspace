package grade;

public class Vip extends Grade{

	public Vip(int id, String name, int point) {
		super(id, name, point);
		// super 인수값을 전달하지 않으면 에러남
	}

	@Override // <-스프링 들어감 
	/*<- 화살표 확인*/	public double getBonus() {  //추상화된 메소드가 구현되지 않으면 에러  
						return this.getPoint()*0.05;
					}



}
