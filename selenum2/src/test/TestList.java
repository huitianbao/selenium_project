package test;

import java.awt.List;

public class TestList {
	public static void main(String[] args){
		List list=new List();
		
		list.add("Domain");
		list.add("name");
		list.add("value");
		list.add("expiry");
		list.add("path");
		
		for(int i=0;i<5;i++){
			System.out.println(list.getItem(i));
		}
		
		
	}

}
