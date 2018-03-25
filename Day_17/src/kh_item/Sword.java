package kh_item;

public class Sword {
	private String name;
	private int attackPoint;
	
	public Sword(String name, int attackPoint) {
		super();
		this.name = name;
		this.attackPoint = attackPoint;
	}

	public int getAttackPoint() {
		return attackPoint;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}
	
	
}
