package concepts;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		int a, b, c,ch;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers first number");
		a=scan.nextInt();
		System.out.println("Enter numbers second number");
		b=scan.nextInt();
		System.out.println("Select choice 1(Add) or 2(Subs)");
		ch=scan.nextInt();
		
		switch(ch)
		{
		case 1:c=a+b;
		   System.out.println("Addition of two "+c);
		   break;
		case 2:c=a-b;
		   System.out.println("substact of two "+c);
		   break;
		}
		

	}

}
