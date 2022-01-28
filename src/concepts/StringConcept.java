package concepts;

import java.util.Arrays;
import java.util.Scanner;

public class StringConcept {


	public static void main(String[] args) {
		//CONCATE 1
		String str = new String ("New");
		String str2 =str.concat(" Java");

		System.out.println(str2);

		StringBuffer sb = new StringBuffer("New");
		//REVERSE
		System.out.println("Revers String "+sb.reverse());
		//CONCATE 2
		sb.append(" Java");
		System.out.println(sb);

        //CONCATE 3 - FOR LOOP //Palendrome
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String inputString = sc.next();
		String rev="";
		int len=inputString.length();

		for(int i=len-1;i>=0;i--)
		{
			rev=rev+inputString.charAt(i);
		}

		if(inputString.equals(rev))
		{
			System.out.println("The String is Panlendrome");
		}
		else {
			System.out.println("The String is not palendrome "+ inputString);
		}

		System.out.println(rev);

        //ANAGRAM - 2
		String Anag1="DOG";
		String Anag2="GOD";
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
		for(int i=0;i<Let.length();i++)
		{
			if(Let.charAt(i)>='A' && Let.charAt(i)<='Z')
			{
				Capcount++;
			}


			else 
			{
				if(Let.charAt(i)>='a' && Let.charAt(i)<='z') 
				{
					Samllcount++;
				}
			}

		}
		System.out.println("CapsLetter are :"+ Capcount);
		System.out.println("SmallLetter are :"+ Samllcount);


	}

}
