package Assignmen01;

public class Q17palindrome {

	public static void main(String[] args) {
		int rem,sum=0,temp;
		int number = 121;
		temp = number;
		while(temp>0)
		{
			rem = temp% 10;
			sum = (sum*10)+rem;
			temp =temp/10;
		}
		if(number==sum)
			System.out.println("Palindrome");
		else
			System.out.println(" Not Palindrome");

	}

}
