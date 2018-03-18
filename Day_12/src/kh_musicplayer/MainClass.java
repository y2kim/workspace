package kh_musicplayer;

import java.io.FileInputStream;
import java.util.Scanner;

import javazoom.jl.player.Player;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String mp3List ;
		String[] mp3ListArray = new String[3];
		FileInputStream readFile;
		//readFile = new FileInputStream();
		for(int i=0;i<mp3ListArray.length;i++) {
			
		}
		
		while(true) {
			int selectMenu =0 ;
			System.out.println("메뉴를 선택하세요");
			System.out.print("(4):종료 // 1,2,3 중선택  : ");
			while(true) {
				try {
					selectMenu = Integer.parseInt(sc.nextLine());
					break;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("잘못입력하셨습니다.");
					System.out.println("다시 입력하세요 ");
					System.out.print("(4):종료 // 1,2,3 중선택  : ");
				}
			}

			switch (selectMenu) {
			case 1:
				mp3List = "Kalimba.mp3" ;
				try{
					FileInputStream fis = new FileInputStream(mp3List);   // 파일없어서 여기서 오류남  <- 이녀석은 음악파일 넣는것
					Player playMP3 = new Player(fis); // 기본 lib 에는 없음 
					playMP3.play(); // 메소드 
				}
				catch(Exception exc){
					exc.printStackTrace();
					System.out.println("Failed to play the file.");
				}
				break;
			case 2:
				mp3List = "Hidden Track.mp3";
				try{
					FileInputStream fis = new FileInputStream(mp3List);   // 파일없어서 여기서 오류남  <- 이녀석은 음악파일 넣는것
					Player playMP3 = new Player(fis); // 기본 lib 에는 없음 
					playMP3.play(); // 메소드 
				}
				catch(Exception exc){
					exc.printStackTrace();
					System.out.println("Failed to play the file.");
				}
				break;
			case 3:
				mp3List = "Sleep Away.mp3";
				try{
					FileInputStream fis = new FileInputStream(mp3List);   // 파일없어서 여기서 오류남  <- 이녀석은 음악파일 넣는것
					Player playMP3 = new Player(fis); // 기본 lib 에는 없음 
					playMP3.play(); // 메소드 
				}
				catch(Exception exc){
					exc.printStackTrace();
					System.out.println("Failed to play the file.");
				}
				break;
				
			case 4:
				System.out.println("프로그램 종료합니다");
				System.exit(0);
				break;
				
			default:
				System.out.println("잘못 선택하였습니다.");
				break;
					
			}
			

		}
	}
	
}



