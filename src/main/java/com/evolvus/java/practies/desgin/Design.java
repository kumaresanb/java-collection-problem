package com.evolvus.java.practies.desgin;

public class Design {
	
	private static Design design=null;
	
	private Design() {
		
	}
	
	public static Design getInstance() {
		if(design==null) {
			design=new Design();
		}
		return design;
	}

}
