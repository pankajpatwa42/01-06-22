package Assignmen01;

import java.util.Scanner;

public class Q15factorial {

	public static void main(String[] args) {
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for factorial :");
		int input = sc.nextInt();
		
		for (int i=1;i<=input;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factoial of given number is :"+fact);
	}

}
