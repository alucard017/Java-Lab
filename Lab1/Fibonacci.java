public class Fibonacci
{
  public static void main(String[] args)
  {
    int number = Integer.parseInt(args[0]);
    int N = number;
    int term1 = 0;
    int term2 = 1;
    number-=2;
    System.out.println("Fibonacci Numbers upto " + N + " is: ");
    if(N==1)
    { 
     System.out.println(0);
     return;
    }
    System.out.print(term1+", "+term2+", ");
    int term3 = term1+term2;
    while(number > 0)
    {
      if(number == 1)
       System.out.println(term3);
      else
        System.out.print(term3+", ");
      term1 = term2;
      term2 = term3;
      term3 = term1 + term2;
      number--;
    }
  } 
}
