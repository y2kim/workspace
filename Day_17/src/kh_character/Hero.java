package kh_character;

import kh_item.Sword;

public class Hero {
	private int level =1;
	private String name;
	private int gold =100;
	private int attack =10;
	private int defense =10;
	private int HP = 100;
	//칼은 정의가 하기 힘드니 칼이라는 자료형을 따로 만들어야함 
	private Sword sword = new Sword("맨손",1);
	
	
	public Hero(String name) {
		this.name = name;
	}
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public Sword getSword() {
		return sword;
	}
	public void setSword(Sword sword) {
		this.sword = sword;
	}
	
	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public void printStatus() { // Player.getGold()  <- 지역이 다르므로 
		System.out.println("주인공 이름 : " + this.name);
		System.out.println("주인공 레벨 : " + this.level);
		System.out.println("주인공 보유골드 : " + this.gold);
		// 1.메소드 인수 전달  2.public static 
	}
//	public void printSwordInfo() {
//		System.out.println("주인공 소유한 칼 : " + this.sword.getName()+"power : " +this.sword.getAttackPoint() );
//	}
	
	public void printALLStatus() { // Player.getGold()  <- 지역이 다르므로 
		System.out.println("주인공 이름 : " + this.name);
		System.out.println("주인공 레벨 : " + this.level);
		System.out.println("주인공 보유골드 : " + this.gold);
		System.out.println("주인공 공격력 : " + this.attack);
		System.out.println("주인공 방어력 : " + this.defense);
		try {
			System.out.println("주인공 소유한 칼 : " + this.sword.getName()+"power : " +this.sword.getAttackPoint() );
		} catch (Exception e) {
			System.out.println("무기를 소유하고 있지 않습니다.");
		}
		
		// 1.메소드 인수 전달  2.public static 
	}
}
