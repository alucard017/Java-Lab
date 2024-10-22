public class Pallindrome
{
  public static void main(String[] args)
  {
    String s = args[0];
    int len = s.length();
    boolean flag = true;
    for(int i = 0; i < len/2; i++)
    {
      if(s.charAt(i) != s.charAt(len-i-1))
      {
       flag = false;
       break;
      }
    }
    if(flag)
     System.out.println("String is Pallindrome");
    else
     System.out.println("String is not Pallindrome"); 
  }
}
