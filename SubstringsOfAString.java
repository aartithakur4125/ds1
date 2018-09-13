import java.util.*;

class SubstringsOfAString
{
   public static void main(String args[])
   {
      String string, sub;
      int i, j, length;
 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string to print it's all substrings");
      string  = in.nextLine();
 
      length = string.length();   
 
      System.out.println("Substrings of \""+string+"\" are:");
 
      for (j = 0; j< length; j++)
      {
         for(i = 1; i <= length - j; i++)
         {
        	 System.out.println(length);
            sub = string.substring(j, j+i);
            System.out.println(sub);
           
         }
      }
   }
}