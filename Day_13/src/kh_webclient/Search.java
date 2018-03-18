package kh_webclient;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		URL myurl = new URL("https://datalab.naver.com/keyword/realtimeList.naver?where=main");
		HttpURLConnection con = (HttpURLConnection)myurl.openConnection();
		Scanner sc = new Scanner(con.getInputStream(),"utf8");
		String[] strarr1 = new String[1150];
		String[] strarr2 = new String[1150];
		
		int i = 0;
		int i2 = 0;
		int start = 1;

		while(true) {
			System.out.println(start +" 번째 새로고침");
			System.out.println("Puase");
			start++;
			int giveGap = (int)((Math.random()*1.1*999)+1);
			int Puase = (int)((Math.random()*10001)+(999+giveGap+1)*1.1)+500;
			Thread.sleep(Puase);
			
			while (true) {
				String line =null ; // 각 라인을 출력할 놈
				try {
					line = sc.nextLine();// 값을 넣는놈
					strarr1[i++] = line;
					strarr2[i2++] = line;


				} catch (Exception e) {
					System.out.println("줄끝남 ");
					break;
				}

			}


			for(int k=0;k<i;k++) {

				if(strarr1[k].contains("<em class=\"num\">")) {
					if(strarr1[k-1].contains("<a href=\"#\" class=\"list_area\">")) {
						System.out.print(strarr1[k].split("\"num\">")[1].split("</")[0]);
						System.out.println(" 위");
					}
				}


				if(strarr1[k].contains("<span class=\"title\">")) {
					if(strarr1[k-1].contains("<em class=\"num\">")) {
						System.out.println(strarr1[k].split("title\">")[1].split("</")[0]);
					}		
				}


				if(strarr2[k].contains("<div class=\"keyword_rank\">")) {
					if(strarr2[k-8].contains(" <em class=\"num\">20</em>")) {
						System.out.println("----------------");
						System.out.println(" 30초 ");
						System.out.println("----------------");
					}
				}	
				
				if(strarr1[k].contains(" <div class=\"keyword_rank select_date\">")) {
					break;
				}

			}
			Thread.sleep(3000);
			
			//con.disconnect();
			System.out.println(" 잠시후 새로 고침 ");
		}

	}

}
