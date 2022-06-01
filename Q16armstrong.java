package Assignmen01;
import java.util.*;

public class Q16armstrong {

	public static void main(String[] args) {
		int number = 371,on,rem;
		double result=0;
		on = number;
		while(on!=0)
		{
			rem = on%10;
			result = (result+Math.pow(rem, 3));
			on = on/10;
		}
		if(number==result)
			System.out.println("It is Armstrong Number "+number);
		else
			System.out.println("It is not Armstrong Number "+number);

			
	}

}
