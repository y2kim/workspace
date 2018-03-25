package test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ControlDataPeople {
	
	private ArrayList<People> peopleDB;
	private Map<Integer, ArrayList<People>> map;
	Scanner sc = new Scanner(System.in);
	
	public ControlDataPeople() {
		this.peopleDB = new ArrayList<>();
		this.map = new HashMap<>();
	}
	
	public void PeopleAdd(People person) {
		peopleDB.add(person);
	}
	
	public void hashPeoelsClass(int cla , ArrayList<People> parr) {
		map.put(cla, parr);
	}
	
	
	
}
