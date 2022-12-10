package concepts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questions {

	public static void main(String[] args) {

		// removeDuplicateWords();
		// getWordCount();
		// getDuplicateChar("WINDOWS");
		// checAnagram("tool", "loot");
		// getFirstNonRepChar("ccllaas");
		// reverString("word");
		// chekPalindrome("Malayalam");
		// reverSentence("My name is venkatesh");
		// reverseWordInSentence("My name is venkatesh","for");
		// getSmallLargeIntArr();
		// findMissingNumberArr();
		// findDuplicateNumber("brute");
		// removeDuplicatewordSentence("My name name is venkatesh", "set");
		// reverseNumber(567442);
		fibonacciSeries(10,5,7); // range, firstNumber, secondNumber
		// factorialOf(5);
		// printPyramid(5);

	}

	// ***********//REMOVE DUPLICATE WORDS FROM THE SENTENCE***********
	public static void removeDuplicateWords() {

		String str = "this this is my favourite favourite car my my my is is is is"; // my=2

		String[] splitArray = str.split(" "); // Split the sentence and add to array
		Set<String> mySet = new LinkedHashSet<String>(); // declare set, so set does not hold duplicate data
		for (String a : splitArray) // loop through array with forEach loop
		{
			mySet.add(a);
		}

		Iterator<String> it = mySet.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");

		}
		System.out.println("\n" + "*************************");

	}

//**********GET NUMBER OF WORDS FROM THE SENTENCE*****************

	public static void getWordCount() {
		String str = "this this is my favourite favourite car my my my is is is is";
		Integer count = 1;
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], count); // is.1,my.1
			} else {
				map.put(arr[i], map.get(arr[i]) + 1); // this.2, fa.2, my.2

			}

		}
		for (String x : map.keySet()) {

			System.out.println("The  count of word of " + x + " " + map.get(x));
		}
		System.out.println("*************************");

	}

	// **********GET NUMBER OF CHARACTER DUPLICATES FROM THE WORD*****************
	public static void getDuplicateChar(String word) {
		String str = word.toLowerCase();
		char[] chr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Integer count = 1;
		for (int i = 0; i < chr.length; i++) {
			if (!map.containsKey(chr[i])) {
				map.put(chr[i], count);
			} else {
				map.put(chr[i], map.get(chr[i]) + 1);
			}
		}

		for (Character c : map.keySet()) {
			if (map.get(c) > 1) {
				System.out.println("The count of character " + c + " is " + map.get(c));
			}

		}
		System.out.println("No other Duplicate found");
		System.out.println("*************************");
	}

	// **********GET NUMBER OF CHARACTER DUPLICATES FROM THE WORD*****************

	public static void checAnagram(String first, String second) {
		String word1 = first.toLowerCase();
		String word2 = second.toLowerCase();
		char[] c1 = word1.toCharArray();
		char[] c2 = word2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if (Arrays.equals(c1, c2)) {
			System.out.println("Its an anagram");
		} else {
			System.out.println("Not an anagram");
		}
		System.out.println("*************************");

	}

	// **********GET FIRST NON REPEATED CHARACTER*****************
	public static void getFirstNonRepChar(String str) {
		String word = str.toLowerCase();
		char[] c = word.toCharArray();
		Integer count = 1;
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < word.length(); i++) {
			if (!map.containsKey(c[i])) { // returns the character at i =0/1/2...
				map.put(c[i], count);
			} else {
				map.put(c[i], map.get(c[i]) + 1); // map.get--> returns integer for value at c[i]
			}
		}

		for (Entry<Character, Integer> entry : map.entrySet()) { // another way to iterate map entry
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				System.out.println("****************************");
				break;
			}
		}

	}

	// **********REVERSE A STRING*****************
	public static void reverString(String str) {
		String word = str.toLowerCase();
		String rev = "";
		StringBuffer sb = new StringBuffer(word);
		System.out.println("Using String buffer::Reverse String is " + sb.reverse());

		for (int i = word.length() - 1; i >= 0; i--) {
			rev = rev + word.charAt(i);
		}
		System.out.println("Using forLoop " + rev);
		System.out.println("****************************");

	}

	// **********CHECK FOR PALINDROME*****************
	public static boolean isPallindrome(String str) {
		String word = str.toLowerCase();
		int len = word.length();

		if (len <= 1) {
			return true;
		}

		String first = word.substring(0, 1);
		String last = word.substring(len - 1, len);

		if (!first.equals(last)) {
			return false;
		} else {
			return isPallindrome(word.substring(1, len - 1));

		}

	}

	public static void chekPalindrome(String str) {
		boolean result = isPallindrome(str);
		if (result) {
			System.out.println(str + " is a Palindrome");
		} else {
			System.out.println(str + " is not a Palindrome");
		}
	}

	// **********REVERSE THE SENTENCE*****************

	public static void reverSentence(String sentence) {
		String sent = sentence.toLowerCase();
		String result = "";

		String[] arr = sent.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			result = result + arr[i] + " ";
		}
		System.out.println(result);
	}

	// **********REVERSE EACH WORD IN THE SENTENCE*****************

	public static void reverseWordInSentence(String str, String type) {
		StringBuffer sb;
		String result = "";
		String word = str.toLowerCase();
		String[] arr = word.split(" ");

		if (type.equals("for")) {

			for (String text : arr) {
				String reverseWord = "";

				int i = text.length() - 1;
				while (i >= 0) {
					char ch = text.charAt(i);
					reverseWord = reverseWord + ch;
					i--;
				}

				result = result + reverseWord + " ";

			}
			System.out.println("FOR EACH CONCEPT");
			System.out.println(result);
		} else {
			System.out.println("BUFFER CONCEPT");
			for (String text : arr) {
				sb = new StringBuffer(text);
				sb.reverse();
				System.out.print(sb + " ");

			}
		}

	}

	// **********GET SMALLEST AND LARGEST INT VALUE FROM ARRAYE*****************
	public static void getSmallLargeIntArr() {
		int[] arr = { 5, 2, 55, 1, 554, 785, 4, 1 };

		int largest = arr[0];
		int smallest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];

			} else if (arr[i] < smallest) {
				smallest = arr[i];

			}

		}
		System.out.println("Array items are " + Arrays.toString(arr));
		System.out.println("Largest number is " + largest);
		System.out.println("Smallest number is " + smallest);

	}

	// **********FIND MISSING NUMBER*****************
	public static void findMissingNumberArr() {

		int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		int Expectedsum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		for (int i = 1; i <= 10; i++) {
			Expectedsum = Expectedsum + i;
		}

		System.out.println("Missing number is " + (Expectedsum - sum));

	}

	// **********FIND DUPLICATE IN ARRAY BRUTE FORCE*****************

	public static void findDuplicateNumber(String type) {
		int[] arr = { 2, 3, 3, 5, 22, 55, 5, 7 };

		if (type.equals("brute")) {
			System.out.println("BY BRUTE FORCE LOGIC");
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						System.out.println("DUPLICATE is " + arr[i]);
					}
				}

			}
		} else

		if (type.equals("sort")) {
			Arrays.sort(arr);
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] == arr[i + 1]) {
					System.out.println("Duplicate number is " + arr[i]);
				}
			}
			System.out.println("BY SORT LOGIC");

		} else if (type.equals("hashset")) {
			System.out.println("BY HASHSET");
			Set<Integer> hashSet = new HashSet<Integer>(); // HashSet does not allow duplicates
			for (int x : arr) {
				if (!hashSet.add(x)) {
					System.out.println("The Duplicate element is " + x);
				}
			}
		} else if (type.equals("hashmap")) {
			System.out.println("BY HASHMAP");
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			for (int x : arr) {
				if (!hm.containsKey(x)) {
					hm.put(x, 1);
				} else {
					hm.put(x, hm.get(x) + 1);
				}
			}
			for (Integer x : hm.keySet()) {
				if (hm.get(x) > 1)
					System.out.println("Duplicate item is " + x);
			}

		}

	}

	// **********REMOVE DUPLICATE WORDS FROM SENTENCE*****************

	public static void removeDuplicatewordSentence(String str, String type) {

		String[] sent = str.split(" ");
		if (type.equals("hash")) {
			HashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
			for (String x : sent) {
				if (!hm.containsKey(x)) {
					hm.put(x, 1);
				} else {
					hm.put(x, hm.get(x) + 1);
				}
			}
			for (String x : hm.keySet()) {
				System.out.print(x + " ");
			}

			for (String x : hm.keySet()) {
				if (hm.get(x) > 1)
					System.out.println("Duplicate item is " + x);
			}
		} else if (type.equals("set")) {
			Set<String> set = new LinkedHashSet<String>();
			for (String x : sent) {
				set.add(x);
			}
			Iterator<String> it = set.iterator();
			while (it.hasNext()) {
				System.out.print(it.next() + " ");
			}

		}
	}

	// **********REVERSE THE NUMBER*****************

	public static void reverseNumber(int number) {
		int result = 0;

		while (number > 0) {
			result = result * 10 + number % 10;
			number = number / 10;
		}
		System.out.println(result);
	}

	// **********FIBONACHI SERIES*****************

	public static void fibonacciSeries(int range, int Infirst, int Insecond) {
		int first = Infirst, second = Insecond;

		for (int i = 1; i <= range; i++) {
			System.out.print(first + " ");
			int third = first + second;
			first = second;
			second = third;
			
			

		}
		String s = "testing";
		System.out.println(s.toCharArray().length);
		System.out.println(s.lastIndexOf(""));
		Matcher m =Pattern.compile("$").matcher(s);
		m.find();
		int len =m.end();
		System.out.println(len);
		System.out.println(s.split("").length);

	}

	// **********FACTORIAL*****************

	public static void factorialOf(int number) {

		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.print(fact + " ");
	}

	// **********PRINT * PYRAMID PATTERN*********

	public static void printPyramid(int number) {
	//	int k = 1;
		for (int i = 1; i <= number; i++) {

			for (int j = 1; j <=i; j++) {
				System.out.print("*" + " ");

			}
			//k = k + 2;
			System.out.println(" ");
		}

	}

}
