package org.abst;

public class Col extends College {

	@Override
	public void joshep() {
		
		System.out.println("www.joshep.edu.in");
		
	}

	@Override
	public void jamal() {
		
		System.out.println("www.jamal.edu.in");
	}
	
	public static void main(String[] args) {
		
		Col c = new Col();
		c.bishop();
		c.joshep();
		c.jamal();
		c.saranathan();
	}

	
	
}