package exam;

import java.io.File;
import java.io.IOException;
//지금 까지 우리는 하드디스크를 사용하지 않음
public class Exam_02 {
/*File    중간 매게체인 램 를 통하여  건들어야 한다   CPU에서 하드디스크를 처리못함 
 * 램에 복사후  사용한다   파일클래스 사용해야 함
 *  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File files = new File("D:\\Act\\H.jpg"); // 경로및파일 구분할때는  \\ , /  이렇게 구분 한다  // 확장자 까지 
		File fdir = new File("D:\\Act");
		//files.listFiles();
		File[] flist = fdir.listFiles();
		for(File tmp:flist) { //  : 컬랙션
			System.out.println(tmp.isFile()+" : "+tmp.getName());
			//System.out.println(tmp.getPath());
		} // deldete 는 파일은 지워지는데 경로하면 파일 체크한다  즉 결국 파일만 사라짐 
//		Boolean bol = false;
//		bol = files.isFile();
//		System.out.println(bol);
//		bol = files.exists();
//		System.out.println(bol);
//		bol = files.isDirectory();
//		System.out.println(bol);
//		bol = fdir.isDirectory();
//		System.out.println(bol);
//		System.out.println(files.length());
//		System.out.println(files.canExecute());
//		System.out.println(files.getPath());
//		System.out.println(files.getName());
//		System.out.println(files.mkdir());
//		try {
//			files.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}

}
