package doback;

import java.io.File;
import java.util.Scanner;

public class ConverterMP3 {
	public static void main(String[] args) {
		File f;
		VideoToAudio vta = new VideoToAudio();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("컨버터 테스팅 ");
		System.out.println("바꾸고 싶은 파일을 써주세요 경로+파일 명   EX) : D:\\lib\\a.mp3  ");
		System.out.print(">>> ");
		String where = sc.nextLine();
		vta.RootFile(where);
		System.out.println("어디다가 저장하고 파일명을 어떻게 바꿀껀지 적으세요   EX) : D:\\lib\\a.mp3  ");
		System.out.print(">>> ");
		String put = sc.nextLine();
		vta.setRootFile(put);
		System.out.println("변환 시작");
		vta.ConvertToAudio();
		
		
	}
}
