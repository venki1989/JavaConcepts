package concepts;

import java.util.Scanner;

public class inputData {

	public static void main(String[] args) {

         int a,b,c;
         System.out.println("Enter 1st number ");
		 Scanner scan=new Scanner(System.in);
         a =scan.nextInt();
         System.out.println("Enter 2nd number ");
         b=scan.nextInt();
         c=a+b;
         System.out.println("Addition of Two "+ c);
         
         if(c>10)
         {
        	 System.out.println("is greater than 10");
        	 
         }
         else {
        	 System.out.println("c is less than 10");
         }
		
	}
	
}
