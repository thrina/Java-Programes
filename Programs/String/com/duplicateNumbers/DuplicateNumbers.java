package com.duplicateNumbers;

public class DuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {9,2,3,3,5,9};
		// This is for looop
		for(int i=0;i<=array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
		 		System.out.print(array[i]+" "); 			
				}
				

			}
			
		}

	}

}
