package Assignmen01;

public class Q26FibonacciPattern {

	public static void main(String[] args) {
		int count =5;
		
		for(int i=1;i<count;i++)
		{
			int n1=0,n2=1,n3;
			for(int j=1;j<=i;j++)
			{
				n3 = n2+n1;
				n1=n2;
				n2=n3;
				System.out.print(n3+" ");
			}
			System.out.println();
		}
		
	}

}
