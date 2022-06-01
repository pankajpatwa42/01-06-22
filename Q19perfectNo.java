package Assignmen01;

import java.util.Scanner;

public class Q19perfectNo {

	public static void main(String[] args) {
		long n, sum=0,n1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. to check Perfect or not :");
		n = sc.nextLong();
		n1=n;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
//				System.out.print(i+" ");
				sum = sum+i;
		}
		if(sum==n1)
			System.out.println(n1+" is a perfect number. ");
		else
			System.out.println(n1+" is not a perfect number. ");

		
	}

}
