/* Lyndisty Littell
CS 250
Dr. Covert
This program was designed to use methods with arrays. Such as returning an array of
information or having a method receives an array and make a calculation from that.
This is participation exercises for 09/02/2016 */

import java.util.Scanner; // I might not need this but if I do then I would like to 
                          // have it
public class MethodArrays
{
   public static void main( String[] args)
   {
      int[] intValues = {5, 23, 43, 234, 52};
      double[] doubleValues = {5.1, 23.2, 43.4, 234.3, 52.5, 82.6};
      print(intValues);
      print(doubleValues);
      System.out.println("The sum of the values in intValues is " + sum(intValues));
      System.out.println("The sum of the values in doubleValues is " + sum(doubleValues));
      System.out.println("The average of the values in intValues is " + average(intValues));
      System.out.println("The average of the values in doubleValues is " + average(doubleValues));
      int[] checkValues = getNumberArray(5);
      print(checkValues);
   } // end of main method
   
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
   
   public static void print( double[] a)// takes double array and displays values within
   {
      if( a == null)// null arrays are still useless to me 
      {
         System.out.println("Can't print null array. Please supply a non-null array");
         return;
      }// end of if statement

      System.out.println("Double array of size: " + a.length);
      System.out.println("The values stored are as follows:");
      
      for( int i = 0; i < a.length; i++)
      {
         System.out.println(a[i]);
      }// end of for loop
   }// end of print double[]
   
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
   
   public static double sum( double[] a)// finds the sum of all the values in a doubles array and returns teh sum as a double
   {
      double sum = 0;
      
      if( a == null)// still no use for null arrays and thereby sum is always going to be zero
      {
         return sum; 
      }// end of if statement
      
      for( int i = 0; i < a.length; i++)
      {
         sum = sum + a[i];
      } // end of for loop
      
      return sum;
   } // end method double sum
   
   public static int average( int[] a)
   {
      int average = 0;
      int sum = 0;
      
      if( a == null)// still no use for null arrays and thereby sum is always going to be zero
      {
         return average;
      }// end of if statement
      
      sum = sum(a);
      average = (sum / a.length);
      return average; 
   } // end method int average 
   
   public static double average( double[] a)// calculates the average of the values in an array
   {
     double average = 0;
     double sum = 0;
     
     if( a == null)// at this rate I should just make a nullArray method
     {
         return average; 
     }// end if statement
     
     sum = sum(a);
     average = (sum / a.length);
     return average; 
   }// end method double average 
   
   public static int[] getEmptyArray( int size) // it is returning an array of some size that is given
   {
      int[] a  = new int[size];
      return a;
   }// end method int[] getEmptyArray
   
   public static int[] getNumberArray( int size)// this is putting numbers into an array depending on the value that is given for size
   {
      int[] a = new int[size];
      
      for( int i = 0; i < a.length; i++)
      {
         a[i] = i + 1;
      } 
      
      return a; 
   }// end method int[] getNumberArray
   
}// end of class MethodArrays