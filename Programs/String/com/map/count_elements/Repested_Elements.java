package com.map.count_elements;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Repested_Elements {

	public void dupicate_Map(String str)
	{
	   Map<Character,Integer> map =new HashMap<Character,Integer>();	
	   char []chrs=str.toCharArray();
	   for(Character ch:chrs)
	   {
		   if(map.containsKey(ch))
		   {
			   map.put(ch,map.get(ch)+1);
		   }
		   else
		   {
			   map.put(ch,1);
		   }
	   }
	   
	   
	   Set<Character> keys=map.keySet();
	   for(Character c:keys)
	   {
		   if(map.get(c)>1)
		   {
			   System.out.println(c+"---->"+map.get(c));
		   }
//		   else if(map.get(c)<=0){
//			   System.out.println("NO Repeted Number");
//			   break;
//		   }
	   }
	   		
	}	
	
	
	public static void main(String[] args) {
		Repested_Elements  rep=new Repested_Elements ();
		rep.dupicate_Map("Welcome");
		
	}

}
