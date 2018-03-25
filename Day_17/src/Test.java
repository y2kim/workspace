
public class Test {
	private int id = 10;
	
	{
		id = 20;
	}
	
	public Test(int id) {
		super();
		this.id = id;
	}

	Test(){
		id = 30;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
