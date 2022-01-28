package concepts;

import java.util.Scanner;

public class TwoDArray {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("enter size of 2d array:\n");


		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of row:\n");
		int a = scan.nextInt();
		System.out.println("enter size of cloumn:\n");
		int b = scan.nextInt();
		int c[][] = new int[a][b];

		for(int i=0; i<a; i++)
		{
			for(int j=0; j<b; j++)
			{
				System.out.println("Enter value for row & column matrix of "+i+" and "+j);
				c[i][j] = scan.nextInt();
			}


		}
		System.out.println("The 2D array value entered are:\n");
		for(int i=0; i<a; i++)
		{
			for(int j=0; j<b; j++)
			{
				System.out.print(+c[i][j]+" ");
			}
			System.out.println();

		}

	}

}
