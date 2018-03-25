package kh_character;

import java.util.Scanner;
import kh_character.*;
import kh_item.Sword;

public class ShopKeeper {
	Hero player ;
	Sword sword ;  // 만들어 놓고 팔아주는것   <- 주소가 같음   <- 뺐기고 사는현상
	public void shopProcess(Hero player) {
		Scanner sc = new Scanner(System.in);
		System.out.println(player.getName() +" glad your self");
		System.out.println("what can i help");
		System.out.println("1. 검을 선택. (100G)");
		System.out.println("선택 : ");
		String menu = sc.nextLine();
		if(menu.equals("1")) {
			sword = new Sword("iorn pipe",25);
			System.out.println("사시겠습니까 ?");
			System.out.println("현재 보금 자원"+player.getGold());
			System.out.println("선택 : y,n ");
			if(player.getGold() >=100) {
				String buy = sc.nextLine();
				if(buy.equals("y")) {
					player.setGold(player.getGold() - 100);
					player.setSword(sword);
					int beforepower  = player.getAttack();
					int afterpower = sword.getAttackPoint();
					player.setAttack(beforepower+afterpower);
					System.out.println("칼을 사셨습니다.");
					System.out.println("현재 보금 자원 : "+player.getGold());
					player.printALLStatus();
					
				}else if(buy.equals("n")) {
					System.out.println("구입을 취소하였습니다.");
					System.out.println("현재 보금 자원 : "+player.getGold());
					player.printALLStatus();
				}
			} else {
				System.out.println("돈이 모자랍니다");
			}
			
			
		}
		
	}
	
}
