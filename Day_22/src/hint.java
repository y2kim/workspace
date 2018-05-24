import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class hint {
	public static void main(String[] args) {
		File f = new File("abes");
		try (FileInputStream fis = new FileInputStream(f); 
				BufferedReader br = new BufferedReader(new InputStreamReader(fis)); ){// <- converter 가 있어야 함  // Reader 가 1바이트을  2바이트로 바꾸는 컨버터 
			// InputStreamReader 절대 기본스트림이 아님  입출력 용도가 아님 
			byte[] FileContents = new byte[(int) f.length()];
			String line ;

			while((line = br.readLine())!= null) {
				System.out.println(line);
			}
		}catch (Exception e){

		}
		//		for(byte tmp : FileContents) {
		//			System.out.print((char)tmp);
		//		}
	}
}
