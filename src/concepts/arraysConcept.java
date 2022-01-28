package concepts;

import java.util.Arrays;
import java.util.Scanner;

public class arraysConcept {

	public static void main(String[] args) {
		  System.out.println("Set Array size");
		  Scanner scan= new Scanner(System.in);
		  int r=scan.nextInt();
           int array[]=new int[r];
           System.out.println("Enter the Array inputs for the size "+r);
         
           for(int i=0; i<r; i++)
           {
        	   System.out.println("Enter "+i+" index value");
        	   array[i]=scan.nextInt(); //Storing in each index
        	   
           }
           
           
           for(int n:array)
             {
        	   Arrays.sort(array);
          	   System.out.println(n+ " sorted array value printed");
             }
           
           
           
           
//           array[0]=10;
//           array[1]=12;
//           array[2]=15;
//           array[3]=20;
//           array[4]=50;
           
//           int arrays[]= {10,20,30};
//           System.out.println(array[1]);
//           
//           for(int i:arrays)
//           {
//        	   System.out.println(i+ " printed");
//           }
        
           
		
	}

}
