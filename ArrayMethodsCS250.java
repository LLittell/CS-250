/* Lyndisty Littell
CS 250
Dr. Covert
Lab 2
This is lab exercise for 08/31/2016. These are the programs that were outlined to be done.*/

import java.util.Scanner; // If I feel the need to use it I don't have to come back and do it again

public class ArrayMethodsCS250
{
   public static void main( String[] args)
   {
      int[] intValues = {5, 23, 43, 234, 52};
      
      print(intValues);
      System.out.println("The sum of the values in intValues is " + sum(intValues));
      swap(0, 4, intValues); 
      print(intValues);
   }
   
   public static void print( int[] a) // takes an int array and displays values within
   {
      if( a == null) // make sure that they don't give a null array which is useless
      {
         System.out.println("Can't print null array. Please supply a non-null array");
         return;
      } // end of if statement 
      
      System.out.println("Integar array of size: " + a.length);
      System.out.println("The values stored are as follows:");
      
      for( int i = 0; i < a.length; i++)
      {
         System.out.println(a[i]);
      } // end of for loop
   }// end of method print int array

   public static int sum( int[] a)// this method takes all the values in an array and returns the sum of those values as an int
   {
      int sum = 0;
      
      if( a == null)// null arrays continue to be useless 
      {
         return sum;
      }// end of if statement
      
      for( int i = 0; i < a.length; i++)
      {
         sum = sum + a[i];
      }
      
      return sum;
   }// end method int sum
   
   public static int[] getEmptyArray( int size) // it is returning an array of some size that is given
   {
      int[] a  = new int[size];
      System.out.println("The size of the new empty array is " + a.length);
      return a;
   }// end method int[] getEmptyArray
   
   public static void swap( int i, int j, int[] a)
   {
      if ((a.length - 1 < i) || (a.length - 1 < j) || (0 > i) || (0 > j)) // "Bullet" proofing code so that it will still compile
      {                                                                   // but if value is invalid the user gets a useful note
         System.out.println("The values given exceed the size of the array.");
         return;
      }
      
      int jHolder = a[j];// this is holding the value of position j in the array a till I put it in position i of array a
      
      a[j] = a[i];
      a[i] = jHolder;
   }// end method Swap
}// end class ArrayMethodsCS250