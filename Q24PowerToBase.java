package Assignmen01;

import java.util.Scanner;

public class Q24PowerToBase {
	
	public int powertobase(int b,int p)
	{
		int result = 1;
		while(p!=0)
		{
			result = result*b;
			p--;
		}
		return result;	
	}
	public static void main(String [] args) {
		
		int base,power;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base Value : ");
		base = sc.nextInt();
		System.out.println("Enter Power value : ");
		power = sc.nextInt();
		Q24PowerToBase p1 = new Q24PowerToBase();
		int r1 = p1.powertobase(base,power);
		System.out.println(r1);

		
	}
}
