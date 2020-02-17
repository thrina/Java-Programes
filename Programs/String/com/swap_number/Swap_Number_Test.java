package com.swap_number;

 class Swap_Number {
  int temp=0;
//  int number1;
//  int number2;
  public  int[] swap_Number(int number1,int number2)
  {
	 System.out.println("Before Swap Number is : "+number1+" "+number2);
	  temp=number1;
	  number1=number2;
	  number2=temp;	 
	  
	  return new int[] {number1,number2};
  }
 }

public class Swap_Number_Test
{
 public static void main(String[] args) {
	 Swap_Number s1=new Swap_Number();
	 int []result=s1.swap_Number(20,80);
	 System.out.println("The After Swap number is "+result[0]+ " "+result[1]); 
}	
}