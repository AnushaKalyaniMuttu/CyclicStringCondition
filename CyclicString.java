package com.bean.inter;

import java.util.ArrayList;
import java.util.List;

public class CyclicString {

	public static void main (String [] args) {
		
		List<String> list=new ArrayList<String>();	
		String input="anusha";
		            //012345
		String cyclic="ushaan";
		for(int i=1;i<input.length();i++) {
			                           
			list.add(input.substring(input.length()-i)+input.substring(0, input.length()-i));
		}
					
		if(list.contains(cyclic) || cyclic.equals(input)) {
			System.out.println("The String is a cyclic string");
		}
		else {
			System.out.println("This Stirng is not cyclic");
		}
	}
}
