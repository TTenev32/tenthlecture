package com.twelfthlecture.thissome.newshit;

import java.util.Comparator;

class DigitComparator  implements Comparator<String>{

	@Override
	public int compare(String a, String b) {
		
		return Integer.signum(fixString(a) - fixString(b));
	}
	
	public int fixString(String in){
		return Integer.parseInt(in.substring(0, in.indexOf(" ")));
	}
}