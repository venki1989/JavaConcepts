package concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class arraysConcept {

	public static void main(String[] args) {

		//Arrays
		System.out.println("Set Array size");
		try (Scanner scan = new Scanner(System.in)) {
			int r=scan.nextInt();
			int array[]=new int[r];
			System.out.println("Enter the Array inputs for the size "+r);

			for(int i=0; i<r; i++)
			{
				System.out.println("Enter "+i+" index value");
				array[i]=scan.nextInt(); //Storing in each index


			}

			System.out.println(Arrays.toString(array) + " Not Sorted 1D array"); //To get the array out as string and print in sop

			/*
			 * for(int n:array) { System.out.println(n + " sorted array value printed" );
			 * 
			 * }
			 */
			Arrays.sort(array);
			System.out.println(Arrays.toString(array) +" Sorted 1D array"); //To get the array out as string and print in sop
		}


		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(9);
		list.add(45);
		list.add(4);
		list.add(1);
		System.out.println(list + " Not Sorted list array");
		
		Collections.sort(list,Collections.reverseOrder());// to sort ArrayList
		System.out.println(list+" sorted list array ar descending order");
		Collections.sort(list);
		System.out.println(list+" sorted list array as ascending normal sort");



		String s[] = new String[2];
		s[0]="one";
		s[1]="two";

		for (int i=0; i<s.length ;i++)
		{
			System.out.println(s[i]);
		}
		
	       // Initializing the array
        Integer array[] = { 100, 2000, 6737, 3636, 36 };
  
        // Sorting the array in descending order
        Arrays.sort(array, Collections.reverseOrder());
  
        // Printing the elements
        System.out.println(Arrays.toString(array));

	}




}
