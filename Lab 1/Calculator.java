public class Calculator
{
  public static void main(String[] args)
  {
    double number1 = Double.parseDouble(args[0]);
    double number2 = Double.parseDouble(args[1]);
    char ch = args[2].charAt(0);
    double result = 0;
    switch(ch)
    {
      case '+' : System.out.println("Result : " + (number1 + number2));
                 break;
      case '-' : System.out.println("Result : " + (number1 - number2));
                 break;
      case 'x' : System.out.println("Result : " + (number1 * number2));
                 break;
      case '/' : System.out.println("Result : " + (number1 / number2));
                 break;
      case '%' : System.out.println("Result : " + (number1 % number2));
                 break;
      default  : System.out.println("Invalid  Operation");                                              
    }
  }
}
