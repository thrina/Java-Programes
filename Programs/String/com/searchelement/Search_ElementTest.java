package com.searchelement;

 class Search_Element {
    public int Search_Element(int array[], int key)
    {
    	for(int i=0;i<array.length;i++)
    	{
    		if(array[i]==key) {
    			return 1;
    		}
    		
    	}
     return -1;	
    }
	
}


public class  Search_ElementTest
{
public static void main(String[] args) {
	Search_Element search=new Search_Element();
	int array[]= {5,9,5,10,4,9};
	int key=5;
	int searchNumber=search.Search_Element(array, key);
	System.out.println("The search Number is "+searchNumber);
	
}	
}