package Assignmen01;

import java.util.Scanner;

public class Q22Table {

	public static void main(String[] args) {
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to want table : ");
		input = sc.nextInt();
		for(int i=1;i<11;i++)
		{
			System.out.println(input+" * "+i+" ="+" "+(i*input));
		}
	}

}
