package com.string_palandrome;

public class String_Palandrome {

	public static void main(String[] args) {
				
		String name="madam";
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		 rev=rev+name.charAt(i);
			if(name.equals(rev)) {
			
			 System.out.println("is palndrome");	
			}
			
	    	 else {
				System.out.println("is not palandrome");
			}
			}
			
		}


