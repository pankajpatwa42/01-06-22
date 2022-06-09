package Assignmen01;

import java.util.Scanner;

public class Q18PrimeFactor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Emter the number :");
		int number = sc.nextInt();
		int n=number;
		
		for(int i=2;i<number;i++)
		{
			while(number%i==0)
			{
//				System.out.println(i+" ");
				number/=i;
			}
		}
//		System.out.println(number);
		if(number>2)
			System.out.println("Prime Factor of "+n +" is "+number);
	}

}
