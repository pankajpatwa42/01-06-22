package Assignmen01;

import java.util.Scanner;

public class Q14reverseno {

	public static void main(String[] args) {
		System.out.println("Enter three digit number to reverse :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int reverse = 0;
		while(number!=0)
		{
			int rem = number%10;
			reverse = (reverse * 10) + rem;  
			number /=10;
			
		}
		System.out.println("The reverse of the given number is: " + reverse);  
	}

}
