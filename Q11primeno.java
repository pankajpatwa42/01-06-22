package Assignmen01;

public class Q11primeno {

	public static void main(String[] args) {
		int num = 29;
	    boolean flag = true;
	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) {	      // condition for non prime number
	        flag = false;
	        break;
	      }
	    }

	    if (flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	}

}
