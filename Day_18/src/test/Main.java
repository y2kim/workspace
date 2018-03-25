package test;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControlDataPeople cp  = new ControlDataPeople();
		Scanner sc = new Scanner(System.in);
		ArrayList<People>  peo = new ArrayList<>() ;
		
		long startTime = System.currentTimeMillis(); 
		String Month = new SimpleDateFormat("MM").format(startTime);
		String Day = new SimpleDateFormat("dd").format(startTime);
		int md = Integer.parseInt(Month);
		int dd = Integer.parseInt(Day);
		
		System.out.println(Month);
		System.out.println(Day);
		System.out.println(md);
		System.out.println(dd);
//		peo.add((new People(1001, "Kim", 2000, 12, 05))) ;
//		peo.add((new People(1002, "Yoon", 1995, 9, 13))) ;
//		peo.add((new People(1003, "Lee", 1990, 03, 21))) ;
//		cp.hashPeoelsClass(0, peo);
		
		
	}

}
