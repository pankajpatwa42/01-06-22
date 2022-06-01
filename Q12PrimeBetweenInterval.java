package Assignmen01;

import java.util.Scanner;

public class Q12PrimeBetweenInterval {

	public static void main(String[] args) {

		int start , end;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Start point :");
		start = sc.nextInt();
		System.out.println("Enter end point :");
		end = sc.nextInt();
		while(start<end)
		{
			boolean flag = true;
			for (int i =2;i<=end/2;i++)
			{ 
		
				if(start%i==0) 
				{
				flag = false;
				break;
				}
//			else
//				System.out.println(start);
			
		}
		if(flag==true)
			System.out.println(start + " is a prime number.");
		else
			System.out.println(start + " is not a prime number.");
		
		++start;

		}
	}

}
