package concepts;

import java.util.Scanner;

public class forLoop {
	
	static int a;
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner scan = new Scanner(System.in);
		a=scan.nextInt();
		
		for(int i=1; i<=10;i++)
		{
		  System.out.println(a+"*"+i+"="+(a*i));	
		}
			
		
	}

}
