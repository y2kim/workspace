package kh_character;

public class Monster {
	
	private String name ;
	private int level ;
	private int HP ;
	private int atks ;
	private int defs ;
	private int gold ;
	Hero player;
	
	
	public Monster(String name, int level, int hP, int atks, int defs, int gold) {
		super();
		this.name = name;
		this.level = level;
		this.HP = hP;
		this.atks = atks;
		this.defs = defs;
		this.gold = gold;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	public int getAtks() {
		return atks;
	}
	public void setAtks(int atks) {
		this.atks = atks;
	}
	public int getDefs() {
		return defs;
	}
	public void setDefs(int defs) {
		this.defs = defs;
	}
	
	
}
