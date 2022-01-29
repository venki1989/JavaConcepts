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
			
			System.out.println(Arrays.toString(array) + " Not Sorted 1D array");

			/*
			 * for(int n:array) { System.out.println(n + " sorted array value printed" );
			 * 
			 * }
			 */
			Arrays.sort(array);
			System.out.println(Arrays.toString(array) +" Sorted 1D array");
		}
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(9);
		list.add(45);
		list.add(4);
		list.add(1);
		System.out.println(list + " Not Sorted list array");
        Collections.sort(list);
        System.out.println(list+" sorted list array");

	}

}
