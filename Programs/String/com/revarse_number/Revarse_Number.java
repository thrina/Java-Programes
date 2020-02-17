package com.revarse_number;

public class Revarse_Number {
	public static void main(String[] args) {
		int number=12345;
		int reminder=0;
		int revarse=0;
		while(number!=0)
			{
			reminder=number%10;
			revarse=revarse*10+reminder;
			number/=10;
			}
		System.out.println("The Revarse Number is "+revarse);
	}

}
