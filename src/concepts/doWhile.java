package concepts;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		
		boolean a;
		System.out.println("Insert Card");
		String card= "YES";
		String data;
		
		do
		{
			Scanner scan = new Scanner(System.in);
			data = scan.next();
			
			if(data.equals(card))
			{
				System.out.println("INSERTED");
				break;
			}
			else
			{
				System.out.println("Not Inserted Please Confirm YES");
			}
						
		}
		while(!data.equals(card));

		
	}

}
