package Assignmen01;

import java.util.Scanner;

public class Q21armstongbtninterval {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First no. ");
		num1 = sc.nextInt();
		System.out.println("Enter Second no. ");
		num2 = sc.nextInt();
		
		for(int i =num1 ;i<num2 ;i++)
		{
			int check ,sum=0,rem;
			check = i;
			while(check!=0)
			{
				rem = check%10;
				sum = (int) (sum +Math.pow(rem, 3));
				check /=10;
				
			}
			if(sum==i)
				System.out.println(""+i+" is a armstrong ");
			

		}
		

		
	}

}
