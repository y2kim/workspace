package kh_main;

import java.util.Scanner;

import javax.management.monitor.Monitor;

import kh_character.Hero;
import kh_character.Monster;
import kh_character.ShopKeeper;
import kh_managers.Battle_manager;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("<< 게임 세계에 오신 것을 환영합니다. >>");
		System.out.println(" 캐릭터를 생성 하겠습니다. ");
		System.out.println(" 이름을 결정해주세요. ");
		System.out.print(" 이름 : ");
		String name = sc.nextLine();
		Hero Player = new Hero(name); //의도한 값 

		while(true) {
			System.out.println("마을에 도착했습니다.");
			System.out.println("1. 상점으로 간다");
			System.out.println("2. 마을 밖으로 간다");
			String menu = sc.nextLine();
			if(menu.equals("1")) {
				System.out.println("");
				ShopKeeper shop = new ShopKeeper();
				shop.shopProcess(Player);// 골드도 같이 써야 하니 
			}else if (menu.equals("2")) {
				System.out.println("마을 바깥으로 나왔습니다.");
				System.out.println("몬스터를 만났습니다. ");
				Monster m = new Monster("상점주인", 1, 40, 20, 20, 1000);
				System.out.println("전투가 시작되었습니다. ");
				
				Battle_manager bm = new Battle_manager(m, Player);
				bm.fighe();
				
				System.out.println(Player.getGold());
			}

			//Player.printStatus();
		}

	}

}
