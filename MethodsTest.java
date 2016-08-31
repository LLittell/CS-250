/* Lyndisty Littell
Professor Covert
CS 250
This progam is going to be used to invoke methods from another program. Specifically,
StaticMethods. */

import java.util.Scanner; // this so that it is slightly more interactive and I don't 
                         // want to deal with the arguments line.
                         
public class MethodsTest
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner (System.in);
      int invokerValue = 0; // these are the variables that I'm going to be using for
      int invokerValue2 = 0; // all of the vaulues that I ask for when I envoke
      boolean boolValue = false;
      boolean boolValue2 = false;
      String name = "Phil";
   
      System.out.print("Please enter a value that you would like to have halved: ");
      invokerValue = scan.nextInt();
      System.out.println("Invoking method half from class StaticMethods."); //invoking method half
      System.out.println("Your inital value was: " + invokerValue);
      System.out.println("Your new value is " + StaticMethods.half(invokerValue));
      
      System.out.print("\nPlease enter a value that you would like to be squared: ");
      invokerValue = scan.nextInt();
      System.out.println("Invoking method square from class StaticMethods."); //invoking method square
      System.out.println("Your inital value was: " + invokerValue);
      System.out.println("It is now " + StaticMethods.square(invokerValue));
      
      System.out.println("\nPlease enter a value that you would like to negate");
      System.out.print("(It can be positive or negative): ");
      invokerValue = scan.nextInt();
      System.out.println("Invoking method negate from class StaticMethods."); //invoking method negate
      System.out.println("Your starting value was " + invokerValue);
      System.out.println("It is now " + StaticMethods.negate(invokerValue));
      
      System.out.println("\nThis next method will return to you an even value.");
      System.out.println("If an odd value is entered the it will be rounded up");
      System.out.println("to the next highest even value.");
      System.out.print("Please enter a value: ");
      invokerValue = scan.nextInt();
      System.out.println("Invoking method getEven from class StaticMethods."); //invoking method getEven
      System.out.println("Your choose " + invokerValue);
      System.out.println("It is now " + StaticMethods.getEven(invokerValue));
      
      System.out.print("\nEnter two values (I'm not going to tell you why): ");
      invokerValue = scan.nextInt();
      invokerValue2 = scan.nextInt();
      System.out.println("Invoking method printMultEqn from class StaticMethods."); //invoking printMultEqn
      System.out.print("The result is ");
      System.out.println(StaticMethods.printMultEqn(invokerValue, invokerValue2));
      
      System.out.println("\nDon't forget to scroll up a bit to see the results of");
      System.out.println("the last method!!!"); // The result dissapers because there is not input for the next two methods
      System.out.println("You don't get to interact with this one. Sorry.");
      System.out.println("Invoking method xor from class StaticMethods."); //invoking xor method
      System.out.println("One value was " + boolValue + " and the other was " + boolValue2);
      System.out.println("That makes the overall statement " + StaticMethods.xor(boolValue, boolValue2));

      System.out.println("\nSame goes with this one.");
      System.out.println("The name given was " + name);
      System.out.println("Invoking method greet from class StaticMethods."); //invoking method greet
      StaticMethods.greet(name);
      
      System.out.print("\nEnter one value, please: ");
      invokerValue = scan.nextInt();
      System.out.println("Invoking method triple from class StaticMethods."); //invoking triple method
      System.out.println("The value given was " + invokerValue);
      System.out.println("Which makes the results " + StaticMethods.triple(invokerValue));
      System.out.println("(We simply multiplied the value by 3, hence the name triple)");
      
      System.out.print("\nPlease enter another value for x: ");
      invokerValue = scan.nextInt();
      System.out.println("3(" + invokerValue + ") + 5");
      System.out.println("Invoking method threeXplus5 from class StaticMethods."); //invoking threeXplus5
      System.out.println("The result is " + StaticMethods.threeXplus5(invokerValue));
      
      System.out.print("\nPlease enter a random value of your choosing: ");
      invokerValue = scan.nextInt();
      System.out.println("Invoking method isOdd from class StaticMethods."); //invoking isOdd
      System.out.println("The value entered is Odd: " + StaticMethods.isOdd(invokerValue));
      
      System.out.println("\nThank you for joining me on this adventure and have a");
      System.out.println("a great day!!!");
   }
}
