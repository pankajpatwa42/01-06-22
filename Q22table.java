package Assignmen01;

import java.util.Scanner;

public class Q22table {

	public static void main(String[] args) {
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for table : ");
		input = sc.nextInt();
		for(int i=1;i<=input;i++)
		{
			for(int j =1;j<11;j++ )
			{
				System.out.println(i+" *"+j+" = "+(i*j));
			}
				System.out.println();
		}
		
	}

}
