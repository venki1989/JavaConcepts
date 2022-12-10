package concepts;

import java.util.Arrays;
import java.util.Scanner;

public class StringConcept {


	public static void main(String[] args) {
		//CONCATE 1
		String str = new String ("New");
		String str2 =str.concat(" Java");

		System.out.println(str2 + " Without StringBuffer OR StringBuilder");

		//CONCATE 2
		StringBuffer sb = new StringBuffer("New");
		sb.append(" Java");
		System.out.println(sb);
		
		//REVERSE
		System.out.println("Reverse String with StringBuffer "+ sb.reverse());
		System.out.println("Reverse String with StringBuffer "+ sb.reverse());
		StringBuilder sbu = new StringBuilder("MALAYALAM");
		sbu.reverse();
		System.out.println(sbu + " Reverse string with StringBuilder");
	


		try (//CONCATE 3 - FOR LOOP //Palendrome  // If word or number are same from right 2 left or left to right
		Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a String");
			String inputString = scanner.next();
			inputString = inputString.toLowerCase();
			String rev="";
			int len=inputString.length();

			for(int i=len-1;  i>=0;  i--) // (Initialization, Boolean Expression, Update)	
			{
				rev=rev+inputString.charAt(i);//Starting from last character
			}
			rev = rev.toLowerCase();

			if(inputString.equals(rev))
			{
				System.out.println("The String is Panlendrome " + rev);
			}
			else {
				System.out.println("The String is not palendrome "+ inputString);
			}
		}
		
		
		int number = 987654, reverse = 0;  
		
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  //4,5,6
		number = number/10;  //1st ite - 9876
		}  
		System.out.println("The reverse of the given number is: " + reverse);  		
		
		//ANAGRAM - 2 // if number of string have same characters from right to left of left to right
		String Anag1="GOD";
		String Anag2="DOG";
		char[] ch1=Anag1.toCharArray();
		char[] ch2 =Anag2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("Its an anagram");
		}else {
			System.out.println("Its not an anagram");
		}

		//ANAGRAM - LAMDA STREAM Function
		String Occur="MALAYALAM";

		long srtcount=Occur.chars().mapToObj(e->String.valueOf((char)e)).filter(e->e.equals("L")).count();
		System.out.println("Stream func get count " +srtcount);

		//COUNT request caps. small
		String Let="AbcDEFg";

		int Capcount=0;
		int Samllcount=0;
		char m=0;
		char s = 0;
		String caps="";
		String smalls="";
		for(int i=0;i<Let.length();i++)
		{
			if(Let.charAt(i)>='A' && Let.charAt(i)<='Z')
			{
				
				Capcount++;
				s = Let.charAt(i);
				caps = caps+s;
				
				
			}
			
			

			else 
			{
				if(Let.charAt(i)>='a' && Let.charAt(i)<='z') 
				{
					Samllcount++;
					 m = Let.charAt(i);
					smalls=smalls+m;
					 
					
					
				}
				
				
				
			}
			


		}

		
		System.out.println("CapsLetter are : " + Capcount + "and they are " + caps);
		
		System.out.println("SmallLetter are : " + Samllcount + "and they are " + smalls);
		
		
		
		//String s = new String();
             // s.charAt(Samllcount);
		
		
		//Print A to Z and a to z
		char c;

	    for(c = 'A'; c <= 'Z'; c++) //==> A=98, C++= 99 --> CORESPOG LETTER till z
	      System.out.print(c + " ");
	    System.out.println("\n");
	    for(c = 'a'; c <= 'z'; c++)
		      System.out.print(c + " ");

	}
	
	


	

	

}
