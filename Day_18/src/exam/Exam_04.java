package exam;

import java.text.SimpleDateFormat;

public class Exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long currentTime = System.currentTimeMillis();
		/*
		 * y 연도
		 * M 월
		 * d 일
		 * h 시간
		 * m 분
		 * s 초
		 * 
		 * */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분");
		System.out.println(sdf.format(currentTime));
		
		
	}

}
