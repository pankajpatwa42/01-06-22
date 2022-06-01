package Assignmen01;

import java.util.Scanner;

public class Q13sumofdigit {

	public static void main(String[] args) {
		int sum=0,number,digit;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number : ");
		 number = sc.nextInt();
		while(number>0)
		{
			digit = number%10;
			sum = sum+digit;
			number=number/10;
		}
		System.out.println("Sum of digit :"+sum);
		
		
	}

}
