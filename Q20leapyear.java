package Assignmen01;

import java.util.Scanner;

public class Q20leapyear {

	public static void main(String[] args) {
		int year;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter year to check it leap or not : ");
		year = sc.nextInt();
		
		if (year%4==0)
		{
			System.out.println(year+" it's a leap year");
		}else
			System.out.println(year+" it's not a leap year");

	}

}
