/* Lyndisty Littell
Professor Covert
CS 250
This is the first lab assignment using methods. This is only a way
to hold the methods, there will be antoher program testing them*/
public class StaticMethods
{
   public static void main( String[] args)
   {
      System.out.println(half(34.5));
      System.out.println(square(45));
      System.out.println(negate(-32));
      System.out.println(getEven(23));
      System.out.println(printMultEqn(-26, 12));
      System.out.println(xor(false, true));
      greet("Billy Joel"); //Note: ("" + greet(Billy Joel)); is a possible cheat to use.
      System.out.println(triple(4));
      System.out.println(threeXplus5(8));
      System.out.println(isOdd(-13));                   
   }
   
   public static double half( double x)// this double the valure given
   {
      return x / 2.0; // dividing by the data type that you want  
   }
   
   public static int square( int z)// this squares the value given
   {
      return z*z;
   }
   
   public static int negate( int v)// this gives a negative value of a number and
   {                               // if it already negative it returns a positive 
      return -v;
   }
   
   public static int getEven( int g)// this is meant to return an an even number
   {                                // no matter the value given. If odd number is
      if (g % 2 == 0)               // given then the next highest even is returned
         return g;
      return g + 1;                 //also be aware that there may need some
   }                                //clarification on specification. Because this 
                                    //could be a lower negative so -5 would end up -6
   public static int printMultEqn( int x, int y)
   {
      System.out.print(x + " * " + y + " = ");
      return x*y;
   }
   
   public static boolean xor( boolean a, boolean b)
   {
      if(a == b)
         return false;
      return true;
   }
   
   public static void greet( String name)
   {
      System.out.println( "Top of the morning to you, " + name);
   }
   
   public static int triple( int p)
   {
      return p * 3;
   }
   
   public static double threeXplus5( double x)
   {
      return (3.0 * x) + 5.0;
   }
   
   public static boolean isOdd( int value)
   {
      if( value % 2 == 0)// could do that this is equal to 1 but have to remeber that
         return false;// you have to have -1 one as well because there would not be
      return true;//a possible solution for odd negative number with positive 1
   }
     
}