public class CheckPrime
{
  public static void main(String[] args)
  {
    int number = Integer.parseInt(args[0]);
    boolean flag = true;
    for(int i = 2; i*i <= number; i++)
    {
      if(number % i == 0)
      {
        flag = false;
        break;
      }
    }
    if(number > 1 && flag == true)
     System.out.println("The Number is Prime");
    else
     System.out.println("The Number is Composite"); 
  }
}
