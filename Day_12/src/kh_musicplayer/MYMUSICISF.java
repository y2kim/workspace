package kh_musicplayer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javazoom.jl.player.Player;
public class MYMUSICISF {
	public static void main(String[] args) {
		
		String[] mp3ListArray = new String[] {"a","b","c","d","e","f","g","h","i","i"};
		FileInputStream readFile;
		
		while (true) {
			
			for(int i=0;i<mp3ListArray.length;i++) {
				int r = (int)(Math.random()*10);
				try {
					FileInputStream fis = new FileInputStream(mp3ListArray[r]+".mp3");
					Player playMP3 = new Player(fis); // 기본 lib 에는 없음 
					playMP3.play(); // 메소드 
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
	}
}
