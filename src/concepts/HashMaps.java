package concepts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {

		//Two strings provided, 
		//Check if it is anagram
		//Create HashMap to store the each string value in each hashmap as key value pair
		//Compare both the hashMap
		String str1="MALAYALAM";
		String str2="MALAYALAM";
		Map<Character, Integer> str1Map=new HashMap<Character, Integer>();
		Map<Character, Integer> str2Map=new HashMap<Character, Integer>();
		
		Character ch;
		
		for(int i=0;i<str1.length();i++)
		{
			//get each character traversing through string
			ch=str1.charAt(i);
			if(str1Map.get(ch)==null)
			{
				str1Map.put(ch,1);
			}
			else {
				str1Map.put(ch, str1Map.get(ch)+1);
			}
		}
		
		for(int i=0;i<str2.length();i++)
		{
			//get each character traversing through string
			ch=str2.charAt(i);
			if(str2Map.get(ch)==null)
			{
				str2Map.put(ch,1);
			}
			else {
				str2Map.put(ch, str2Map.get(ch)+1);
			}
		}
		
		if(str1Map.equals(str2Map))
		{
			System.out.println("The string is anagram");
		}
		else {
			System.out.println("The String is not anagram");
		}
	}

}
