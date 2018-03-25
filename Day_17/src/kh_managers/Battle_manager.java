package kh_managers;

import kh_character.Hero;
import kh_character.Monster;

public class Battle_manager {
	
	private Monster monster;
	private Hero player;
	
	public Battle_manager(Monster monster, Hero player) {
		super();
		this.monster = monster;
		this.player = player;
	}
	
	public void fighe() { // 이미 여기 값을 받았으니 인스턴스를 받을 필요없음
		System.out.println("몬스터 : "+ monster.getName() + " 를 만났다!!!");
		System.out.println(player.getName() + " 의 공격!!");
		int damage = player.getAttack() - monster.getDefs(); // player.getAttack(); + player.gerSword().getAttack();
		System.out.println(damage + " 의 데미지를 입혔다!!");
		monster.setHP(monster.getHP() - damage );
		if(monster.getHP() <=0) {
			System.out.println(monster.getName() + " 을 쓰러뜨렸다!");
			player.setGold(player.getGold() + monster.getGold());
			System.out.println(player.getName() +" 의 승리");
			return;
		}else {
			
		}
		
	}
	
}
