public class Searching
{
  public static void main(String[] args)
  {
    int size = args.length-1;
    int[] array = new int[size];
    for(int i = 0; i < size; i++)
    {
      array[i] = Integer.parseInt(args[i]);
    }
    int number = Integer.parseInt(args[args.length-1]);
    if(search(number, array))
     System.out.println("Number found in the given Array");
    else
     System.out.println("Number not found in the given Array");
  }
  public static boolean search(int number, int[] array)
  {
    for(int i = 0; i <array.length; i++)
    { 
     if(array[i] == number)
      return true;
    }
    return false;
  }
}
