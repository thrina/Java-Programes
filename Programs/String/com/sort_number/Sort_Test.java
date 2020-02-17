package com.sort_number;

 class Sort_Number {
	
	int []array;
	public void sort_Number(int []array)
	{
		this.array=array;
	}

	public int get_Number()
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				int temp=0;
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				   // return array[i];	
				}
			}
			
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print((array[i])+" ");
		}
		
		
		return -1;
	}
}

public class Sort_Test
{
 public static void main(String[] args) {
	 Sort_Number sort=new Sort_Number();
	 int array[]= {20,80,30,100,40,90};
	 sort.sort_Number(array);
	 sort.get_Number();
//	 System.out.println(numbers+" ");
	 
   }	
}
