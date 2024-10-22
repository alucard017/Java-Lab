public class Factorial
{
 public static void main(String[] args)
 {
   int number = Integer.parseInt(args[0]);
   int factorial = 1;
   int temp = number;
   if(number < 0)
    { 
       System.out.println("Factorial of Negative Numbers doesn't exist");
    }
   else
   {
     while(temp > 0)
     {
       factorial*=temp;
       temp--;
     }
     System.out.println("Factorial of "+number+" is: "+factorial);
   }    
 }
}
