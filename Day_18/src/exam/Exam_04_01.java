package exam;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exam_04_01 {
	//interface  - 이거 하는꼭 지켜야 하는거 usb 같은거 // 설계중 강요   - 추상메소드의 집합  //<- 설계목적
	public static void func(List<String> a) {
		
	}
	
	public static void main(String[] args) {
		long currentTime = System.currentTimeMillis();
		ArrayList<String> al = new ArrayList<>();
		LinkedList<String> ll = new LinkedList<>();
		func(al);
		func(ll);
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년MM월dd일 hh시mm분ss");
		System.out.println(sdf.format(currentTime));
		//util <- 인터페이스  규약
		//awt <-  윈도우 그래픽 같은거 
	}
}
