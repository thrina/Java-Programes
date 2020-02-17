package com.revarse_string;

 class ReavarseString {
	private String rev="";
	private String name;
	
	public void setName(String name)
	{
		this.name=name;
		
	}
	public String getName()
	{
		for(int i=name.length()-1;i>=0;i--)
		{
			 rev=rev+name.charAt(i);
		}
		return rev;		
	}
}

 public class ReavarseStringTest
 {
	 public static void main(String[] args) {
		 ReavarseString  revarse=new  ReavarseString ();
		 revarse.setName("Channai");
		 String name=revarse.getName();
		 System.out.println("The Revarse String is "+name);
	}
 }