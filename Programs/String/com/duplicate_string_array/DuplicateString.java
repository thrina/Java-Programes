package com.duplicate_string_array;

 
public class DuplicateString
{
  public static void main(String[] args) {
    String []name= {"java","python","dbms","java","c++","python","dbms"};
    System.out.print("The Duplicate Straing are: ");
	for(int i=0;i<=name.length;i++) {
		
		for(int j=i+1;j<name.length;j++) {
		
			if(name[i]==name[j]) {
				System.out.print(name[i]+" ");
			
			}
			
		}
		
	}
 }
}
	
